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
public class Department {
    // ATTRIBUTES
    private LinkedList<Task> tasksDepart;
    private String nameDepart;

    // GETTERS AND SETTERS
    public LinkedList<Task> getTasksDepart() {
        return tasksDepart;
    }

    public void setTasksDepart(LinkedList<Task> tasksDepart) {
        this.tasksDepart = tasksDepart;
    }

    public String getNameDepart() {
        return nameDepart;
    }

    public void setNameDepart(String nameDepart) {
        this.nameDepart = nameDepart;
    }
    
    // COMPLETE BUILDER
    public Department(LinkedList<Task> tasksDepart, String nameDepart) {
        this.tasksDepart = tasksDepart;
        this.nameDepart = nameDepart;
    }
    
    // EMPTY BUILDER
    public Department(){
        tasksDepart = new LinkedList<>();
        nameDepart = "";
    }
    
    // COPY BUILDER
    public Department(Department d){
        d.setTasksDepart(tasksDepart);
        d.setNameDepart(nameDepart);
    }
    
    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(nameDepart, tasksDepart);
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
        final Department other = (Department) obj;
        if (!Objects.equals(this.nameDepart, other.nameDepart)) {
            return false;
        }
        return Objects.equals(this.tasksDepart, other.tasksDepart);
    }
    
    // TOSTRING
    @Override
    public String toString() {
        return "Department{" + "tasksDepart=" + tasksDepart + ", nameDepart=" + nameDepart + '}';
    }
}
