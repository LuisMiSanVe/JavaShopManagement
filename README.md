> [See in spanish/Ver en español]()
# 📊 Shop Management Java COnsole Program
[![image](https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white)](https://netbeans.apache.org/front/main/index.html)
[![image](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

This project consists in a console program that allows you to administrate a shop and its employes.\
Its has a variety of Object types, the Shop itself, Employees and other variants that inherits from it, Departaments, Warehouses...\
You can register all the SHops you want and manage them separately, each with all the employees, their positions and assigned tasks.\
The Employee management section has a simple graphic interface menu.
## 🛠️ Setup
To run the program, is as easy as running it on the Netbeans IDE console by Loading the project and hitting the 'Run' button, or via java console.

## 📖 About the project
The project's classes are mostly linked between them in a hierarchy to use programming techniques as Polymorphism to optimize the program's code.\
This is the class diagram:\
<img src="/RepositoryResources/classDiagram.png" width="500" alt="Class diagram">
> [!NOTE]
> The class diagram is displayed in Spanish, as it was part of my end-of-year project when I was studying Java.
## 📂 Files
The different classes are:
- [Shop](): The main class in the project, it contains the list of employees, departaments and the Manager.
- [Department](): Each one can have a name and has a list with the tasks asigned.
- [Warehouse](): Each one has a differential letter and has a Manager.
- [Employee](): The most basic employee class, has only general attributes, its abstract.
- [SalesFloorEmployee](): Represents the employee that works publicly, fisically in the shop.
- [WarehouseEmployee](): Represents the employees charged to maintain the warehouse of the shop.
- [Supervisor](): Represents the employee that is at charge of a whole Departament.
- [Manager](): Represent the person at charge of the shop, the boss.
- [Task]() The tasks that can be asigned to individual employees or to a whole Department.
## 💻 Technologies used
- Programming Language: [Java](https://www.java.com/)
- Other:
  - Class Diagram: [Dia](http://dia-installer.de/index.html)
- Recommended IDE: [Netbeans](https://netbeans.apache.org/front/main/index.html)
