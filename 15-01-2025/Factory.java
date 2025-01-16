
public class Factory{
	public static void main(String[] args){
		Principal p1 = Principal.getPrincipal();
		Principal p2 = Principal.getPrincipal();
		
		System.out.println(p1);
		System.out.println(p2);
	}

	
}

final class Principal{

	private static Principal p1;
	private Principal(){
	
	}

	public static Principal getPrincipal(){
		if(p1 == null) p1 = new Principal();
		return p1;
	}

	static{
		System.out.println("From static block "+p1);
	}
}

//This is example of Lazy Instantiation