package JDBC;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * TestMsAccessConnection.java
 */
public class TestMsAccessConnection {

    static String dbURL = "jdbc:ucanaccess://C:\\Users\\Christ\\IdeaProjects\\LearningJavaProgram\\src\\JDBC\\AccessDb\\StudentDb.accdb";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement preparedStatement;
        Scanner sc = null;
        try {
            conn = DriverManager.getConnection(dbURL);
            System.out.println("Connection Established to MsAccess Database");

            // Create a new record
            /*preparedStatement = conn.prepareStatement("INSERT INTO Students (name, surname, dateOfBirth, stream) VALUES(?, ?, ?, ?)");

            sc = new Scanner(System.in);

            System.out.print("\nPlease enter name: ");
            String name = sc.next();

            System.out.print("\nPlease enter surname: ");
            String surname = sc.next();

            System.out.print("\nPlease enter date of birth (e.g: yyyy-MM-dd): ");
            String dateOfBirth = sc.next();

            System.out.print("\nPlease enter stream: ");
            String stream = sc.next();

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setDate(3, Date.valueOf(dateOfBirth));
            preparedStatement.setString(4, stream);

            preparedStatement.executeUpdate();*/

            // Read Records
            preparedStatement = conn.prepareStatement("SELECT * FROM Students"); // you can also use the statement object to do this operation
            ResultSet rs = preparedStatement.executeQuery();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            System.out.printf("%-13s %-15s %-20s %-13s %s\n", "Student ID", "Name", "Surname", "Date", "Stream");

            while (rs.next()) {
                System.out.printf("%-13d %-15s %-20s %-13s %s\n", rs.getInt(1),
                        rs.getString(2), rs.getString(3), dateFormat.format(rs.getDate(4)), rs.getString(5));
            }

            // Update records
            /*preparedStatement = conn.prepareStatement("UPDATE Students SET name=? WHERE studentID = 4");
            preparedStatement.setString(1, "William");
            int i = preparedStatement.executeUpdate();
            System.out.println(i);*/

            // Delete records
            /*preparedStatement = conn.prepareStatement("DELETE FROM Students WHERE studentID = ?");
            preparedStatement.setInt(1, 6);
            int i = preparedStatement.executeUpdate();
            System.out.println(i);*/

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (conn != null)
                conn.close();
        }

    } // end of main method

    /*public static String menu() {
        Scanner scanner = new Scanner(System.in);
        String option;

        System.out.println("CRUD with Access");
        System.out.println("1- Create");
        System.out.println("2- Read");
        System.out.println("3- Update");
        System.out.println("4- Delete");
        System.out.print("Choose option: ");
        option = scanner.next();

        return option;
    }*/

}
