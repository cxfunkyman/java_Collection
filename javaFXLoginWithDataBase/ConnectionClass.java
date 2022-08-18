package SQLdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	void ConnectClass() {

		try (Connection conn = DriverManager.getConnection (
				"CONNECTION STRING", "USERNAME", "PASSWORD")) {

			if (conn != null) {
				System.out.println("Connected to the database!");
			}

			else {
				System.out.println("Failed to make connection!");
			}
		} 

		catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} 

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	void TableCreate() {
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	void TableSelect() {
		
	}
} 

