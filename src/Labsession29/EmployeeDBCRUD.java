package Labsession29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDBCRUD {

    public static void main(String[] args) throws Exception {
        String dbURL = "jdbc:mysql://localhost:3306/employeecrud";
        String username = "root";
        String password = "Supraja@123"; // Replace with your MySQL password

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbURL, username, password);
       

        // 1. CREATE TABLE (if not exists)
        String createTableSQL = "CREATE TABLE IF NOT EXISTS employeesss (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(50)," +
                "department VARCHAR(50)," +
                "salary DOUBLE" +
                ")";
        Statement stmt = conn.createStatement();
        stmt.execute(createTableSQL);
        System.out.println("Table 'employees' is ready.");

        // 2. INSERT Records
        String insertSQL = "INSERT INTO employeesss (id, name, department, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);

        insertStmt.setInt(1, 101);
        insertStmt.setString(2, "Alice");
        insertStmt.setString(3, "HR");
        insertStmt.setDouble(4, 50000);
        insertStmt.executeUpdate();

        insertStmt.setInt(1, 102);
        insertStmt.setString(2, "Bob");
        insertStmt.setString(3, "IT");
        insertStmt.setDouble(4, 65000);
        insertStmt.executeUpdate();

        insertStmt.setInt(1, 103);
        insertStmt.setString(2, "Charlie");
        insertStmt.setString(3, "Sales");
        insertStmt.setDouble(4, 60000);
        insertStmt.executeUpdate();

        // 3. READ All
        System.out.println("\nAll Employees:");
        ResultSet rs = stmt.executeQuery("SELECT * FROM employeesss");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + ", " +
                               rs.getString("name") + ", " +
                               rs.getString("department") + ", " +
                               rs.getDouble("salary"));
        }

        // 4. READ by ID
        System.out.println("\nEmployee with ID = 102:");
        rs = stmt.executeQuery("SELECT * FROM employeesss WHERE id = 102");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + ", " +
                               rs.getString("name") + ", " +
                               rs.getString("department") + ", " +
                               rs.getDouble("salary"));
        }
       

        // 5. UPDATE salary of ID = 102
        String updateSalarySQL = "UPDATE employeesss SET salary = ? WHERE id = ?";
        PreparedStatement updateStmt = conn.prepareStatement(updateSalarySQL);
        updateStmt.setDouble(1, 70000);
        updateStmt.setInt(2, 102);
        updateStmt.executeUpdate();
      

        // 6. UPDATE department for Alice
        String updateDeptSQL = "UPDATE employeesss SET department = ? WHERE name = ?";
        updateStmt = conn.prepareStatement(updateDeptSQL);
        updateStmt.setString(1, "Finance");
        updateStmt.setString(2, "Alice");
        updateStmt.executeUpdate();

        // 7. DELETE employee with ID = 103
        String deleteSQL = "DELETE FROM employeesss WHERE id = ?";
        PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
        deleteStmt.setInt(1, 103);
        deleteStmt.executeUpdate(); 

        // 8. DELETE employees by department = 'Sales' (if any left)
        deleteStmt = conn.prepareStatement("DELETE FROM employees WHERE department = ?");
        deleteStmt.setString(1, "Sales");
        deleteStmt.executeUpdate();

        conn.close();
        System.out.println("\nCRUD operations completed.");
    }
}
