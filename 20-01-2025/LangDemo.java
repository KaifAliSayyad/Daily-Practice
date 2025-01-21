import java.util.Scanner;
import java.lang.reflect.*;

public class LangDemo{
	public static void main(String[] args) throws InterruptedException{
		A a1 = new A(10);
		A a2 = new A(20);
		A a3 = new A(30);

		//a2.finalize();

		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(a3.x);

		//a1 = null;
		//a2 = null;
		//a3 = null;

		//System.gc();
		//Thread.sleep(1000);
	
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the class name : ");
			Class c1 = Class.forName(sc.nextLine());
			Object obj = c1.newInstance();
			System.out.println(obj);

			System.out.println("Methods present in A : ");
			Method[] methods = c1.getMethods();
			for(Method method : methods) print(method);

			System.out.println("\nFields present in A : ");
			Field[] fields = c1.getFields();
			for(Field field : fields) System.out.println(field);

			System.out.println("Constructors present in A : ");
			Constructor[] constructors = c1.getConstructors();
			for(Constructor constructor : constructors) System.out.println(constructor);
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void print(Method method){
		for(Class c : method.getParameterTypes()) System.out.print(c+" ");
		System.out.println(method.getReturnType()+" "+method.getName()+"()");
	}
}

class A{
	int x;
	
	public A(){
		int x = -1;
	}

	public A(int x){
		this.x = x;
	}

	@Override
	public void finalize(){
		System.out.println("Object with x value : "+x+" is getting removed...");
	}

	@Override
	public String toString(){
		return "Object of class A with x = "+x;
	}
}