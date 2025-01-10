package p1;

public class A{
	public int x = 10;
	private int y = 20;
	protected int z = 30;
	int q = 40; 	//default

	public void display(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(q);
	}

	public static void main(String[] args){
		
	}
}

class B extends A{
	public void display(){
		System.out.println(x);
		//System.out.println(y);
		System.out.println(z);
		System.out.println(q);
	}
}

class C extends B{
	
}