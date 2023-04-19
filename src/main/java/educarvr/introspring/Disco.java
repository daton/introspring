package educarvr.introspring;

public class Disco extends Producto{
    private  int capacidad;

    public Disco(String nombre, float precio) {
        super(nombre, precio);
    }

    public int capacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
