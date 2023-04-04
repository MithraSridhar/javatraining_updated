package day21;

import java.sql.*;

public class Statement_demo {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "Mithu07*";
        try {
            Connection connection = DriverManager.getConnection(URL, userName, password);
            String SQL = "select * from employee;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
