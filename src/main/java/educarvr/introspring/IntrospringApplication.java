package educarvr.introspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IntrospringApplication implements CommandLineRunner {

@Autowired
Reader reader;

@Autowired
Animal animal;

@Autowired
Usuario usuario;

@Autowired
SecuenciaDao dao;

@Autowired
Producto miBateria;

	@Autowired
	Producto miDisco;



	public static void main(String[] args) {
		SpringApplication.run(IntrospringApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Vamos a ver si funciona...");

		//ApplicationContext context=new AnnotationConfigApplicationContext(SecuenciaDaoImpl.class);
	//SecuenciaDaoImpl numeros= (SecuenciaDaoImpl) context.getBean("secuenciaDao");
		//System.out.println(dao.getProximoVal("IT"));
		//System.out.println(dao.getProximoVal("IT"));
	//	System.out.println(numeros.getSecuencia());

	//	System.out.println(reader.leer());
	//	animal.informarGradoDeAgresividad();

	//	usuario.autenticar("logincillo","yyy");
		//System.out.println(miBateria);
	//	System.out.println(miDisco);
		System.out.println(dao.getProximoVal("IT"));


	}
}
