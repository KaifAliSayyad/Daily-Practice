public class MethodReferences{
	public static void main(String[] args){
		I i1 = () -> System.out.println("From lambda expression");
		i1.abc();

		//I i2 = A::classMethod;
		//i2.abc();
		
		//I i3 = new A()::instanceMethod;
		//i3.abc();

		//I i4 = A::new;
		//i4.abc();

		I i5 = B::demo;
		i5.abc();

		J j1 = () -> new String("From getObject() method in interface J");
		System.out.println(j1.getObject());
		J j2 = B::new;
		System.out.println(j2.getObject());

		J j3 = Thread::new;
		System.out.println(j3.getObject());
	}
}

interface I{
	void abc();
}

interface J{
	Object getObject();
}

class A{
	public A(){
		System.out.println("From Constructor A()");
	}

	public static void classMethod(){
		System.out.println("From static class method");
	}

	public void instanceMethod(){
		System.out.println("From instance method");
	}
}

class B{
	public static void demo(){
		System.out.println("From B class demo() method ");
	}
}