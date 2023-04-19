package educarvr.introspring;

public class Animal {

   private int  peso;
   private  int altura;
    ComportamientoDeAgresividad gradoDeAgresividad;
    HabitosAlimenticios habitosComida;


   public void informarGradoDeAgresividad(){
       gradoDeAgresividad.informarGradoDeAgresividad();

   }
   public void indicarQueCome(){
       habitosComida.indicarQueCome();

   }



    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
