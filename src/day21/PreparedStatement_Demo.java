package day21;

import java.sql.*;

public class PreparedStatement_Demo {

        public static void main(String[] args) throws SQLException {
            String URL = "jdbc:mysql://localhost:3306/demo";
            String userName="root";
            String password="Mithu07*";
            try {
                Connection connection = DriverManager.getConnection(URL, userName, password);
                String SQL = "INSERT INTO employee VALUES (?,?)";

                PreparedStatement statement = connection.prepareStatement(SQL);

                int id =2;
                String name ="Ram";
                statement.setInt(1,id);
                statement.setString(2,name);

           Boolean result =   statement.execute();
                System.out.println(result);
                statement.close();
                connection.close();
            }
            catch (Exception exception){
                exception.printStackTrace();
            }
        }
}
