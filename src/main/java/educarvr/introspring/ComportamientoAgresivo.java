package educarvr.introspring;

public class ComportamientoAgresivo implements ComportamientoDeAgresividad{
    @Override
    public void informarGradoDeAgresividad() {
        System.out.println("Este animalito si es agresivo");
    }
}
