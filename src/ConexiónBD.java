
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexiónBD {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                String url = "jdbc:oracle:thin:@localhost:1521:xe"; //Por si lo quieres para oracle seria asi "jdbc:oracle:thin:@localhost:1521:xe"; y para mysql "jdbc:mysql://localhost/nombreBasedatos"
                String user = "login";
                String passwd = "1234";
                con = DriverManager.getConnection(url, user, passwd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
