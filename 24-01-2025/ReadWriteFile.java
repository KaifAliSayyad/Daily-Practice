import java.util.StringTokenizer;
import java.io.*;
public class ReadWriteFile{
	public static void main(String[] args) throws Exception{
		int ch = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do{
			System.out.println("----------------------------");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			System.out.println("----------------------------");
			System.out.print("Enter choice : ");
			ch = Integer.parseInt(br.readLine());
			switch(ch){
				case 1 -> new Person().writeToFile();
				case 2 -> Person.display();
				case 3 -> System.out.println("Exitting...");
			}
			
		}while(ch != 3);
	}
}

class Person{

	private String name;
	private int age;
	private int salary;
	private String designation;

	public Person(){
		readDetails();
	}	

	public void readDetails(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter name :");
			name = br.readLine();
			System.out.print("Enter age : ");
			age = Integer.parseInt(br.readLine());
			System.out.print("Enter salary : ");
			salary = Integer.parseInt(br.readLine());
			System.out.print("Enter designation : ");
			designation = br.readLine();
		}catch(Exception e){
			System.out.println(e);
		}

	}

	public void writeToFile() throws Exception{				
		System.out.println("Writing to file..");

		PrintWriter pw = new PrintWriter(new FileOutputStream("employees.csv", true));
		pw.println(name+", "+age+", "+salary+", "+designation);
		pw.flush();
	}

	public static void display(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("employees.csv"));

			String line = null;
			while((line = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line, ",");
				System.out.println("Name : "+st.nextToken());
				System.out.println("Age : "+st.nextToken());
				System.out.println("Salary : "+st.nextToken());
				System.out.println("Designation : "+st.nextToken());
				System.out.print("-------------------------------------------------------");

			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}