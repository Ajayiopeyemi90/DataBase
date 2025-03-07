# DataBase

# Database Java Application

## Overview
This project is a simple Java application that connects to a **PostgreSQL database** and performs basic CRUD (Create, Read, Update, Delete) operations on a table named **flexi**. The project is built using **JDBC**.

## Features
- **Create Table**: Automatically creates a table if it does not exist.
- **Insert Data**: Adds new records to the database.
- **Update Data**: Modifies existing records.
- **Delete Data**: Removes specific records.
- **Close Connection**: Ensures proper database connection management.

## Technologies Used
- **Java (JDK 23)**
- **PostgreSQL (Database)**
- **JDBC (Java Database Connectivity)**
- **Eclipse IDE (Recommended)**

## Prerequisites
Before running this project, ensure you have:
1. **Java Development Kit (JDK 23)** installed.
2. **PostgreSQL** installed and running.
3. **PostgreSQL JDBC Driver** added to your project classpath.
4. A PostgreSQL database named `flexisaf-Week7-8`.

## Setup Instructions

### 1. Clone the Repository
```sh
 git clone <repository-url>
 cd <project-directory>
```

### 2. Install PostgreSQL JDBC Driver
Download the driver from: [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/) and add it to your project's classpath.

### 3. Update Database Credentials
Modify the following variables in `Database.java` to match your PostgreSQL credentials:
```java
String url = "jdbc:postgresql://localhost:5432/flexisaf-Week7-8";
String username = "postgres";
String password = "your_password";
```

### 4. Run the Application
Run the `Database.java` file in your Java IDE or using the command line:
```sh
javac Database.java
java Database
```

## Expected Output
```
✅ Table Created (if not exists)!
✅ Data Updated!
✅ Data Deleted!
✅ Connection Closed.
```

## Troubleshooting
- **Error: No suitable driver found** → Ensure you have added the PostgreSQL JDBC driver to your project.
- **Error: Access denied** → Verify your PostgreSQL credentials.
- **Database not connecting** → Ensure PostgreSQL service is running.

## Future Improvements
- Add user input for dynamic data entry.
- Implement prepared statements for better security.
- Include a GUI interface for ease of use.


