package educarvr.introspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AurreraConfig {

    @Bean
    public Producto miBateria(){
        Bateria bateria=new Bateria("AAA",2.5f);
        bateria.setRecargable(true);
        return bateria;
    }
    @Bean
    public  Producto miDisco(){
        Disco disco=new Disco("CD-WR", 1.5f);
        disco.setCapacidad(700);
        return disco;
    }
}
