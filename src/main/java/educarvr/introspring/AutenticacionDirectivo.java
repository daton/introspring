package educarvr.introspring;
//waisem
public class AutenticacionDirectivo implements Autenticacion{
    @Override
    public void autenticar(String login, String password) {
        System.out.println("Autenticando un directivo con login "+login);
    }
}
