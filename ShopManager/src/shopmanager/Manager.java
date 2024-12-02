/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopmanager;

import java.util.LinkedList;
import java.util.Objects;
/**
 *
 * @author LuisMiSanVe
 */
public class Manager extends Supervisor{
    // ATTRIBUTES
    private String managementType;

    // GETTERS AND SETTERS
    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }
    
    // COMPLETE BUILDER
    public Manager(String name, String direction, double salary, LinkedList<Task> tasks, Department department, String managementType) {
        super(name, direction, salary, tasks, department);
        this.managementType = managementType;
    }

    // EMPTY BUILDER
    public Manager() {
        super();
        managementType = "";
    }

    // COPY BUILDER
    public Manager(Manager p) {
        super(p);
        p.setManagementType(managementType);
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        super.hashCode();
        int hash;
        hash = Objects.hash(managementType);
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
        final Manager other = (Manager) obj;
        return Objects.equals(this.managementType, other.managementType);
    }

    // TOSTRING
    @Override
    public String toString() {
        return super.toString() + " and manages " + managementType;
    }
    
    // Other methods
    @Override
    public String work(){
        String work = "The manager " + getNombre() + " is managing the " + managementType + " of the shop with the tasks to do: " + getTasks();
        return work;
    }
}
