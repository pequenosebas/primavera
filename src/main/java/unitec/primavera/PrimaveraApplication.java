package unitec.primavera;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner{ //para ejecutar los system.out.ln

    
	public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
                
                
	}

    @Override //En el run se debe de hacer todo lo de las tarjetas
    public void run(String... args) throws Exception {
        System.out.println("Hola Mundo"); //Hola Mundo en MongoDB
    }
}
