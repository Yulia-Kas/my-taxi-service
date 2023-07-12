Project name - "taxi-service"

The project manages the taxi fleet. After authentication, you can get information about the available cars of their manufacturers and drivers.
Services:
- AuthenticationService provides access to application using a login and password;
- CarService allows you to add new cars to the database and receive information about existing cars from the database;
- DriverService shows which cars the driver is assigned to, information about the driver from the database, add new drivers to the database;
- ManufacturerService gives and adds information from the database about the car manufacturer.

To get the actual parameters of the database tables, run script from the resources/init_db.sql file in the Workbench.
The project calls to create, modify, delete and remove data in the database.