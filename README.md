Project name - "taxi-service".
    
  Project functions.
    This is a service for accounting of cars in the taxi fleet. You can fix the drivers behind the cars. 
Get and add information about their drivers' cars.
The project calls to create, modify, delete and remove data in the database.
    
  Project structure.    
    After authentication, you can get information about the available cars of their manufacturers and drivers.
    Services:
  - AuthenticationService provides access to application using a login and password;
  - CarService allows you to add new cars to the database and receive information about existing cars from the database;
  - DriverService shows which cars the driver is assigned to, information about the driver from the database, add new drivers to the database;
  - ManufacturerService gives and adds information from the database about the car manufacturer.
  Technologies used in the project: 
    Java 11, MySQL database, Servlet, JSP, JSTL, mapping in web.xml file, TomCat server.
  
  Instructions for launching the project
    - To get the actual parameters of the database tables, run script from the resources/init_db.sql file in the Workbench.
    - In the static block class ConnectionUtil, put the appropriate data to configure the connection with the database.
    - Install Tomcat 9.0.75, select a tab "Edit configurations" and "add new".
    ![img_1.png](img_1.png)
     To choose Tomcat 9.0.75.
    ![img_3.png](img_3.png)