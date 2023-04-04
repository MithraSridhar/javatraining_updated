package day22;

import java.sql.*;

public class ResultSet_MetaData {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "Mithu07*";
        try {
            Connection connection = DriverManager.getConnection(URL, userName, password);
            String SQL = "select * from employee;";

            //database meta data
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println( databaseMetaData.getDriverName());
            System.out.println( databaseMetaData.getUserName());


            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);

            //result set meta data
            //getting meta data from result set - col details
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData.getColumnCount());
            System.out.println(resultSetMetaData.getPrecision(2));

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
