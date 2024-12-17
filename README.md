> [Ver en ingles/See in english](https://github.com/LuisMiSanVe/JavaShopManagement/tree/main)

# 📊 Programa de Consola de Java para Administración de Tienda

[![image](https://img.shields.io/badge/apache%20netbeans-1B6AC6?style=for-the-badge&logo=apache%20netbeans%20IDE&logoColor=white)](https://netbeans.apache.org/front/main/index.html)
[![image](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

Este proyecto consiste en un programa de consola que te permite administrar una tienda y sus empleados.\
Tiene varios tipo de objetos: la propia Tienda, los Empleados y otras variantes que heredan del mismo, Departamentos y Almacenes.\
Puedes registrar todas las tiendas que quieras y administrarlas por separado, cada una con sus empleados, puestos y tareas asignadas.\
La sección de administrar Empleados contiene un simple menú gráfico.

## 🛠️ Setup
Para ejecutar el programa, es tan facil como correrlo en la consola del IDE Netbeans cargando el proyecto y dandole a 'Run', o a través de la consola con Java.

Para ejecutar el programa, necesitarás el [JDK de Java](https://www.oracle.com/java/technologies/downloads/) y un entorno de consola, para este caso recomiendo usar directamente la consola del [IDE Netbeans](https://netbeans.apache.org/front/main/index.html).\
Para empezar, en Netbeans, crea un proyecto nuevo de `Java con Ant` y llámalo 'ShopManager' luego sobreescribe la carpeta `src` que se crea con [la que has clonado de este repositorio](https://github.com/LuisMiSanVe/JavaShopManagement/tree/main/ShopManager/src).

## 📖 Sobre el proyecto
Las clases del proyecto están en su mayoria relacionadas entre ellas en una jerarquía para usar tecnicas de programación como el polimorfismo para optimizar el codigo del programa.\
Este es el esquema de clases:\
<img src="/RepositoryResources/classDiagram.png" width="500" alt="Esquema de clases">

> [!NOTE]
> Este esquema era parte de mi proyecto de fin de año cuando estaba estudiando Java.

## 📂 Archivos
Las diferentes clases son:
- [Tienda](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/Shop.java): La clase principal del programa. Contiene la lista de empleados, departamentos, y al gerente.
- [Departamento](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/Department.java): Cada departamento tiene un nombre y una lista con las tareas asginadas.
- [Almacen](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/Warehouse.java): Cada almacén tiene una letra identificativa y un gerente asignado.
- [Empleado](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/Employee.java): La clase de empleado más básica. Solo tiene la información básica y es abstracta.
- [EmpleadoSala](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/EmployeeSalesFloor.java): Representa al empleado que trabaja de cara al público, físicamente en la tienda.
- [EmpleadoAlmacen](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/EmployeeWarehouse.java): Representa a los empleados encargados de administrar el Almacén.
- [Encargado](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/Supervisor.java): Representa al empleado que está acargo de un Departamento.
- [Gerente](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/Manager.java): Representa a la persona que está a cargo de la tienda, el jefe.
- [Tarea](https://github.com/LuisMiSanVe/JavaShopManagement/blob/main/ShopManager/src/shopmanager/Task.java): Son las tareas que se pueden asignar a empleados por individual o a un Departamento entero.

## 💻 Tecnologías Utilizadas
- Lenguaje de programación: [Java](https://www.java.com/)
- Otros:
  - Esquema de clases: [Dia](http://dia-installer.de/index.html)
- IDe Recomendado: [NetBeans](https://netbeans.apache.org/front/main/index.html)
