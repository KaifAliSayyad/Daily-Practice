import javax.sql.*;
import javax.sql.rowset.*;

public class RowSetDemo{
	public static void main(String[] args){
		try{
			//RowSetFactory rsf = new RowSetFactory.newFactory();
			//JdbcRowSet rs = rsf.createJdbcRowSet();
		
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
	
			rs.setUrl("jdbc:postgresql://localhost:5432/empdb");
			rs.setUsername("postgres");
			rs.setPassword("tiger");
		
			rs.setCommand("select * from employee");
		
			rs.execute();
			//int col = rs.getColumnCount();		//These methods won't work!!

			rs.addRowSetListener(new EmpListener());
			rs.addRowSetListener(new EmpListener2());

			while(rs.next()){
				System.out.println("Eid\t\t: "+rs.getString(1));
				System.out.println("Name\t\t: "+rs.getString(2));
				System.out.println("Age\t\t: "+rs.getString(3));
				System.out.println("Salary\t\t: "+rs.getString(4));
				System.out.println("Designation\t: "+rs.getString(5));
				System.out.println("Department\t: "+rs.getString(6));
				
			}

			rs.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


class EmpListener implements RowSetListener{

	public void cursorMoved(RowSetEvent evt){
		System.out.println("-----------------------------------------------------------");
	}

	public void rowChanged(RowSetEvent evt){
			
	}

	public void rowSetChanged(RowSetEvent evt){
		
	}
}

class EmpListener2 implements RowSetListener{

	public void cursorMoved(RowSetEvent evt){
		System.out.println("CursorMoved CursorMoved CursorMoved CursorMoved CursorMoved CursorMoved CursorMoved ");
	}

	public void rowChanged(RowSetEvent evt){
			
	}

	public void rowSetChanged(RowSetEvent evt){
		
	}
}