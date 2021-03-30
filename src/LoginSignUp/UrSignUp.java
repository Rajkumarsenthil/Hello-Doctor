/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSignUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author lenovo
 */
public class UrSignUp {
      public static String createTable(String name,String dob,String age,String gender,String address,String contact,String uname,String pwd,String repwd) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hellodoctor","shiva","Siva@0911");
           String query="insert into user_details values(?,?,?,?,?,?,?,?,?)";
           PreparedStatement p=con.prepareStatement(query);
           p.setString(1,name);
           p.setString(2,dob);
           p.setString(3,age);
           p.setString(4,gender);
           p.setString(5,address);
           p.setString(6, contact);
           p.setString(7,uname);
           p.setString(8,pwd);
           p.setString(9,repwd);
           int res=p.executeUpdate();
           con.setAutoCommit(true);
           con.close();
           return "Success";
        }
       catch(Exception e)
       {
           System.out.println("--->"+e);
           return "Unsucces";
       }
    }
}
