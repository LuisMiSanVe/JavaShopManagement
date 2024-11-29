/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1sanchezvega_luismiguel202306proyectofinal_tiposempleadostienda;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
/**
 *
 * @author alumnom
 */
public class Tienda {
    // ATRIBUTOS
    private String nombreTienda;
    private HashMap<Integer, Empleado> listaEmpleados;
    private LinkedList<Departamento> departamentosTienda;
    private Gerente gerenteTienda;

    // GETTERS Y SETTERS
    public String getNombreTienda(){
        return nombreTienda;
    }
    
    public void setNombreTienda(String nombreTienda){
        this.nombreTienda = nombreTienda;
    }
    
    public HashMap<Integer, Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(HashMap<Integer, Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public LinkedList<Departamento> getDepartamentosTienda() {
        return departamentosTienda;
    }

    public void setDepartamentosTienda(LinkedList<Departamento> departamentosTienda) {
        this.departamentosTienda = departamentosTienda;
    }

    public Gerente getGerenteTienda() {
        return gerenteTienda;
    }

    public void setGerenteTienda(Gerente gerenteTienda) {
        this.gerenteTienda = gerenteTienda;
    }

    // CONSTRUCTOR COMPLETO
    public Tienda(String nombreTienda, HashMap<Integer, Empleado> listaEmpleados, LinkedList<Departamento> departamentosTienda, Gerente gerenteTienda) {
        this.nombreTienda = nombreTienda;
        this.listaEmpleados = listaEmpleados;
        this.departamentosTienda = departamentosTienda;
        this.gerenteTienda = gerenteTienda;
    }
    
    // CONSTRUCTOR VACIO
    public Tienda(){
        nombreTienda = "";
        listaEmpleados = new HashMap<>();
        departamentosTienda = new LinkedList<>();
        gerenteTienda = new Gerente();
    }
    
    // CONSTRUCTOR DE COPIA
    public Tienda(Tienda t){
        t.setNombreTienda(nombreTienda);
        t.setListaEmpleados(listaEmpleados);
        t.setDepartamentosTienda(departamentosTienda);
        t.setGerenteTienda(gerenteTienda);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(nombreTienda,listaEmpleados, departamentosTienda, gerenteTienda);
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
        final Tienda other = (Tienda) obj;
        if (!Objects.equals(this.nombreTienda, other.nombreTienda)) {
            return false;
        }
        if (!Objects.equals(this.listaEmpleados, other.listaEmpleados)) {
            return false;
        }
        if (!Objects.equals(this.departamentosTienda, other.departamentosTienda)) {
            return false;
        }
        return Objects.equals(this.gerenteTienda, other.gerenteTienda);
    }
    

    // TOSTRING
    @Override
    public String toString() {
        return "Tienda '" + nombreTienda + "' con Gerente: " + gerenteTienda.getNombre();
    }
}
