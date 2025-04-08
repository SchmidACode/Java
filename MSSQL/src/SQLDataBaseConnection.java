import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDataBaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;integratedSecurity=true;databaseName=PD_212";
    public SQLDataBaseConnection() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                System.out.println("Connected");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
