package educarvr.introspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Reader servicioLector(){
      return new BaseDatosRelacional("base gera");

    }

@Bean
    Animal  servicioAnimal(){
        return new Cocodrilo();
}

@Bean
    Usuario servicioAutenticar(){
        return new Directivo();
}


}
