/**
 * 
 */
package jdbc;

/**
 * @author Nuril Hijas
 *
 */

import java.sql.*;
 
public class sum {
 
    /**
     * @param args
     */
 
    // TODO Auto-generated method stub
	void show()
	{
	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:4040/nametable","root","");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT SUM(salary)from addtwo");  
			while(rs.next())  
			{
				String username=rs.getString(1);
				String password=rs.getString(2);
			System.out.println(username+"  "+password); 
			}
			con.close();  
			}catch(Exception e){ System.out.println(e);
			
			}  
		}
	
	public static void main(String args[]){  
	sum s=new sum();
	s.show();
} 
}