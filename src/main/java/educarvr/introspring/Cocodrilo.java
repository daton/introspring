package educarvr.introspring;

public class Cocodrilo extends Animal{

    public  Cocodrilo(){
        this.gradoDeAgresividad=new ComportamientoAgresivo();
        this.habitosComida=new HabitosAlimenticiosCarnivoros();


    }
}
