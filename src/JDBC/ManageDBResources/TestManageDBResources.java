package JDBC.ManageDBResources;

import java.sql.Connection;
import java.sql.SQLException;

public class TestManageDBResources {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            conn = DBUtil.getConnection(DBType.MYSQLDB);
            System.out.println("Connection Established to Database successfully");
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        } finally {
            conn.close();
        }

    }

}
