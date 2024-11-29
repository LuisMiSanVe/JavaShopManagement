/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1sanchezvega_luismiguel202306proyectofinal_tiposempleadostienda;

import java.util.LinkedList;
import java.util.Objects;
/**
 *
 * @author alumnom
 */
public class Gerente extends Encargado{
    // ATRIBUTOS
    private String tipoGestion; //Gestion de comercio, stock y atencion al cliente

    // GETTERS Y SETTERS
    public String getTipoGestion() {
        return tipoGestion;
    }

    public void setTipoGestion(String tipoGestion) {
        this.tipoGestion = tipoGestion;
    }
    
    // CONSTRUCTOR COMPLETO

    public Gerente(String nombre, String direccion, double salario, LinkedList<Tarea> tareas, Departamento departamento, String tipoGestion) {
        super(nombre, direccion, salario, tareas, departamento);
        this.tipoGestion = tipoGestion;
    }

    // CONSTRUCTOR VACIO
    public Gerente() {
        super();
        tipoGestion = "";
    }

    // CONSTRUCTOR DE COPIA
    public Gerente(Gerente p) {
        super(p);
        p.setTipoGestion(tipoGestion);
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        super.hashCode();
        int hash;
        hash = Objects.hash(tipoGestion);
        return hash;
    }
    
    // EQUALS
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gerente other = (Gerente) obj;
        return Objects.equals(this.tipoGestion, other.tipoGestion);
    }

    // TOSTRING
    @Override
    public String toString() {
        return super.toString() + " y se encarga de " + tipoGestion;
    }
    
    // Otros métodos
    @Override
    public String trabajo(){
        String trabajo = "El gerente " + getNombre() + " está gestionando el " + tipoGestion + " de la tienda con las tareas por realizar: " + getTareas();
        return trabajo;
    }
}
