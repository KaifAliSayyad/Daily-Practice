@FunctionalInterface
interface I{
	public void abc();
	public boolean equals(Object obj);

	public default void hello(){
		System.out.println("Hello from interface I.hello() " );
	}
	
	public static void hello2(){
		System.out.println("Hello from interface I.hello2() ");

	}
}

public class FunctionalInterfaceDemo{
	public static void main(String[] args){

		System.out.println("Using anonymous inner class " );

		I ob = new I(){
			public void abc(){
				System.out.println("Hello from I.abc() ");
			}	
		};

		ob.abc();
		ob.hello();
		I.hello2();
	
		System.out.println("Using Lambda expression..");
		
	
		I i = () -> System.out.println("Printing from lambda expression for abc() method");
		
		i.abc();
		i.hello();
		I.hello2();
	}
}