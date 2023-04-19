package educarvr.introspring;

public interface SecuenciaDao {
    public Secuencia getSecuencia(String secuenciaId);
    public  int getProximoVal(String secuenciaId);
}
