import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public LocalDateTime getDataHora() {return dataHora;}

    public String getDescricao() {return descricao;}
// ----------------------------------------------------------------

    public void setNomeEvento(String nomeEvento) { this.nomeEvento = nomeEvento; }

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
        return nomeEvento + "," + endereco + "," + dataHora.format(formatter) + "," + descricao;
    }

         @Override
        public String toString() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            String s = "Evento: " + nomeEvento + "\nEndereço: " + endereco + "\nData e Horário: " + dataHora.format(formatter) + "\nDescrição: " + descricao;
            return s;
    }
}