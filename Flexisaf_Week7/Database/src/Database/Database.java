package Database;

import java.sql.*;

public class Database {

    public Database() {
        // Initialize database connection and execute queries
        Connection connection = null;
        String url = "jdbc:postgresql://localhost:5432/flexisaf-Week7-8";
        String username = "postgres";
        String password = "123456789";

        try {
        	
        	// Load the PostgreSQL JDBC driver
//            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // CREATE DATA TABLE 
            String createTable = "CREATE TABLE IF NOT EXISTS flexi (\n"
                    + "        id SERIAL PRIMARY KEY,\n"
                    + "        FirstName VARCHAR (24) not Null,\n"
                    + "        LastName VARCHAR (24) not NULL,\n"
                    + "        Address VARCHAR (255) not NULL,\n"
                    + "        Occupation VARCHAR (100),\n"
                    + "        Date Date\r\n"
                    + ")";
            statement.executeUpdate(createTable);
            System.out.println("✅ Table Created (if not exists)!");

            // INSERT DATA 
            String insert = String.format("INSERT INTO flexi (Firstname, Lastname, Address, Occupation, date)\n"
                    + "VALUES ('Ajayi', 'opeyemi', '13 Fatai Oguns, Dalemo, Alakuko', 'Annotator', '2000-5-08')");
            statement.executeUpdate(insert);

            // UPDATE DATA 
            String update = ("UPDATE flexi\r\n"
                    + "set firstname = 'Olufemi'\r\n"
                    + "WHERE id = 3");
            statement.executeUpdate(update);

            // DELETE DATA 
            System.out.println("✅ Data Updated!");
            String delete = ("DELETE from flexi\r\n"
                    + "WHERE id = 6");
            statement.executeUpdate(delete);
            System.out.println("✅ Data Deleted!");
            
            String print = ("Select * \r\n"
                    + "FROM Flexi");
            ResultSet resultSet = statement.executeQuery(print);

            while (resultSet.next()) {
                System.out.println(
                    resultSet.getInt("id") + " | " +
                    resultSet.getString("FirstName") + " | " +
                    resultSet.getString("LastName") + " | " +
                    resultSet.getString("Address") + " | " +
                    resultSet.getString("Occupation") + " | " +
                    resultSet.getDate("Date")
                );
            }
            

        } catch (SQLException e) {
            System.out.println("❌ SQL Error: " + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("✅ Connection Closed.");
                }
            } catch (SQLException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Database();  // Run Database Operations
    }
}
