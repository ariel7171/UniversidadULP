
package universidadulp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    private static String server = "localhost";
    private static String database = "proyectouniv";
    private static String userName = "root";
    private static String password = "";
    private static String driverClassName = "org.mariadb.jdbc.Driver";
    
    private static String url = "jdbc:mariadb://" + server + "/" + database; 
    
    private static Connection connection;
    
    public static Connection getInstance() throws SQLException{
        
        if (connection == null || connection.isClosed()) {
            // Utilizamos el nuevo nombre de clase del controlador
            
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException e) {
                throw new SQLException("mariaDB JDBC Driver not found");
            }
            
            connection = DriverManager.getConnection(url, userName, password);
        }
        
        return connection;
        
    }

    public static Connection getConnection() {
        return connection;
    }

}
