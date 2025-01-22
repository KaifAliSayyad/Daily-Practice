class A

{

	public class B

	{

		public class C

		{

			public void demo()

			{

				System.out.println("I am coming from the innermost class method");

			}

		}

	}

	static class D{
		static class E{
			public static void demo2(){
				System.out.println("Helpp!!");
			}
		}
	}

}

public class InnerClasses

{

	public static void main(String args[])

	{
		//A a1 = new A.B.C();
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.demo();

		new A().new B().new C().demo();

		A.D.E.demo2();

	}

}
 
/*
class A

{

	public class B

	{

		public class C

		{

			public void demo()

			{

				System.out.println("I am coming from the innermost class method");

			}

		}

	}

	static class D{
		class E{
			public static void demo2(){
				System.out.println("Helpp!!");
			}
		}
		//Class E cannot be static for demo() to be static
	}

}
*/