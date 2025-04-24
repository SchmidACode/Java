import java.sql.*;

public class Main {

    public static void main(String[] args) {
//        String url = "jdbc:sqlserver://localhost\\-\\SQLEXPRESS:1433;databaseName=PD_212;integratedSecurity=true;Connect Timeout=30;Encrypt=True;TrustServerCertificate=True;";
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=PD_212;integratedSecurity=true;Connect Timeout=30;Encrypt=True;TrustServerCertificate=True;";


        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM Directions");

            while (results.next()) {
                byte id = results.getByte("direction_id");
                String name = results.getString("direction_name");
                System.out.println(id + "\t\t" + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
