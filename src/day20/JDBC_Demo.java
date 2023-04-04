package day20;

import java.sql.*;

public class JDBC_Demo {

    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:mysql://localhost:3306/employeedb";
        String userName = "root";
        String password = "Mithu07*";

        Connection connection = DriverManager.getConnection(URL, userName, password);

        Statement statement = connection.createStatement();

        String SQL = "select * from employeedetails;";

        ResultSet resultSet = statement.executeQuery(SQL);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            //System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

}
