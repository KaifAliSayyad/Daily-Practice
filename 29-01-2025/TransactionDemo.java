import java.sql.*;
import java.io.*;

public class TransactionDemo{
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "tiger"); Statement stmt = con.createStatement();PreparedStatement pstmt = con.prepareStatement("insert into employee values(? ,?)");){
			
			con.setAutoCommit(false);
			
			int choice = 0;

			do{	
				System.out.println("0. Exit");
				System.out.println("1. Add");
				System.out.println("2. Rollback");
				System.out.println("3. Save (this will save changes and cannot be rollbacked) ");
				choice = Integer.parseInt(br.readLine());

				switch(choice){
					case 0 :
						break;
					case 1 : 
						System.out.print("Enter Name : ");
						String name = br.readLine();
						System.out.print("Enter Age  : ");
						int age = Integer.parseInt(br.readLine());
						pstmt.setString(1, name);
						pstmt.setInt(2, age);	
						pstmt.execute();
						break;
					case 2 :
						con.rollback();
						System.out.println("All the previous entries have been rollbacked!");
						break;
					case 3 :
						con.commit();
						System.out.println("Employees saved successfully!!");
						printTable("employee", stmt);
						break;
					default: System.out.println("Invalid option!!");
				}
			}while(choice != 0);
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