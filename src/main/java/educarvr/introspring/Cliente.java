package educarvr.introspring;

public class Cliente extends  Usuario{

    public  Cliente(){
        this.autenticacion=new AutenticacionCliente();
    }
}
