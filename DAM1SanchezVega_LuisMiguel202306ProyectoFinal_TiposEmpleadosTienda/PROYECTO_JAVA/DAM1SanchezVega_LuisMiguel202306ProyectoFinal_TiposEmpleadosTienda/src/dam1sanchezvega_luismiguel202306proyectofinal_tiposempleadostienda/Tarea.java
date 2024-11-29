/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1sanchezvega_luismiguel202306proyectofinal_tiposempleadostienda;

import java.util.Objects;
/**
 *
 * @author alumnom
 */
public class Tarea {
    // ATRIBUTOS
    private String nombreTarea;
    private String descripcion;

    // GETTER Y SETTERS
    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // CONSTRUCTOR COMPLETO
     public Tarea(String nombreTarea, String descripcion) {
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
    }

    // CONSTRUCTOR VACIO
     public Tarea() {
        nombreTarea = "";
        descripcion = "";
    }

    // CONSTRUCTOR DE COPIA
     public Tarea(Tarea t) {
        t.setNombreTarea(nombreTarea);
        t.setDescripcion(descripcion);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(nombreTarea, descripcion);
        return hash;
    }
    
    // EQUALS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarea other = (Tarea) obj;
        if (!Objects.equals(this.nombreTarea, other.nombreTarea)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

    // TOSTRING
    @Override
    public String toString() {
        return nombreTarea + ". " + descripcion;
    }
}
