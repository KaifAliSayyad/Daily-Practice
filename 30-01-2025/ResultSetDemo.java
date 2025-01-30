import java.sql.*;
import java.io.*;

public class ResultSetDemo{
	
	private static final String url = "jdbc:postgresql://localhost:5432/demodb";
	private static final String uname = "postgres";
	private static final String pwd = "tiger";

	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection(url, uname, pwd);
		//Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
		/* rs cannot be updated using rs.update() also it cannot be iterated backwards using rs.previous() */

		//Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		/* rs can be updated using rs.update() but it cannot be iterated backwards using rs.previous() */

		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		/* rs can be updated using rs.update() also it can be iterated backwards using rs.previous() */

		ResultSet rs = stmt.executeQuery("select * from employee");
	
		System.out.println("Moving forward..");
		while(rs.next()){
			System.out.println("Name\t: "+rs.getString(1));
			System.out.println("Age\t: "+rs.getInt(2));
			System.out.println("--------------------------------------------------");

		}

		System.out.println("--------------------------------------------------");

		System.out.println("Moving backward..");
		while(rs.previous()){	
			System.out.println("Name\t: "+rs.getString(1));
			System.out.println("Age\t: "+rs.getInt(2));
					System.out.println("--------------------------------------------------");

		}

		System.out.println("--------------------------------------------------");

		System.out.println("Moving at position 3..");
		rs.absolute(3);{	
			System.out.println("Name\t: "+rs.getString(1));
			System.out.println("Age\t: "+rs.getInt(2));
		}

		System.out.println("--------------------------------------------------");

		System.out.println("Moving relative to current position by -2..");
		rs.relative(-2);{	
			System.out.println("Name\t: "+rs.getString(1));
			System.out.println("Age\t: "+rs.getInt(2));
		}

		System.out.println("--------------------------------------------------");

		System.out.println("Moving to last element..");
		rs.last();{	
			System.out.println("Name\t: "+rs.getString(1));
			System.out.println("Age\t: "+rs.getInt(2));
		}

		System.out.println("--------------------------------------------------");

		System.out.println("Moving to first element..");
		rs.first();{	
			System.out.println("Name\t: "+rs.getString(1));
			System.out.println("Age\t: "+rs.getInt(2));
		}

		//We also have rs.beforeFirst() and rs.afterLast(),
		//rs.isFirst() and rs.isLast()
		//rs.isBeforeFirst() and rs.isAfterLast()		
	}
}