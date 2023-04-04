package day23;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageStorage_BLOB {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "Mithu07*";


        try {
            Connection connection = DriverManager.getConnection(URL, userName, password);

            String SQL = "INSERT INTO imagetable VALUES (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,"demoImage3");

            FileInputStream fip = new FileInputStream("./image.jpg");

            preparedStatement.setBinaryStream(2,fip);

         int rowsAffected =   preparedStatement.executeUpdate();

         if(rowsAffected>0){
             System.out.println("success");
         }

        } catch (Exception e) {
        }
    }
}