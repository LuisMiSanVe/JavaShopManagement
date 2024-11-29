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
public abstract class Empleado {
    // ATRIBUTOS
    private String nombre;
    private String direccion;
    private double salario;
    private LinkedList<Tarea> tareas;

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public LinkedList<Tarea> getTareas() {
        return tareas;
    }
    
    public void setTareas(LinkedList<Tarea> tareas){
        this.tareas = tareas;
    }
    
    // CONSTRUCTOR COMPLETO
    public Empleado(String nombre, String direccion, double salario, LinkedList<Tarea> tareas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
        this.tareas = tareas;
    }

    // CONSTRUCTOR VACIO
    public Empleado() {
        nombre = "";
        direccion = "";
        salario = 0;
        tareas = new LinkedList<>();
    }
    
    // CONSTRUCTOR DE COPIA
    public Empleado(Empleado p){
        p.setNombre(p.getNombre());
        p.setDireccion(p.getDireccion());
        p.setSalario(p.getSalario());
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash;
        hash = Objects.hash(nombre, direccion, salario);
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
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return "El empleado " + nombre + " con dirección " + direccion + " que cobra " + salario + " €";
    }
    
    // Otros métodos
    public abstract String trabajo();
}
