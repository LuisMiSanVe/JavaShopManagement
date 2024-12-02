> [See in spanish/Ver en español]()

# 📊 Shop Management Java Console Program

[![image](https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white)](https://netbeans.apache.org/front/main/index.html)
[![image](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

This project consists of a console program that allows you to manage a shop and its employees.  
It has a variety of object types: the Shop itself, Employees and other variants that inherit from it, Departments and Warehouses.  
You can register all the shops you want and manage them separately, each with its employees, positions, and assigned tasks.  
The Employee management section has a simple graphical interface menu.

## 🛠️ Setup
To run the program, it's as easy as running it on the NetBeans IDE console by loading the project and clicking the 'Run' button, or via the Java console.

## 📖 About the project
The project's classes are mostly linked in a hierarchy to use programming techniques like Polymorphism to optimize the program's code.  
This is the class diagram:  
<img src="/RepositoryResources/classDiagram.png" width="500" alt="Class diagram">

> [!NOTE]  
> The class diagram is displayed in Spanish, as it was part of my end-of-year project when I was studying Java.

## 📂 Files
The different classes are:
- [Shop](): The main class in the project. It contains the list of employees, departments, and the manager.
- [Department](): Each department can have a name and a list of assigned tasks.
- [Warehouse](): Each warehouse has a unique letter and a manager.
- [Employee](): The most basic employee class. It has only general attributes and is abstract.
- [SalesFloorEmployee](): Represents the employee who works publicly, physically in the shop.
- [WarehouseEmployee](): Represents the employees responsible for maintaining the warehouse of the shop.
- [Supervisor](): Represents the employee in charge of a whole department.
- [Manager](): Represents the person in charge of the shop, the boss.
- [Task](): Represents the tasks that can be assigned to individual employees or to an entire department.

## 💻 Technologies used
- Programming Language: [Java](https://www.java.com/)
- Other:
  - Class Diagram: [Dia](http://dia-installer.de/index.html)
- Recommended IDE: [NetBeans](https://netbeans.apache.org/front/main/index.html)
