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
public abstract class Employee {
    // ATTRIBUTES
    private String name;
    private String direction;
    private double salary;
    private LinkedList<Task> tasks;

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public LinkedList<Task> getTasks() {
        return tasks;
    }
    
    public void setTasks(LinkedList<Task> tasks){
        this.tasks = tasks;
    }
    
    // COMPLETE BUILDER
    public Employee(String name, String direction, double salary, LinkedList<Task> tasks) {
        this.name = name;
        this.direction = direction;
        this.salary = salary;
        this.tasks = tasks;
    }

    // EMPTY BUILDER
    public Employee() {
        name = "";
        direction = "";
        salary = 0;
        tasks = new LinkedList<>();
    }
    
    // COPY BUILDER
    public Employee(Employee p){
        p.setName(p.getName());
        p.setDirection(p.getDirection());
        p.setSalary(p.getSalary());
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash;
        hash = Objects.hash(name, direction, salary);
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
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.direction, other.direction);
    }
    
    // TOSTRING
    @Override
    public String toString(){
        return "The employee " + name + " that lives in the direction " + direction + " that its salary is " + salary + " €";
    }
    
    // Other methods
    public abstract String work();
}
