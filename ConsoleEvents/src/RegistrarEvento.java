import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class RegistrarEvento {
    private  Scanner scanner;

    public RegistrarEvento(){this.scanner = new Scanner(System.in);}

    public Eventos methodCapturarDadosEventos(){
        System.out.print("Digite o Nome do Evento: ");
        String nomeEvento  = scanner.nextLine();

        System.out.print("Digite o Endereco do Evento: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite a data e horário do evento (dd-MM-yyyy HH:mm): ");
        String dataHoraString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraString, formatter);

        System.out.print("Digite a Descrição do Evento: ");
        String descricao = scanner.nextLine();

        Eventos evento = new Eventos(nomeEvento, endereco, dataHora, descricao);
        System.out.println("Evento criado: ");
        System.out.println(evento.toString());

        boolean isWritten = saveEventToFile(evento);
        System.out.println("Evento salvo no arquivo: " + isWritten);
        return evento;
    }
    public boolean saveEventToFile(Eventos evento) {
        String caminho2 = "Data/DataEvento.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminho2, true))) {
            writer.println(evento.toFileStringEvents());
            System.out.println("Usuário salvo com sucesso no arquivo " + caminho2+"\n");
            return true;
        } catch (IOException e) {
            System.err.println("Erro ao salvar usuário no arquivo " + caminho2 + ": " + e.getMessage());
            return false;
        }
    }
}
