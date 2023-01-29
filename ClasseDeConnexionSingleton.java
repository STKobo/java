import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final class ClasseDeConnexionSingleton {
    
    private static volatile ClasseDeConnexionSingleton instance;
    private Connection connection;
    
    private ClasseDeConnexionSingleton() throws SQLException {
        try {
            Class.forName("org.mysql.Driver");
            String username = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/jdbc";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    
    public static ClasseDeConnexionSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new ClasseDeConnexionSingleton();
        } else if (instance.getConnection().isClosed()) {
            instance = new ClasseDeConnexionSingleton();
        }
        return instance;
    }
}