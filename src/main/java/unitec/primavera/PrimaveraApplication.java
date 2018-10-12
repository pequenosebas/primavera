package unitec.primavera;

import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner{ //para ejecutar los system.out.ln
    
    @Autowired RepositorioPagos repoPagos;
    @Autowired RepositorioMensajes repoMensa;

    
	public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
                
                
	}

    @Override //En el run se debe de hacer todo lo de las tarjetas
    public void run(String... args) throws Exception {
        System.out.println("Hola Mundo"); //Hola Mundo en MongoDB
        //repoPagos.servicioPagar();
        
        //GUARDA UN MENSAJE. CADA QUE SE GUARDA EL ARCHIVO SE ACTUALIZA
        //repoMensa.save(new Mensajito("bienvenido","usuario", LocalDate.now()));
        
        //BUSCAMOS TODOS LOS MENSAJES
        //for(Mensajito mensa: repoMensa.findAll()){//FindAll==busca en <Array> de mensajito donde se tienen los datos--- mensa: for mejorado
        //System.out.println(mensa);//imprimira la direccion de memoria
            
        //BUSCAMOS POR ID
        //System.out.println(repoMensa.findById("5bb41cbc7eb5891d7c18e699").get());
        
        //BUSCAR POR TITULO
        //System.out.println(repoMensa.findByTitulo("hola"));
        
       //ACTUALIZAR                  id , titulo , cuerpo 
       //repoMensa.save(new Mensajito("malo","yo","topoyiya", LocalDate.now()));
       //System.out.println(repoMensa.findByTitulo("yo"));
        
        //BORRAR
        //System.out.println(repoMensa.deleteById("5bb41cbc7eb5891d7c18e699"));
        }
            
        
    }
//NO DEBE DE CAMBIAR EL MAIN