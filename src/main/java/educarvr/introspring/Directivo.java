package educarvr.introspring;

public class Directivo extends Usuario{

    public  Directivo(){
        this.autenticacion=new AutenticacionDirectivo();
    }
}
