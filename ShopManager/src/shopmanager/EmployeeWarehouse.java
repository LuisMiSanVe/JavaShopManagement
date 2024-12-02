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
public class EmployeeWarehouse extends Employee{
    // ATTRIBUTES
    private Warehouse warehouse;
    
    // GETTERS AND SETTERS
    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    
    // COMPLETE BUILDER
    public EmployeeWarehouse(String name, String direction, double salary, LinkedList<Task> tasks, Warehouse warehouse) {
        super(name, direction, salary, tasks);
        this.warehouse = warehouse;
    }

    // EMPTY BUILDER
    public EmployeeWarehouse() {
        super();
        warehouse = new Warehouse();
    }
    
    // COPY BUILDER
    public EmployeeWarehouse(EmployeeWarehouse p){
        super(p);
        p.setWarehouse(warehouse);
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        super.hashCode();
        int hash;
        hash = Objects.hash(warehouse);
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
        final EmployeeWarehouse other = (EmployeeWarehouse) obj;
        return this.warehouse == other.warehouse;
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return super.toString() + " works at the Warehouse: " + warehouse;
    }
    
    // Other methods
    @Override
    public String work(){
        String work = "The employee " + getName() + " is working in the Warehouse " + warehouse.getIdLetter() + " with the tasks to do: " + getTasks();
        return work;
    }
}
