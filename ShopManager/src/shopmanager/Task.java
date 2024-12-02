/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopmanager;

import java.util.Objects;
/**
 *
 * @author LuisMiSanVe
 */
public class Task {
    // ATTRIBUTES
    private String nameTask;
    private String description;

    // GETTER AND SETTERS
    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    // COMPLETE BUILDER
     public Task(String nameTask, String description) {
        this.nameTask = nameTask;
        this.description = description;
    }

    // EMPTY BUILDER
     public Task() {
        nameTask = "";
        description = "";
    }

    // COPY BUILDER
     public Task(Task t) {
        t.setNameTask(nameTask);
        t.setDescription(description);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(nameTask, description);
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
        final Task other = (Task) obj;
        if (!Objects.equals(this.nameTask, other.nameTask)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    // TOSTRING
    @Override
    public String toString() {
        return nameTask + ". " + description;
    }
}
