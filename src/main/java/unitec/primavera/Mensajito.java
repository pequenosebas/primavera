/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Mensajito {
    //clases ENTIDAD
    
    @Id
    private String id;
    private String titulo;
    private String cuerpo;
    private LocalDate fecha;

    public Mensajito(String id, String titulo, String cuerpo, LocalDate fecha) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Mensajito{" + "id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", fecha=" + fecha + '}';
    }

    //Constructor solo
    public Mensajito() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //Constructor, todos menos el ID
    public Mensajito(String titulo, String cuerpo, LocalDate fecha) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
}
