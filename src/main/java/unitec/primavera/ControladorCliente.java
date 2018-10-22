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

public class ControladorCliente {
    @Autowired RepositorioCliente cliente;
      
    //BUSCAR TODOS
    @GetMapping(path="/cliente") //el nombre de la entidad en mayusculas, metodo GET
    public List<Cliente> todos(){
        return cliente.findAll();//muestra todos los registros de mLab
    }
    
    //BUSCAMOS POR ID
    @GetMapping("/cliente/{id}") //entidad==(/mensaje) //{id}==variable, usuario proporciona el {id}
    public Cliente buscarPorId(@PathVariable String id){//Variable de ruta de URI==PathVariable, el id de esta linea debe ser el mismo que el {id}
        return cliente.findById(id).get();
    }
    
    //VAMOS A GUARDAR PARA ELLO SIEMPRE SE OCUPA EL "POST"
    @PostMapping(path="/cliente",consumes="application/json") //json consume la info
    public Estatus guardar(@RequestBody String json) throws Exception{ //lleva retorno //Reqbody=
    //Recibimos al json
        ObjectMapper maper=new ObjectMapper(); //creamos una clase //Mapper=lleva un objeto json a un java
        Cliente cli = maper.readValue(json, Cliente.class);
        System.out.println(cli);
        Estatus estatus =new Estatus();
        estatus.setSuccess(true);
        estatus.setMensaje("Cliente guardado con exito");
        return estatus;
        
    }
}
