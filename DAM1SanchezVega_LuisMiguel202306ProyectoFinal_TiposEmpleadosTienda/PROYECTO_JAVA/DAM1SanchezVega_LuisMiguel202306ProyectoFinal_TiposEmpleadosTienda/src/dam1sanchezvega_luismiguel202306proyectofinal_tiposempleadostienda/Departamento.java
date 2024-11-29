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
public class Departamento {
    // ATRIBUTOS
    private LinkedList<Tarea> tareasDepart;
    private String nombreDepart;

    // GETTERS Y SETTERS
    public LinkedList<Tarea> getTareasDepart() {
        return tareasDepart;
    }

    public void setTareasDepart(LinkedList<Tarea> tareasDepart) {
        this.tareasDepart = tareasDepart;
    }

    public String getNombreDepart() {
        return nombreDepart;
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }
    
    // CONSTRUCTOR COMPLETO
    public Departamento(LinkedList<Tarea> tareasDepart, String nombreDepart) {
        this.tareasDepart = tareasDepart;
        this.nombreDepart = nombreDepart;
    }
    
    // CONSTRUCTOR VACIO
    public Departamento(){
        tareasDepart = new LinkedList<>();
        nombreDepart = "";
    }
    
    // CONSTRUCTOR DE COPIA
    public Departamento(Departamento d){
        d.setTareasDepart(tareasDepart);
        d.setNombreDepart(nombreDepart);
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(nombreDepart, tareasDepart);
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
        final Departamento other = (Departamento) obj;
        if (!Objects.equals(this.nombreDepart, other.nombreDepart)) {
            return false;
        }
        return Objects.equals(this.tareasDepart, other.tareasDepart);
    }
    
    // TOSTRING
    @Override
    public String toString() {
        return "Departamento{" + "tareasDepart=" + tareasDepart + ", nombreDepart=" + nombreDepart + '}';
    }
}
