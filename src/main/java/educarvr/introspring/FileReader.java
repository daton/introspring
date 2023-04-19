package educarvr.introspring;

public class FileReader implements Reader{
    private String url;

    public FileReader(String url) {
        this.url = url;
    }

    @Override
    public String leer() {
        return "Leyendo desde un archivo de datos";
    }
}
