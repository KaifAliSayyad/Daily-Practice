import java.sql.*;
import java.io.*;

public class JdbcDemo{
	public static void main(String[] args){
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "tiger");
			Statement stmt = con.createStatement();
		){
		
			//Class.forName("org.postgres.Driver");

			//int affected = stmt.executeUpdate("insert into employee values('Kaif', 21), ('Sanchit', 49)");
			//System.out.println(affected + " row(s) affetced");


			PreparedStatement ps = con.prepareStatement("insert into employee values(?, ?)");

			System.out.print("Enter name : ");
			String name = br.readLine();
			System.out.print("Enter age  : ");
			int age = Integer.parseInt(br.readLine());

			ps.setString(1, name);
			ps.setInt(2, age);
			boolean isSuccessful = ps.execute();

			System.out.println(isSuccessful);	
			
			
			ResultSet rs = stmt.executeQuery("select * from employee");
			while(rs.next()){
				System.out.println("Name\t:"+rs.getString("Name"));
				System.out.println("Age\t:"+rs.getInt(2));
				//If we are not specific about the type..we can always use getString()
				System.out.println();
			}

		}catch(Exception e){
			System.out.println(e);
		}
	}
}