import java.util.*;

public class DateDemo{
	public static void main(String[] args){
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		
		Date d2 = new Date();
		d2.setTime(-1737436427399L);
		System.out.println(d2);

		d1.setMonth(8);
		System.out.println(d1);
		System.out.println(d1.getYear());				System.out.println(1900+d1.getYear());

		Stack stack = new Stack();
		stack.push("111");
		stack.push("222");
		stack.push("333");
		stack.push("444");
		stack.push("555");
		
		System.out.println("We can get 222 after popping "+stack.search("222")+" elements");

	}
}