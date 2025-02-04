import java.util.*;
import java.util.function.*;

class A implements Consumer<String>{
	
	public void accept(String str){
		System.out.print(str+", |A| ");
	}
}


class B implements Consumer<String>{
	public void accept(String str){
		System.out.print(str+", |B| ");
	}
}

class C{
	public static void writeToFile(String str){
		System.out.println("Written to file "+str);
	}

	public void writToCsv(String str){
		System.out.println("Written to CSV file "+str);
	}
}
public class ForEachMethod{
	public static void main(String[] args){
		List<String> employees = Arrays.asList("Suman", "Sujatha", "Supriya", "Sunita");

		System.out.println("Using class A");
		employees.forEach(new A());
		System.out.println("\n\nUsing class B method");
		employees.forEach(new B());
		System.out.println("\n\nUsing class C class method");
		employees.forEach(C::writeToFile);
		System.out.println("\nUsing class C instance method");
		employees.forEach(new C()::writToCsv);
		System.out.println("\nUsing lambda expression");
		employees.forEach((arg) -> System.out.println("Printing : "+arg));
		System.out.println("\nUsing lambda expression with method reference ");
		employees.forEach(System.out::println);
	}
}