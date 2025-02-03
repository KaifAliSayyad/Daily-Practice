public interface InterfaceDemo{

	
	public static void main(String[] args){
		System.out.println("Hello");
		I obj = new I(){
			public void abc(){
				System.out.println("Hello from interface I.abc() ");
			}
		};
		obj.xyz();
		obj.abc();


		I.atoz();
		
		B b = new B();
		
		//b.hello();		//Gives error 'urelated types'
		

		b.hello();
	}

	
}


interface I{

	
	public void abc();	//upto v7
	
	public default void xyz(){	//from v8
		System.out.println("Hello from interface I.xyz() ");
	}


	public static void atoz(){	//from v8
		System.out.println("Hello from interface I.atoz() ");
	}

	private void demo(){		//from v9
		System.out.println("With private method in interface");
	}
}

interface X{
	public default void hello(){
		System.out.println("From X interface hello() method");
	}
}

interface Y{
	public default void hello(){
		System.out.println("From Y interface hello() method");
	}
}

class B implements X, Y{
	
	/* Without this implementation/ overriding we cannot use method hello() which is common for both the interfaces, as it imposes problem of multiple inheritance. */
	public void hello(){
		X.super.hello();
		Y.super.hello();
	}
}