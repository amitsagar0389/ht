import java.sql.*;
import java.io.*;
import java.util.*;


//weblogic.jar must be in the classpath and datasource with the specified name must be created and deployed and application server must be running


//type 3 driver


class Three
{
public static void main(String args[]) throws Exception
{


Driver myDriver=(Driver)Class.forName("weblogic.jdbc.rmi.Driver").newInstance();

String url = "jdbc:weblogic:rmi";

Properties props = new Properties();
props.put("weblogic.server.url","t3://localhost:7001");
props.put("weblogic.jdbc.datasource", "amazon");



Connection con = myDriver.connect(url, props);

Statement stmt=con.createStatement();


ResultSet rset=stmt.executeQuery("select * from customer");


while(rset.next())
{
System.out.println(rset.getString(1)+"\t"+rset.getString(2));
}

}
}




