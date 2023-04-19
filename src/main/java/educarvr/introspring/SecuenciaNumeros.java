package educarvr.introspring;

import java.util.concurrent.atomic.AtomicInteger;

public class SecuenciaNumeros {


    private  PrefixGenerator prefixGenerator;

    private String prefijo;
    private String sufijo;
    private int inicial;
    private final AtomicInteger contador=new AtomicInteger();

    public String getPrefijo() {
        return prefijo;
    }

    public SecuenciaNumeros(String prefijo, String sufijo, int inicial) {
        this.prefijo = prefijo;
        this.sufijo = sufijo;
        this.inicial = inicial;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public void setPrefixGenerator(PrefixGenerator prefixGenerator){
        this.prefixGenerator=prefixGenerator;
    }

    public String getSufijo() {
        return sufijo;
    }

    public void setSufijo(String sufijo) {
        this.sufijo = sufijo;
    }

    public int getInicial() {
        return inicial;
    }

    public void setInicial(int inicial) {
        this.inicial = inicial;
    }



    public  SecuenciaNumeros(){

    }

    public  String getSecuencia(){
        StringBuilder builder=new StringBuilder();
        builder.append(prefijo)
                .append(inicial)
                .append(contador.getAndIncrement())
                .append(sufijo);
        return builder.toString();

    }
}
