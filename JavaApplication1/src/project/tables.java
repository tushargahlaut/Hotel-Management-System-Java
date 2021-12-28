/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class tables {
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try
        {
           con=ConnectionProvider.getCon();
           st=con.createStatement();
          st.executeUpdate("CREATE TABLE users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(200),answer varchar(200),address varchar(200),status varchar(20))");
          st.executeUpdate("CREATE TABLE room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
          st.executeUpdate("CREATE TABLE customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200), gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int(10),numberofDaysStay int(10),totalAmount varchar(200),checkout varchar(50))");
           st.executeUpdate("CREATE TABLE employee(id varchar(10),name varchar(200),age varchar(200),email varchar(200),mobile varchar(20),address varchar(200),gender varchar(20),nationality varchar(50),occupation varchar(200),salary varchar(20))");
           JOptionPane.showMessageDialog(null,"Table Created Successfully");
        }
        catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try{
                con.close();
                st.close();
            }
            catch(Exception e)
            {}
        }
    }
}
