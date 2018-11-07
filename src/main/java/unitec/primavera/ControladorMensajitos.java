/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api")//empieza la construccion del API
@CrossOrigin(origins ={"https://angular-qeqg4u.stackblitz.io"})//permitira el uso de la conexion al dominio

public class ControladorMensajitos {
    @Autowired RepositorioMensajes mensa;
    
    
    //MI PRIMER HOLA MUNDO DESDE REST-API CON SPRING
    @GetMapping(path="/hola")
    public String hola(){
        return "Hola Mundo";//servicio que sera mapeado, a solo lectura
    }
    
    //BUSCAR TODOS
    @GetMapping(path="/mensaje") //el nombre de la entidad en mayusculas, metodo GET
    public List<Mensajito> todos(){
        return mensa.findAll();//muestra todos los registros de mLab
    }
    
    //BUSCAMOS POR ID
    @GetMapping("/mensaje/{id}") //entidad==(/mensaje) //{id}==variable, usuario proporciona el {id}
    public Mensajito buscarPorId(@PathVariable String id){//Variable de ruta de URI==PathVariable, el id de esta linea debe ser el mismo que el {id}
        return mensa.findById(id).get();
    }
    
    //VAMOS A GUARDAR PARA ELLO SIEMPRE SE OCUPA EL "POST"
    @PostMapping(path="/mensaje",consumes="application/json") //json consume la info
    public Estatus guardar(@RequestBody String json) throws Exception{ //lleva retorno //Reqbody=
    //Recibimos al json
        ObjectMapper maper=new ObjectMapper(); //creamos una clase //Mapper=lleva un objeto json a un java
        Mensajito mensajito = maper.readValue(json, Mensajito.class);
        System.out.println(mensajito);
        Estatus estatus =new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Mensaje guardado con exito");
        return estatus;
        
    }
}
