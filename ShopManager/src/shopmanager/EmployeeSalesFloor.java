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
public class EmployeeSalesFloor extends Employee{
    // ATTRIBUTES
    private String position;

    // GETTERS AND SETTERS
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    // COMPLETE BUILDER
    public EmployeeSalesFloor(String name, String direction, double salary, LinkedList<Task> tasks, String position) {
        super(name, direction, salary, tasks);
        this.position = position;
    }

    // EMPTY BUILDER
    public EmployeeSalesFloor() {
        super();
        position = "";
    }

    // COPY BUILDER
    public EmployeeSalesFloor(EmployeeSalesFloor p) {
        super(p);
        setPosition(p.getPosition());
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        super.hashCode();
        int hash;
        hash = Objects.hash(position);
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
        final EmployeeSalesFloor other = (EmployeeSalesFloor) obj;
        return Objects.equals(this.position, other.position);
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return super.toString() + " works at the position of " + position;
    }
    
    // Other methods
    @Override
    public String work(){
        String work = "The employee " + getName() + " is working in the shop as a " + position + " with the tasks to do: " + getTasks();
        return work;
    }
}
