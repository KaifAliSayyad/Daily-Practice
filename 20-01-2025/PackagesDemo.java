public class PackagesDemo{
	public static void main(String[] args) throws Exception{
		Runtime rt =  Runtime.getRuntime();

		System.out.println("Demo for Runtime...wait 5 seconds");
		Thread.sleep(5000);
		Process p1 = rt.exec("C:\\Users\\Wissen\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe");
		Thread.sleep(3000);
		Process p2 = rt.exec("mspaint.exe");
		
		rt.exec("cls");
		
		System.out.println("5 seconds to close paint..");
		Thread.sleep(5000);
		p2.destroy();
		System.out.println("10 seconds to close vs code..");
		Thread.sleep(10000);
		p1.destroy();
		System.out.println("We're good to go..");
	}
}