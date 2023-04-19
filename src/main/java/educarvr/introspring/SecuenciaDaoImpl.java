package educarvr.introspring;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component("secuenciaDao")
public class SecuenciaDaoImpl  implements  SecuenciaDao{

    private final Map<String, Secuencia> secuencias=new HashMap<>();
    private final Map<String, AtomicInteger> valores=new HashMap<>();

    public  SecuenciaDaoImpl(){
        secuencias.put("IT",new Secuencia("IT","30","A"));
        valores.put("IT",new AtomicInteger(10000));
    }
    @Override
    public Secuencia getSecuencia(Secuencia secuenciaId) {
        return secuencias.get(secuenciaId);
    }

    @Override
    public int getProximoVal(String secuenciaId) {
        AtomicInteger valor=valores.get(secuenciaId);
        return valor.getAndIncrement();
    }
}
