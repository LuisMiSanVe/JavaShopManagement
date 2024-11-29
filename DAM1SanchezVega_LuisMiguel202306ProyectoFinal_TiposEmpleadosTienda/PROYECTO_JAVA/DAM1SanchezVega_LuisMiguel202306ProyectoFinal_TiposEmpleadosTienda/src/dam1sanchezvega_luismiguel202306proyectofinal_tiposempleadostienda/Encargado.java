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
public class Encargado extends Empleado{
    // ATRIBUTOS
    private Departamento departamento; // Tipo de departamento en el que gestiona el trabajo (Departamento de Recursos humanos, de Plantilla de empleados, de Ventas...)

    // GETTERS Y SETTERS
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    // CONSTRUCTOR COMPLETO

    public Encargado(String nombre, String direccion, double salario, LinkedList<Tarea> tareas, Departamento departamento) {
        super(nombre, direccion, salario, tareas);
        this.departamento = departamento;
    }

    // CONSTRUCTOR VACIO
    public Encargado() {
        super();
        departamento = new Departamento();
    }

    // CONSTRUCTOR DE COPIA
    public Encargado(Encargado p) {
        super(p);
        p.setDepartamento(p.getDepartamento());
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(departamento);
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
        final Encargado other = (Encargado) obj;
        return Objects.equals(this.departamento, other.departamento);
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return super.toString() + " gestiona el departamento " + departamento.getNombreDepart();
    }
    
    // Otros métodos
    @Override
    public String trabajo(){
        String trabajo = "El encargado " + getNombre() + " está supervisando al departamento " + departamento.getNombreDepart() + " con las tareas por realizar: " + getTareas();
        return trabajo;
    }
}
