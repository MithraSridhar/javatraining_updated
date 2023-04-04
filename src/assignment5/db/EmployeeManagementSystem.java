package assignment5.db;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/employeedb";
        String db_userName = "root";
        String db_password = "Mithu07*";

        Connection connection = DriverManager.getConnection(URL,db_userName,db_password);


        Scanner scanner = new Scanner(System.in);

        boolean input = true;
        while(input){

            System.out.println("Please select operation to perform");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Update user details");
            System.out.println("4. Delete user");
            System.out.println("5. Exit process");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter username");
                    String username = scanner.nextLine();
                    System.out.println("Enter username");
                    String password = scanner.nextLine();

                    Statement statement = connection.createStatement();

                    String SQL1 = "select * from employeedetails;";

                    ResultSet resultSet = statement.executeQuery(SQL1);
                    List<String> usernameList = null;
                    List<String> passwordList = null;
                    while (resultSet.next()) {
                        usernameList.add( resultSet.getString("username"));
                        passwordList.add( resultSet.getString("password"));
                    }
                    if(usernameList.contains(username) && passwordList.contains(password)){
                        System.out.println("Valid User");
                    }
                    else{
                        System.out.println("Invalid User");
                    }
                    resultSet.close();
                    statement.close();
                    connection.close();
                    break;

                case 2:
                    System.out.println("Enter User ID");
                    int userID = scanner.nextInt();
                    System.out.println("Enter Name");
                    String Name = scanner.nextLine();
                    System.out.println("Enter Contact Number");
                    long contactNumber = scanner.nextLong();
                    int contactNumber1 = (int) contactNumber;
                    System.out.println("Enter Address");
                    String address = scanner.nextLine();

                    String SQL2 = "INSERT INTO employeedetails VALUES (?,?,?,?,?,?)";

                    PreparedStatement preparedStatement = connection.prepareStatement(SQL2);

                    preparedStatement.setString(1,"NULL");
                    preparedStatement.setString(2,"NULL");
                    preparedStatement.setInt(3,userID);
                    preparedStatement.setString(4, Name);
                    preparedStatement.setString(5, String.valueOf(contactNumber1));
                    preparedStatement.setString(6,address);
                    
                    Boolean result =   preparedStatement.execute();
                    System.out.println(result);
                    preparedStatement.close();

                    System.out.println("You have successfully completed the registration");
                    System.out.println("Please enter username");
                    String username1 = scanner.nextLine();
                    System.out.println("Please enter username");
                    String password1 = scanner.nextLine();

                    String updateSQL = "UPDATE employeedetails SET username = '"+username1+"', password= '"+password1+"' WHERE id = "+userID+";";
                    Statement updateStatement = connection.createStatement();
                int updateCount =    updateStatement.executeUpdate(updateSQL);
                if(updateCount>0){
                    System.out.println("Username and password updated successfully");
                }
                    updateStatement.close();
                    connection.close();
                    break;

                case 3:
                    System.out.println("What detail would you like to update?");
                    String updateDetail = scanner.nextLine();
                    if(!updateDetail.equalsIgnoreCase("contact number")){
                        System.out.println("You can update only contact number");
                    }
                    else{
                        System.out.println("Please enter User ID");
                        int userIDUpdate = scanner.nextInt();
                        String updateSQL1 = "UPDATE employeedetails SET contactnumber = '"+updateDetail+"'' WHERE id = "+userIDUpdate+";";
                        Statement updateStatement1 = connection.createStatement();
                        int updateCount1 =    updateStatement1.executeUpdate(updateSQL1);
                        if(updateCount1>0){
                            System.out.println("Contact number updated successfully");
                        }
                        updateStatement1.close();
                        connection.close();
                        break;

                    }

                case 4:
                    System.out.println("Enter User ID");
                    int userIdDelete = scanner.nextInt();
                    String SQLDelete ="DELETE FROM employeedetails WHERE id='"+userIdDelete+"';";
                    Statement deleteStatement = connection.createStatement();
                    Boolean delete =deleteStatement.execute(SQLDelete);
                    if(delete){
                        System.out.println("User delete not successful");
                    }
                    else{
                        System.out.println("User deleted successfully");
                    }
                    deleteStatement.close();
                    connection.close();
                    break;

                case 5:
                    System.out.println("User chose to terminate to process");
                    input=false;
                    break;

                default:
                    System.out.println("Invalid input");
                    input=false;
                    break;
            }

        }

    }

}
