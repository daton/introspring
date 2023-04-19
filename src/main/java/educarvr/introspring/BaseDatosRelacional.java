package educarvr.introspring;

public class BaseDatosRelacional implements Reader{
    String nombreBaseDatos;

    public BaseDatosRelacional(String nombreBaseDatos) {
        this.nombreBaseDatos = nombreBaseDatos;
    }

    @Override
    public String leer() {
        return "Leyendo de una base de datos relacional";
    }
}
