package org.example;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String URL="jdbc:mysql://localhost:3306/student";
        String USER="root";
        String PASSWORD="vortex11";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection(URL,USER,PASSWORD);

        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException e){
            throw new RuntimeException(e);

        }
        System.out.println("hello ");
    }
    }
