import java.sql.*;
import java.io.*; 

public class ReadFromTable{

	private static final String url = "jdbc:postgresql://localhost:5432/demodb";
	private static final String uname = "postgres";
	private static final String pwd = "tiger";

	public static void main(String[] args){
		try{
			Connection con = DriverManager.getConnection(url, uname, pwd);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter table name : ");
			String table = br.readLine();
		
			Statement stmt = con.createStatement();	
			
			ResultSet rs = stmt.executeQuery("select * from "+table);

			/*
			while(rs.next()){
				
				System.out.println(rs.String());
				System.out.println(rs.String());
				System.out.println(rs.String());
			}
			*/
			/*The problem with above implementation is that, we cannot really work with dynamically given tables as we do not know metadata about the columns present in them. Therefore we need to use ResultSetMetaData interface. */

			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			
			while(rs.next()){
				for(int i = 1 ; i <= columns ; i++){
					System.out.println(rsmd.getColumnName(i)+"\t\t:"+rs.getString(i));
				}
				System.out.println();
			}
			
			br.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}