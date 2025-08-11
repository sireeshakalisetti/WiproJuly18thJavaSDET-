package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/Studentrepo";
		String username = "root";
		String password = "Sireesha@2002";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbURL,username,password);// TODO Auto-generated method stub
        Statement st = con.createStatement();
        String selectquery = "select * from students;";
        ResultSet rs = st.executeQuery(selectquery);
        while(rs.next()) {
        	System.out.println(rs.getString("name"));
        	System.out.println(rs.getString("class"));
        }
	}

}
