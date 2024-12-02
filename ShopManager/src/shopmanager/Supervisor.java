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
public class Supervisor extends Employee{
    // ATTRIBUTES
    private Department department;

    // GETTERS AND SETTERS
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    // COMPLETE BUILDER
    public Supervisor(String name, String direction, double salary, LinkedList<Task> tasks, Department department) {
        super(name, direction, salary, tasks);
        this.department = department;
    }

    // EMPTY BUILDER
    public Supervisor() {
        super();
        department = new Department();
    }

    // COPY BUILDER
    public Supervisor(Supervisor p) {
        super(p);
        p.setDepartment(p.getDepartment());
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(department);
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
        final Supervisor other = (Supervisor) obj;
        return Objects.equals(this.department, other.department);
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return super.toString() + " administrate the department " + department.getNameDepart();
    }
    
    // Other methods
    @Override
    public String work(){
        String work = "The supervisor " + getName() + " is supervising department " + department.getNameDepart() + " with the tasks to do: " + getTasks();
        return work;
    }
}
