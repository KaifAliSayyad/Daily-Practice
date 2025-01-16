final class Principal{
	
	private static final Principal p1 = new Principal();

	private Principal(){
	
	}

	public static Principal getPrincipal(){
		return p1;
	}

	static{
		System.out.println("From static block "+p1);
	}
}

public class Singleton{
	public static void main(String[] args){
		Principal p1 = Principal.getPrincipal();
		Principal p2 = Principal.getPrincipal();
		
		System.out.println(p1);
		System.out.println(p2);
	}
}

//There are two types of instantiation further in Singleton class
//Early : Object is already created and served when getPrincipal() is called
//Lazy : Object is created when the getPrincipal() is called for the first time.
//This is example of Early Instantiation