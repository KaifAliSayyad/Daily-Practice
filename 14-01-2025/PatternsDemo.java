import java.util.regex.*;

public class PatternsDemo{
	public static void main(String[] args){
		String s1 =  "Hello World";
		String s2 = "hell";
	
		Pattern p1 = Pattern.compile(s2);
		Matcher m1 = p1.matcher(s1);

		System.out.println(s1+" contians "+s2+" : "+m1.find());
		
		System.out.println("______________________________________________________________");
		
		String email = "abc@gmailcom";
		String regularExpression = "[a-zA-Z0-9.]+@[a-zA-Z]+\\.com";
		Pattern p2 = Pattern.compile(regularExpression);
		Matcher m2 = p2.matcher(email);

		System.out.println(m2.find());

	System.out.println("______________________________________________________________");
		
		String mobNo = "8022775595";
		String regularExpression2 = "^[9|8][0-9]{9}$";
		Pattern p3 = Pattern.compile(regularExpression2);
		Matcher m3 = p3.matcher(mobNo);

		System.out.println(m3.find());

		
	}
}