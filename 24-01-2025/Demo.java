public class Demo{
	{
		System.out.println("This is init block...");
	}

	public Demo(){
		System.out.println("From Demo constructor..");
	}

	static{
		System.out.println("This is static block");
	}

	public static void main(String[] args){
		System.out.println("From main method...");

		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
	}
}