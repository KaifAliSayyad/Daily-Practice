/*
This pattern is used when we need to implement some logic before deciding whether to create an object or not.
For example I do not want to allow more than 5 Principals to be created.
*/

public class Factory{
	public static void main(String[] args){
		Principal p1 = Principal.getPrincipal();
		Principal p2 = Principal.getPrincipal();
		Principal p3 = Principal.getPrincipal();
		Principal p4 = Principal.getPrincipal();
		Principal p5 = Principal.getPrincipal();
		Principal p6 = Principal.getPrincipal();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
	}

	
}

final class Principal{
	static int count = 0;

	private Principal(){
	
	}

	public static Principal getPrincipal(){
		if(count++ < 5) return new Principal();
		else return (Principal)null;
	}

}

//This is example of Lazy Instantiation