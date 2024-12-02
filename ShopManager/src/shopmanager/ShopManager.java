/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopmanager;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author LuisMiSanVe
 */

public class ShopManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SHOP AND WAREHOUSE CREATION
        Shop shopInitial;
        Warehouse warehouseInitial = new Warehouse();
        // Asign a letter to the warehouse
        warehouseInitial.setIdLetter('A');

        // Department array creation
        Department[] arrDepartments = {
            new Department(new LinkedList<>(), "Sales"), // Department '0'
            new Department(new LinkedList<>(), "Purchasing"), // Department '1'
            new Department(new LinkedList<>(), "Marketing"), // Department '2'
            new Department(new LinkedList<>(), "HR") // Department '3'
        };

        // List where the Departments are stored creation
        LinkedList<Department> departments = new LinkedList<>();

        // Add the Department array to the list
        for (int i = 0; i < arrDepartments.length; i++) {
            departments.add(arrDepartments[i]);
        }

        // EMPLOYEES CREATION
        // Manager of the Shop and Warehouse creation.
        Manager managerInitial = new Manager("Luis", "C/Picasso 5", 2100, new LinkedList<>(), departments.get(1), "Stock management");

        // Dinamicly created Shop's Employees
        Employee[] arrEmployeesShop = {
            new EmployeeSalesFloor("Marta", "C/Lorca 6", 1100, new LinkedList<>(), "Caja"),
            new EmployeeSalesFloor("Carlos", "C/Genesis 6", 950, new LinkedList<>(), "Reponedor"),
            new EmployeeSalesFloor("Andrea", "C/DaVinci 12", 1200, new LinkedList<>(), "Seguridad"),
            new Supervisor("Miguel", "C/Dali 45", 1850, new LinkedList<>(), departments.get(3)),
            new EmployeeWarehouse("Lucia", "C/Gogh 4", 1200, new LinkedList<>(), warehouseInitial),
            new EmployeeWarehouse("David", "C/Pollock 2", 1100, new LinkedList<>(), warehouseInitial),
            new EmployeeWarehouse("Beatriz", "C/Vermeer 10", 1100, new LinkedList<>(), warehouseInitial)
        };

        // Map where the employees are stored creation
        HashMap<Integer, Employee> mapEmployees = new HashMap<>();

        // Add the Employee array to the map
        for (int i = 0; i < arrEmployeesShop.length; i++) {
            mapEmployees.put(i, arrEmployeesShop[i]);
        }

        // Add all the content to the Shop
        shopInitial = new Shop("Shop1", mapEmployees, departments, managerInitial);
        // List where the registered shops are stored creation
        LinkedList<Shop> shopsRegistered = new LinkedList<>();
        shopsRegistered.add(shopInitial);

        // Menu variables    
        int select;
        Shop shopSeleccioned = shopsRegistered.get(0);
        int countEmple = shopSeleccioned.getListEmployees().size();
        
        // Other variables
        Scanner dataentry = new Scanner(System.in);
        Pattern p;
        Matcher m;
        String direction = "";
        final String patternDir = "C\\/[A-Za-z]+ [0-9]+";

        do {
            System.out.println("\n" + shopSeleccioned.getNameShop() + "'s MAIN MENU");
            System.out.println("==========================================");
            System.out.println("1) Open personnel manager");
            System.out.println("2) Asign tasks to a Department");
            System.out.println("3) Asign tasks to a Employee");
            System.out.println("4) Monitor Workers");
            System.out.println("5) Change Shop");
            System.out.println("6) Show personnel quantity");
            System.out.println("---------------------------------");
            System.out.println("0) Exit");
            System.out.println("==========================================");
            System.out.print("Choose an option: ");
            try {
                int opcion = Integer.parseInt(dataentry.nextLine());
                switch (opcion) {
                    case 0:
                        System.out.println("¡Goodbye!");
                        System.exit(0);
                    case 1:
                        // Personnel Manager with JOptionPane

                        select = -1;// The selector initializes different from 0
                        // It shouldn't be a possitive number either, so an actual option is not already selected by default
                        while (select != 0) {
                            Object[] options = {"Add Sales Floor Employee", "Add Warehouse Employee", "Add Supervisor", "Add Manager", "Show Employees", "Back"};
                            int selection = JOptionPane.showOptionDialog(null, "Choose: ", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                            
                            switch (selection) {
                                case 0: // Create EmployeeSalesFloor
                                    try {
                                    System.out.print("\nType the Employee's name: ");
                                    String name = dataentry.nextLine();
                                    do {
                                        System.out.println("Type the Employee's direction: ");
                                        System.out.print("It must be in the \"C/StreetName StreetNumber\" format: ");
                                        direction = dataentry.nextLine();
                                        // Check the direction format with regex
                                        p = Pattern.compile(patternDir);
                                        m = p.matcher(direction);
                                        if (m.matches()) {
                                        } else {
                                            System.out.println("[ERROR]: The direction doesn't have the required format.");
                                        }
                                    } while (!m.matches());

                                    System.out.print("Type the Employee's salary: ");
                                    double salary = Double.parseDouble(dataentry.nextLine());
                                    System.out.print("Type the Employee's position: ");
                                    String position = dataentry.nextLine();
                                    shopSeleccioned.getListEmployees().put(countEmple, new EmployeeSalesFloor(name, direction, salary, new LinkedList<>(), position));
                                    countEmple++;
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("[ERROR]: The data wasn't in the right format.");
                                } catch (NumberFormatException e) {
                                    System.out.println("[ERROR]: The numeric-type data wasn't in the right format.");
                                }
                                case 1: // Create EmployeeWarehouse
                                    try {
                                    System.out.print("\nType the Employee's name: ");
                                    String name = dataentry.nextLine();
                                    do {
                                        System.out.println("Type the Employee's direction: ");
                                        System.out.print("It must be in the \"C/StreetName StreetNumber\" format: ");
                                        direction = dataentry.nextLine();
                                        // Check the direction format with regex
                                        p = Pattern.compile(patternDir);
                                        m = p.matcher(direction);
                                        if (m.matches()) {
                                        } else {
                                            System.out.println("[ERROR]: The direction doesn't have the required format.");
                                        }
                                    } while (!m.matches());
                                    System.out.print("Type the Employee's salary: ");
                                    double salary = Double.parseDouble(dataentry.nextLine());
                                    System.out.print("Type the Employee's asigned Warehouse letter: ");
                                    char warehouse = dataentry.nextLine().charAt(0);
                                    shopSeleccioned.getListEmployees().put(countEmple, new EmployeeWarehouse(name, direction, salary, new LinkedList<>(), new Warehouse(shopSeleccioned.getManagerShop(), warehouse)));
                                    countEmple++;
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("[ERROR]: The data wasn't in the right format.");
                                } catch (NumberFormatException e) {
                                    System.out.println("[ERROR]: The numeric-type data wasn't in the right format.");
                                }
                                case 2: // Create Supervisor
                                    try {
                                    System.out.print("\nType the Supervisor's name: ");
                                    String name = dataentry.nextLine();
                                    do {
                                        System.out.println("Type the Supervisor's direction: ");
                                        System.out.print("It must be in the \"C/StreetName StreetNumber\" format: ");
                                        direction = dataentry.nextLine();
                                        // Check the direction format with regex
                                        p = Pattern.compile(patternDir);
                                        m = p.matcher(direction);
                                        if (m.matches()) {
                                        } else {
                                            System.out.println("[ERROR]: The direction doesn't have the required format.");
                                        }
                                    } while (!m.matches());
                                    System.out.print("Type the Supervisor's salary: ");
                                    double salary = Double.parseDouble(dataentry.nextLine());
                                    System.out.println("Choose the Supervisor's asigned Department: ");
                                    for (int i = 0; i < shopSeleccioned.getDepartmentsShop().size(); i++) {
                                        System.out.println(i + 1 + ". " + shopSeleccioned.getDepartmentsShop().get(i).getNameDepart());
                                    }
                                    int depart = Integer.parseInt(dataentry.nextLine());
                                    if (depart < 0 && depart > shopSeleccioned.getDepartmentsShop().size()) {
                                        System.out.println("[ERROR]: Invalid option.");
                                    } else {
                                        shopSeleccioned.getListEmployees().put(countEmple, new Supervisor(name, direction, salary, new LinkedList<>(), shopSeleccioned.getDepartmentsShop().get(depart - 1)));
                                    }
                                    countEmple++;
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("[ERROR]: The data wasn't in the right format.");
                                } catch (NumberFormatException e) {
                                    System.out.println("[ERROR]: The numeric-type data wasn't in the right format.");
                                }
                                case 3: // Create Manager
                                    try {
                                    System.out.print("\nType the Manager's name: ");
                                    String name = dataentry.nextLine();
                                    do {
                                        System.out.println("Type the Manager's direction: ");
                                        System.out.print("It must be in the \"C/StreetName StreetNumber\" format: ");
                                        direction = dataentry.nextLine();
                                        // Check the direction format with regex
                                        p = Pattern.compile(patternDir);
                                        m = p.matcher(direction);
                                        if (m.matches()) {
                                        } else {
                                            System.out.println("[ERROR]: The direction doesn't have the required format.");
                                        }
                                    } while (!m.matches());
                                    System.out.print("Type the Manager's salary: ");
                                    double salary = Double.parseDouble(dataentry.nextLine());
                                    System.out.print("Type the Manager's management type it does on the Department: ");
                                    String managing = dataentry.nextLine();
                                    System.out.println("Choose the Manager's asigned Department: ");
                                    for (int i = 0; i < shopSeleccioned.getDepartmentsShop().size(); i++) {
                                        System.out.println(i + 1 + ". " + shopSeleccioned.getDepartmentsShop().get(i).getNameDepart());
                                    }
                                    System.out.print("Choose an option: ");
                                    int depart = Integer.parseInt(dataentry.nextLine());
                                    if (depart < 0 && depart > shopSeleccioned.getDepartmentsShop().size()) {
                                        System.out.println("[ERROR]: Invalid option.");
                                    } else {
                                        shopSeleccioned.getListEmployees().put(countEmple, new Manager(name, direction, salary, new LinkedList<>(), shopSeleccioned.getDepartmentsShop().get(depart - 1), managing));
                                    }
                                    countEmple++;
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("[ERROR]: The data wasn't in the right format.");
                                } catch (NumberFormatException e) {
                                    System.out.println("[ERROR]: The numeric-type data wasn't in the right format.");
                                }
                                case 4: // Ver Employees
                                    System.out.println("\nBASIC EMPLOYEES INFO TABLE");
                                    System.out.println("====================================================");
                                    System.out.printf("%15s %15s %15s\n", "NAME", "DIRECTION", "SALARY");
                                    System.out.println("====================================================");
                                    for (int i = 0; i < shopSeleccioned.getListEmployees().size(); i++) {
                                        System.out.printf("%15s %15s %15s€\n", shopSeleccioned.getListEmployees().get(i).getName(), shopSeleccioned.getListEmployees().get(i).getDirection(), shopSeleccioned.getListEmployees().get(i).getSalary());
                                    }
                                    System.out.printf("%15s %15s %15s€\n", shopSeleccioned.getManagerShop().getName(), shopSeleccioned.getManagerShop().getDirection(), shopSeleccioned.getManagerShop().getSalary());
                                    System.out.println("====================================================");
                                    System.out.println("\nDETAILED EMPLOYEES INFO LIST");
                                    for (int i = 0; i < shopSeleccioned.getListEmployees().size(); i++) {
                                        System.out.println(shopSeleccioned.getListEmployees().get(i));
                                    }
                                    System.out.println(shopSeleccioned.getManagerShop());
                                    System.out.println("");// Empty space to separate data
                                    break;
                                case 5: // Exit the JOptionPane menu
                                    select = 0; // option is reseted
                                    break;
                                default:
                                    System.out.println("[ERROR]: Invalid option.");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        // Asign tasks to departments
                        System.out.println("\nTo what Department you wanto to asign tasks?");
                        System.out.println("==============================================");
                        for (int i = 0; i < shopSeleccioned.getDepartmentsShop().size(); i++) {
                            System.out.println(i + 1 + ". " + shopSeleccioned.getDepartmentsShop().get(i).getNameDepart());
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println("0) Go back");
                        System.out.println("==============================================");
                        System.out.print("Choose an option: ");
                        int optionTasksDep = Integer.parseInt(dataentry.nextLine());
                        // Options
                        if (optionTasksDep < 0 && optionTasksDep > 4) {
                            break;
                        } else if (optionTasksDep == 0) {
                            break;
                        } else {
                            System.out.print("\nType the task's name: ");
                            String nameTask = dataentry.nextLine();
                            System.out.print("Type the task's description: ");
                            String description = dataentry.nextLine();
                            Task task = new Task(nameTask, description);

                            shopSeleccioned.getDepartmentsShop().get(optionTasksDep - 1).getTasksDepart().add(task);
                        }
                        // Show the tasks of each Department
                        System.out.println("\nTASK LIST---------------------------------");
                        for (int i = 0; i < shopSeleccioned.getDepartmentsShop().size(); i++) {
                            System.out.println("DEPARTMENT: " + shopSeleccioned.getDepartmentsShop().get(i).getNameDepart() + "\n" + shopSeleccioned.getDepartmentsShop().get(i).getTasksDepart());
                        }
                        System.out.println("\n------------------------------------------------");
                        break;

                    case 3:
                        // Asign tasks to employees
                        System.out.print("\nType the task's name: ");
                        String nameTask = dataentry.nextLine();
                        System.out.print("Type the task's description: ");
                        String description = dataentry.nextLine();
                        Task task = new Task(nameTask, description);

                        System.out.println("\nEMPLOYEES LIST");
                        for (int i = 0; i < shopSeleccioned.getListEmployees().size(); i++) {
                            System.out.println(shopSeleccioned.getListEmployees().get(i));
                        }
                        System.out.println(shopSeleccioned.getManagerShop());

                        System.out.print("\nTo which employee is going to be asigned?(Type only its name): ");
                        String nameEmployeeAsig = dataentry.nextLine();
                        try {
                            searchEmployee(shopSeleccioned, nameEmployeeAsig).getTasks().add(task);
                            System.out.println("Tasks of employee " + nameEmployeeAsig + ": " + searchEmployee(shopSeleccioned, nameEmployeeAsig).getTasks());
                        } catch (NullPointerException e) {
                            System.out.println("[ERROR]: That name is not in the registered employee's list.");
                        }
                        break;
                    case 4:
                        // Monitor the employee's tasks
                        System.out.println("\nEMPLOYEES LIST");
                        for (int i = 0; i < shopSeleccioned.getListEmployees().size(); i++) {
                            System.out.println(shopSeleccioned.getListEmployees().get(i));
                        }
                        System.out.println(shopSeleccioned.getManagerShop());

                        System.out.print("\nWho do you want to monitor?(Type only its name): ");
                        String nameEmployeeMon = dataentry.nextLine();
                        try {
                            System.out.println("\nEMPLOYEE'S ASIGNED WORK:");
                            System.out.println(searchEmployee(shopSeleccioned, nameEmployeeMon).work());
                        } catch (NullPointerException e) {
                            System.out.println("[ERROR]: That name is not in the registered employee's list.");
                        }

                        break;
                    case 5:
                        // Change shop
                        System.out.println("\nREGISTERED SHOPS-----------------------------");
                        for (int i = 0; i < shopsRegistered.size(); i++) {
                            System.out.println(i + 1 + ". " + shopsRegistered.get(i).getNameShop());
                        }
                        System.out.println("\nWHAT DO YOU WANT TO DO?------------------------------");
                        System.out.println("1. Change Shop\n2. Register new Shop\n3. Back");
                        System.out.print("------------------------------------------------\nChoose an option: ");
                        int opcionShops = Integer.parseInt(dataentry.nextLine());
                        switch (opcionShops) {
                            case 1: // Choose another registered Shop
                                System.out.print("\nType the registered shop's name you want to change to: ");
                                String shopChange = dataentry.nextLine();
                                try {
                                    shopSeleccioned = searchShop(shopsRegistered, shopChange);
                                    System.out.println("Shop has been changed to " + shopSeleccioned.getNameShop());
                                    countEmple = shopSeleccioned.getListEmployees().size(); // Change the employee counter to the actual shop employee's quantity.
                                } catch (NullPointerException e) {
                                    System.out.println("[ERROR]: That shop name is not in the registered Shop's list, the default shop will be selected.");
                                    shopSeleccioned = shopsRegistered.get(0);
                                    countEmple = shopsRegistered.get(0).getListEmployees().size();
                                }
                                break;
                            case 2: // Register new shop
                                System.out.print("\nType the Shop's name: ");
                                String nameNew = dataentry.nextLine();

                                System.out.print("Type the Departments of the Shop:\n");
                                LinkedList<Department> departNew = new LinkedList<>();
                                String departNameNew = "";
                                int numDeparts = 0; // Department counter, 0 departments are not allowed
                                do {
                                    System.out.print("New Department (Type 'exit' to stop adding): ");
                                    departNameNew = dataentry.nextLine();
                                    if (departNameNew.equalsIgnoreCase("exit")){
                                        if(numDeparts == 0){
                                            System.out.println("[ERROR]: There must be at least 1 Department.");
                                        } else {
                                            numDeparts = -1;
                                        }
                                    } else {
                                        departNew.add(new Department(new LinkedList<>(), departNameNew));
                                        numDeparts++;
                                    }
                                    
                                } while (numDeparts != -1);

                                try {
                                    System.out.print("\nType the Manager's name: ");
                                    String name = dataentry.nextLine();
                                    do {
                                        System.out.println("Type the Manager's direction: ");
                                        System.out.print("It must be in the \"C/StreetName StreetNumber\" format: ");
                                        direction = dataentry.nextLine();
                                        // Check the direction format with regex
                                        p = Pattern.compile(patternDir);
                                        m = p.matcher(direction);
                                        if (m.matches()) {
                                        } else {
                                            System.out.println("[ERROR]: The direction doesn't have the required format.");
                                        }
                                    } while (!m.matches());
                                    System.out.print("Type the Manager's salary: ");
                                    double salary = Double.parseDouble(dataentry.nextLine());
                                    System.out.print("Type the Manager's management type it does on the Department: ");
                                    String managing = dataentry.nextLine();
                                    System.out.println("Choose the Manager's asigned Department: ");
                                    for (int i = 0; i < departNew.size(); i++) {
                                        System.out.println(i + 1 + ". " + departNew.get(i).getNameDepart());
                                    }
                                    System.out.print("Choose an option: ");
                                    int depart = Integer.parseInt(dataentry.nextLine());
                                    if (depart < 0 && depart > shopSeleccioned.getDepartmentsShop().size()) {
                                        System.out.println("[ERROR]: Invalid option.");
                                    } else {
                                        HashMap<Integer, Employee> listaEmployees = new HashMap<>();
                                        Shop shopNueva = new Shop(nameNew, listaEmployees, departNew, new Manager(name, direction, salary, new LinkedList<>(), shopSeleccioned.getDepartmentsShop().get(depart - 1), managing));
                                        shopsRegistered.add(shopNueva);
                                        shopSeleccioned = shopNueva; // Point to the new Shop's memory
                                    }
                                    
                                    countEmple = shopSeleccioned.getListEmployees().size(); // Change the employee counter to the actual shop employee's quantity.
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("[ERROR]: The data wasn't in the right format.");
                                } catch (NumberFormatException e) {
                                    System.out.println("[ERROR]: The numeric-type data wasn't in the right format.");
                                }

                        }
                        break;
                    case 6:
                        // Show the employee quantity
                        System.out.println("\n" + shopSeleccioned.getNameShop() + "'S EMPLOYEES");
                        System.out.println("----------------------------------------------");
                        int numEmpSalesFloor = 0, numEmpWar = 0, numSup = 0, numMan = 1; // By default it searches for at least one Manager, as its obligatory to have at least one in each shop
                        // Cuento los employees según su clase
                        for(int i = 0; i<countEmple;i++){
                            if(shopSeleccioned.getListEmployees().get(i) instanceof EmployeeSalesFloor){
                                numEmpSalesFloor++;
                            } else if(shopSeleccioned.getListEmployees().get(i) instanceof EmployeeWarehouse){
                                numEmpWar++;
                            } else if(shopSeleccioned.getListEmployees().get(i) instanceof Manager){
                                numMan++;
                            } else if(shopSeleccioned.getListEmployees().get(i) instanceof Supervisor){
                                numSup++;
                            } 
                        }
                        System.out.printf("%20s %-15d\n%15s %-15d\n%15s %-15d\n%15s %-10s\n%15s %-15d", "Employees working in Sales Floor:", numEmpSalesFloor,"Employees working in Warehouse:", numEmpWar, "Supervisors in the shop:", numSup, "Main Manager of the Shop:", shopSeleccioned.getManagerShop().getName(), "Managers in the Shop:", numMan);
                        System.out.println("\n----------------------------------------------");
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERROR]: The response's format was not right.");
            } catch (NullPointerException e) {
                System.out.println("[ERROR]: An unexpected error happened while trying to get data.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("[ERROR]: An unexpected error happened while trying to get data.");
            }
        } while (true);
    }

    // Search employees and manager by their names method
    public static Employee searchEmployee(Shop shop, String name) {
        Employee exists = null;
        for (int i = 0; i < shop.getListEmployees().size(); i++) {
            Employee aux = shop.getListEmployees().get(i);
            if (aux.getName().equals(name) == true) {
                exists = aux;
            } else if (name.equals(shop.getManagerShop().getName())) {
                exists = shop.getManagerShop();
            }
        }
        return exists;
    }

    // Search shops by their name method
    public static Shop searchShop(LinkedList<Shop> shopsRegistered, String name) {
        Shop exists = null;
        for (int i = 0; i < shopsRegistered.size(); i++) {
            Shop aux = shopsRegistered.get(i);
            if (aux.getNameShop().equals(name) == true) {
                exists = aux;
            }
        }
        return exists;
    }

}