import java.io.*;
public class KeyInput{
	public static void main(String[] args){
		
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
		
			System.out.print("Please enter your name : ");
			String name = br.readLine();
			
			System.out.print("Enter your age : ");
			int age = Integer.parseInt(br.readLine());

		
			System.out.println("Your name is : "+name);
			System.out.println("You age after 10 years is : "+(age + 10));

		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}

/* In the above code we are using System.in is our source, and InputStreamReader is used to convert ByteSream (keyboard) to CharacterStream (unicode) and stored in Buffer, then we are using BufferedReader to read from buffer. */