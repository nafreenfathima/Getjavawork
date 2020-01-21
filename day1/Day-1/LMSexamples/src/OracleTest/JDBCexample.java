package OracleTest;
import java.sql.*;
  public class JDBCexample {
	public static void main(String args[]){  
	try{  
	//step1 load the driver class  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	 
	//step2 create  the connection object  
	Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
	 
	//step3 create the statement object  
	Statement stmt=con.createStatement();  
	 
	//step4 execute query  
	ResultSet rs=stmt.executeQuery("select * from emp");  
	while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getString(2));  
	 
	//step5 close the connection object  
	con.close();  
	 
	}catch(Exception e){ System.out.println(e);}  
	 
	}  
	}  



