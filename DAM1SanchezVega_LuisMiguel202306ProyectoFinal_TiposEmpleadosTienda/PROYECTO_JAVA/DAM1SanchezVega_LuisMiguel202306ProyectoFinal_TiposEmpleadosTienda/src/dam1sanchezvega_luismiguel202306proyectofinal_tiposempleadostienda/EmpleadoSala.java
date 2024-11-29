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
public class EmpleadoSala extends Empleado{
    // ATRIBUTOS
    private String puesto; // Qué trabajo realiza en Sala (reponedor, caja...)

    // GETTERS Y SETTERS
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    // CONSTRUCTOR COMPLETO

    public EmpleadoSala(String nombre, String direccion, double salario, LinkedList<Tarea> tareas, String puesto) {
        super(nombre, direccion, salario, tareas);
        this.puesto = puesto;
    }

    // CONSTRUCTOR VACIO
    public EmpleadoSala() {
        super();
        puesto = "";
    }

    // CONSTRUCTOR DE COPIA
    public EmpleadoSala(EmpleadoSala p) {
        super(p);
        setPuesto(p.getPuesto());
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        super.hashCode();
        int hash;
        hash = Objects.hash(puesto);
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
        final EmpleadoSala other = (EmpleadoSala) obj;
        return Objects.equals(this.puesto, other.puesto);
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return super.toString() + " trabaja en el puesto de " + puesto;
    }
    
    // Otros métodos
    @Override
    public String trabajo(){
        String trabajo = "El empleado " + getNombre() + " está trabajando en la tienda en el puesto de " + puesto + " con las tareas por realizar: " + getTareas();
        return trabajo;
    }
}
