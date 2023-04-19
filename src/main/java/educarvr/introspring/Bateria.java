package educarvr.introspring;

public class Bateria extends Producto{
    private  boolean recargable;

    public Bateria() {
        super();
    }

    public Bateria(String nombre, float precio) {
        super(nombre, precio);
    }

    public boolean recargable() {
        return recargable;
    }

    public void setRecargable(boolean recargable) {
        this.recargable = recargable;
    }
}
