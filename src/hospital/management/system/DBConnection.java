/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Akshay Baburaj
 */
public class DBConnection {

Connection con =null;
public Connection openDBConnection()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_Management_System" ,"root","Akshay@2000");

}
catch(Exception e)
{
System.out.println(e);
}
return con;
}
}
    

