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
public class EmpleadoAlmacen extends Empleado{
    // ATRIBUTOS
    private Almacen almacen; // Letra identificativa del Almacen
    
    // GETTERS Y SETTERS
    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
    // CONSTRUCTOR COMPLETO
    public EmpleadoAlmacen(String nombre, String direccion, double salario, LinkedList<Tarea> tareas, Almacen almacen) {
        super(nombre, direccion, salario, tareas);
        this.almacen = almacen;
    }

    // CONSTRUCTOR VACIO
    public EmpleadoAlmacen() {
        super();
        almacen = new Almacen();
    }
    
    // CONSTRUCTOR DE COPIA
    public EmpleadoAlmacen(EmpleadoAlmacen p){
        super(p);
        p.setAlmacen(almacen);
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        super.hashCode();
        int hash;
        hash = Objects.hash(almacen);
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
        final EmpleadoAlmacen other = (EmpleadoAlmacen) obj;
        return this.almacen == other.almacen;
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return super.toString() + " trabaja en el Almacén: " + almacen;
    }
    
    // Otros métodos
    @Override
    public String trabajo(){
        String trabajo = "El empleado " + getNombre() + " está trabajando en el Almacén " + almacen.getLetraIdentificativa() + " con las tareas por realizar: " + getTareas();
        return trabajo;
    }
}
