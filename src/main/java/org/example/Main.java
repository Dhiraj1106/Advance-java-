package org.example;

<<<<<<< HEAD
import java.sql.*;
=======
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
>>>>>>> fa4be771d5469bf4d66c3632940a10577bd20803

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String URL="jdbc:mysql://localhost:3306/student";
        String USER="root";
        String PASSWORD="vortex11";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement stmt = con.createStatement();

            //4th step(Execute query)


            DriverManager.getConnection(URL,USER,PASSWORD);


        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException e){
            throw new RuntimeException(e);

        }
        System.out.println("hello ");
    }
    }
