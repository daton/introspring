package educarvr.introspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecuenciaGeneradorConfig {


    @Bean
    public DatePrefixGenerator datePrefixGenerator(){
        DatePrefixGenerator datePrefixGenerator=new DatePrefixGenerator();
        datePrefixGenerator.setPattern("yyyyMMdd");
        return datePrefixGenerator;
    }
    @Bean
    public  SecuenciaNumeros secuenciaNumeros(){
        SecuenciaNumeros secuenciaNumeros=new SecuenciaNumeros();
        secuenciaNumeros.setPrefijo("30");
        secuenciaNumeros.setSufijo("A");
        secuenciaNumeros.setInicial(10000);
        secuenciaNumeros.setPrefixGenerator(datePrefixGenerator());
        return  secuenciaNumeros;
    }
}
