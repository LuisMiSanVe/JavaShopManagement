/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopmanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
/**
 *
 * @author LuisMiSanVe
 */
public class Shop {
    // ATTRIBUTES
    private String nameShop;
    private HashMap<Integer, Employee> listEmployees;
    private LinkedList<Department> departmentsShop;
    private Manager managerShop;

    // GETTERS AND SETTERS
    public String getNameShop(){
        return nameShop;
    }
    
    public void setNameShop(String nameShop){
        this.nameShop = nameShop;
    }
    
    public HashMap<Integer, Employee> getListEmployees() {
        return listEmployees;
    }

    public void setListEmployees(HashMap<Integer, Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }

    public LinkedList<Department> getDepartmentsShop() {
        return departmentsShop;
    }

    public void setDepartmentsShop(LinkedList<Department> departmentsShop) {
        this.departmentsShop = departmentsShop;
    }

    public Manager getManagerShop() {
        return managerShop;
    }

    public void setManagerShop(Manager managerShop) {
        this.managerShop = managerShop;
    }

    // COMPLETE BUILDER
    public Shop(String nameShop, HashMap<Integer, Employee> listEmployees, LinkedList<Department> departmentsShop, Manager managerShop) {
        this.nameShop = nameShop;
        this.listEmployees = listEmployees;
        this.departmentsShop = departmentsShop;
        this.managerShop = managerShop;
    }
    
    // EMPTY BUILDER
    public Shop(){
        nameShop = "";
        listEmployees = new HashMap<>();
        departmentsShop = new LinkedList<>();
        managerShop = new Manager();
    }
    
    // COPY BUILDER
    public Shop(Shop t){
        t.setNameShop(nameShop);
        t.setListEmployees(listEmployees);
        t.setDepartmentsShop(departmentsShop);
        t.setManagerShop(managerShop);
    }

    // HASHCODE
    @Override
    public int hashCode() {
        int hash = Objects.hash(nameShop,listEmployees, departmentsShop, managerShop);
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
        final Shop other = (Shop) obj;
        if (!Objects.equals(this.nameShop, other.nameShop)) {
            return false;
        }
        if (!Objects.equals(this.listEmployees, other.listEmployees)) {
            return false;
        }
        if (!Objects.equals(this.departmentsShop, other.departmentsShop)) {
            return false;
        }
        return Objects.equals(this.managerShop, other.managerShop);
    }
    

    // TOSTRING
    @Override
    public String toString() {
        return "Shop '" + nameShop + "' with Manager: " + managerShop.getName();
    }
}
