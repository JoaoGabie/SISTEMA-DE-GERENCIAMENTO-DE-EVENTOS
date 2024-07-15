import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Eventos {
    private String nomeEvento;
    private String endereco;
    private LocalDateTime dataHora;
    private String descricao;

    public Eventos(String nomeEvento, String endereco, LocalDateTime dataHora, String descricao) {
        this.nomeEvento = nomeEvento;
        this.endereco = endereco;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }


    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }
// ----------------------------------------------------------------

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toFileStringEvents() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return nomeEvento + " | " + endereco + " | " + dataHora.format(formatter) + " | " + descricao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String s = "Evento: " + nomeEvento + "\nEndereço: " + endereco + "\nData e Horário: " + dataHora.format(formatter) + "\nDescrição: " + descricao;
        return s;
    }


    //Metodo para visualizar os Eventos cadastrados

    public static void visualizarEventos() {
        String filePath = "Data/DataEvento.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Eventos cadastrados:");
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("@");
                System.out.println("Nome do Evento: " + parts[0]);
                System.out.println("Endereço: " + parts[1]);
                System.out.println("Data e Hora: " + parts[2]);
                System.out.println("Descrição: " + parts[3]);
                System.out.print("\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados do Evento, clique enter para continuar .");
            e.printStackTrace();
        }
    }

    //Metodo para deletar eventos Registrados

    public static void deleteEvents(String nomeEvento) {
        String filePath = "Data/DataEvento.txt";
        List<String> lines = new ArrayList<>();
        boolean userFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("@");
                if (parts[0].equals(nomeEvento)) {
                    userFound = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados do usuário.");
            e.printStackTrace();
            return;
        }
        if (!userFound) {
            System.out.println("Usuário não encontrado.");
            return;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever os dados do Evento.");
            e.printStackTrace();
        }

        System.out.println("Eventos1 excluído com sucesso.");
    }
}