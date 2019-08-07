package JDBC.ManageDBResources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String mySlqUser = "root";
    private static final String mySlqPwd = "Cla@5027jesuschrist";
    private static final String mySQLS = "jdbc:mysql://localhost:3306/phpblog?useUnicode=true&use" +
            "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String msAccess = "jdbc:ucanaccess://C:\\Users\\Christ\\IdeaProjects\\LearningJavaProgram\\src\\JDBC\\AccessDb\\StudentDb.accdb";

    public static Connection getConnection(DBType dbType) throws SQLException {
        switch (dbType) {
            case ACCESSDB:
                return DriverManager.getConnection(msAccess);
            case MYSQLDB:
                return DriverManager.getConnection(mySQLS, mySlqUser, mySlqPwd);
            default:
                return null;
        }
    }

    public static void showErrorMessage(SQLException e) {
        System.err.println("Error :" + e.getMessage());
        System.err.println("Error Code :" + e.getErrorCode());
    }

}
