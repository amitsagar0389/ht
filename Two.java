import java.sql.*;
import java.io.*;

//type 2 driver

class Two
{
public static void main(String args[]) throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:oci:@xe","vijay","india");

Statement stmt=con.createStatement();

ResultSet rset=stmt.executeQuery("select * from student ");

while(rset.next())
{
System.out.println(rset.getString(2)+"   "+rset.getString(1));
}

}
}




