package educarvr.introspring;

public class Usuario {
   private  String login;
   private  String password;

   Autenticacion autenticacion;

   public void autenticar(String login, String password){
       autenticacion.autenticar(login, password);
   }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
