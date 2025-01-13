import java.io.*;
import java.sql.*;
import java.lang.*;


class A{
	public void abc(){
		int a = 5;
		for(int i = 1; i <= 20 ; i++){
			try{
				System.out.println(i);
				int res = a / (a-i);
				if(i == 150){
					throw new NullPointerException();
				}
				if(i == 150){
					throw new IOException();
				}
				if(i == 100){
					throw new SQLException();
				}
				if(i == 2){
					throw new UserException();
				}
				if(i == 4){
					throw new UserException("when i is 4");
				}
				if(i == 6){
					throw new UserExceptionChecked("when i is 6, checked exception is thrown");
				}
			}
			catch(IOException | SQLException e){
				System.out.println("handled by IO/ SQL Exception handler.....");
			}
			catch(NullPointerException e){
				System.out.println("handled by Null Pointer exception handler...");
			}
			catch(UserException e){
				System.out.println("handled by custom handler for UserException..");
				//e.printStackTrace();
				e.display();
			}
			catch(Exception e)	//universal exception handler (it handles UserExceptionChecked, if it is not present and it is not handled then UserExceptionChecked exception will give compile time error 'checked exception not handled')
			{
				System.out.println("handled by Default Exception handler ;) ");
			}
			finally{
				System.out.println("This should print regarless of any exceptions...");
			}
		System.out.println("Program continues...");
		}
	}

	public void xyz(){
		abc();
	}

	public void atoz(){
		xyz();
	}
}

public class ExceptionDemo{
	public static void main(String[] args){
		A a1 = new A();
		a1.atoz();
	}
}


class UserException extends RuntimeException{
	public UserException(){
		System.out.println("This is custom user defined exception...");
	}
	
	public UserException(String e){
		super(e);
		System.out.println("This is custom user defined exception with message : "+e);
	}

	public void display(){
		System.out.println("Example of custom method which can be used");
	}
}


class UserExceptionChecked extends Exception{		//
	public UserExceptionChecked(){
		System.out.println("This is custom user defined exception...");
	}
	
	public UserExceptionChecked(String e){
		super(e);
		System.out.println("This is custom user defined exception with message : "+e);
	}

	public void display(){
		System.out.println("Example of custom method which can be used");
	}
}