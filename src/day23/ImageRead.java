package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

public class ImageRead {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "Mithu07*";


        try {
            Connection connection = DriverManager.getConnection(URL, userName, password);

            String SQL = "Select * from imagetable";

            Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(SQL);

         while(resultSet.next()){
             String imageName = resultSet.getString("name");

             Blob image = resultSet.getBlob(2);

             //converting it into byte streams because it is a BLOB
          byte content[]=   image.getBytes(1L,(int)image.length());

             FileOutputStream fos = new FileOutputStream("./textout.txt");
             fos.write(content);
         }

        } catch (Exception e) {
        }
    }
}
