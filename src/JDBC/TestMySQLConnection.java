package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {

    static String username = "root";
    static String password = "Cla@5027jesuschrist";
    static String dbdUrl = "jdbc:mysql://localhost:3306/phpblog?useUnicode=true&use" +
            "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbdUrl, username, password);
            System.out.println("Connection Established to MySQL Database");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            conn.close();
        }

    }

}
