
public class Usuario {

    private static int proximoID = 1;
    private int ID;
    private String Nome;
    private String Sobrenome;
    private String email;
    private String Password;
    private String Cidade;



    public Usuario(String Nome, String Sobrenome, String email, String Password, String Cidade) {

        this.ID = proximoID++;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.email = email;
        this.Password = Password;
        this.Cidade = Cidade;
        }


        public int GetID() {
            return ID;
        }

        public String GetNomeCompleto() {
            return Nome + " " + Sobrenome;
        }

        public String GetEmail() {
            return email;
        }

        public String GetPassword() {
            return Password;
        }

        public String GetCidade() {
            return Cidade;
        }

 // ----------------------------------------------------------------

        public void SetID(int ID) {
            this.ID = proximoID++;
        }

        public void SetNome(String Nome) {
            this.Nome =  Nome;
        }

        public void SetSobrenome (String Nome){
            this.Sobrenome = Sobrenome;
        }

        public void SetEmail(String email) {
            this.email = email;
        }

        public void SetPassword(String Password) {
            this.Password = Password;
        }

        public void SetCidade(String Cidade) {
            this.Cidade = Cidade;
        }
}

