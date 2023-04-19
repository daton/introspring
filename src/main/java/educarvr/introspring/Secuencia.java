package educarvr.introspring;

public class Secuencia {

    private final String id;
    private  final String prefijo;
    private final String sufijo;


    public Secuencia(String id, String prefijo, String sufijo) {
        this.id = id;
        this.prefijo = prefijo;
        this.sufijo = sufijo;
    }

    public String getId() {
        return id;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public String getSufijo() {
        return sufijo;
    }
}
