/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopmanager;

import java.util.HashMap;
import java.util.Objects;
/**
 *
 * @author LuisMiSanVe
 */
public class Warehouse {
    // ATTRIBUTES
    private Manager managerWarehouse;
    private char idLetter;

    // GETTERS AND SETTERS
    public Manager getManagerWarehouse() {
        return managerWarehouse;
    }

    public void setManagerWarehouse(Manager managerWarehouse) {
        this.managerWarehouse = managerWarehouse;
    }
    
    public char getIdLetter() {
        return idLetter;
    }

    public void setIdLetter(char idLetter) {
        this.idLetter = idLetter;
    }

    // COMPLETE BUILDER
    public Warehouse(Manager managerWarehouse, char idLetter) {
        this.managerWarehouse = managerWarehouse;
        this.idLetter = idLetter;
    }
    
    // EMPTY BUILDER
    public Warehouse(){
        managerWarehouse = new Manager();
        idLetter = ' ';
    }
    
    // COPY BUILDER
    public Warehouse(Warehouse a){
        a.setManagerWarehouse(managerWarehouse);
        a.setIdLetter(idLetter);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(managerWarehouse, idLetter);
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
        final Warehouse other = (Warehouse) obj;
        if (this.idLetter != other.idLetter) {
            return false;
        }
        return Objects.equals(this.managerWarehouse, other.managerWarehouse);
    }
    

    // TOSTRING
    @Override
    public String toString() {
        return "Warehouse " + idLetter;
    }
}
