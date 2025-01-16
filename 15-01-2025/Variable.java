public class Variable{

	static int a;

	// static var x;	//var is only allowed as local variable, and cannot be declared as instance variable

	public static void main(String[] args){
		int b;
		System.out.println(a);
		//System.out.println(b);	//Error : b might not have been initialised
		
		var c = 10;
		System.out.println(c);
		
		//c = "Hello";
		//System.out.println(c);
		//We cannot change data type of c dynamically as JAVA is statically typed language
		
		//var d;	//Gives error as it is not initialised
		//System.out.println(d);

		//var f;
		//f = "Hi";
		//System.out.println(f);
		//Error : error: cannot infer type for local variable f
		
		var g = "HI";
		System.out.println(g);

		int var = 6;
		System.out.println(var);
		//We can use 'var' as variable name
		//But we cannot use 'var' as class name
	
		var arr = new int[5];
		System.out.println(arr.length);
		//We can also use var to later assign it array

		int choice = 1;			//Are allowed
		//String choice = "1";		//Are allowed	
		//Double choice = "1.0";	//Not allowed
		//enum Gender{MALE, FEMALE}	//Allowed
		switch(choice){
			case 1, 6 ->System.out.println("ONE");
			case 2 -> System.out.println("TWO");
			case 3 ->{
				System.out.println("THREE");
				System.out.println("THREE TWICE");
			}
			case 4 -> System.out.println("FOUR");
			case 5 -> System.out.println("FIVE");
			default -> System.out.println("DEFAULT");
		}
		
		//Some new syntax in switch block

		enum Month{JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

		String weather = 
		switch(Month.MAR){
			case JAN, FEB, MAR -> "SPRING";
			case APR, MAY, JUN -> "SUMMER";
			case JUL, AUG, SEP -> "RAINY";
			case OCT, NOV, DEC -> "WINTER";
			default -> "DEFAULT";
		};
		System.out.println(weather);
		//If we have '=' before switch block, that means we are expecting a return value from the switch block.

	}
}