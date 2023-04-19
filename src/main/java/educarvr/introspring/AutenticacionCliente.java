package educarvr.introspring;

public class AutenticacionCliente implements Autenticacion{
    @Override
    public void autenticar(String login, String password) {
        System.out.println("Autenticacion cliente con login de cliente "+login);
    }
}
