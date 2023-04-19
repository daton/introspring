package educarvr.introspring;

public  class ComportamientoNoAgresivo implements ComportamientoDeAgresividad {
    @Override
    public void informarGradoDeAgresividad() {
        System.out.println("ESte animalito no es agresivo");
    }
}
