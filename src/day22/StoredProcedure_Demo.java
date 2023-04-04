package day22;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoredProcedure_Demo {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "Mithu07*";
        try {
            Connection connection = DriverManager.getConnection(URL, userName, password);

            //to run stored procedure
            CallableStatement callableStatement = connection.prepareCall("{call emp_procedure(?)}");

            callableStatement.setInt(1, 1);
            callableStatement.execute();

        } catch (Exception e) {


        }
    }
}
