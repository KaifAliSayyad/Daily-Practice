import java.sql.*;
import java.io.*;

public class JdbcDemo2{
	public static void main(String[] args){
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "tiger");
			Statement stmt = con.createStatement();
		){
			Class.forName("org.postgresql.Driver");
		
			//Using callable statement
			//CallableStatement cstmt = con.prepareCall("CALL get_records()");
			//cstmt.execute();
		
			//closing connections
			//cstmt.close();

			//Using Batch Statements

			/*
			stmt.addBatch("insert into employee values('Aman', 22)");
			stmt.addBatch("insert into employee values('Bman', 23)");
			stmt.addBatch("insert into employee values('Cman', 24)");
			stmt.addBatch("insert into employee values('Dman', 25)");
			stmt.addBatch("insert into employee values('Eman', 26)");
			stmt.addBatch("insert into employee values('Fman', 27)");
			stmt.addBatch("insert into employee values('Gman', 28)");

			System.out.println("Wait for 10 seconds for the batch to be executed...");
			Thread.sleep(10000);

			stmt.executeBatch();
	
			System.out.println("Batch statment has be executed!!");
		
			*/

			printTable("employee", stmt);
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static void printTable(String tableName, Statement stmt){
		try{
			ResultSet rs = stmt.executeQuery("select * from "+tableName);
			while(rs.next()){
				System.out.println("Name\t:"+rs.getString(1));
				System.out.println("Age\t:"+rs.getInt(2));
				System.out.println();
			}
		}catch(Exception e){
			System.out.println(e);	
		}
	}
}