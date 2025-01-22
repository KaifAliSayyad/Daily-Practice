import java.util.*;

public class CollectionsDemo{
	public static void main(String[] args){
		List list = new LinkedList();
	
		list.add("111");
		list.add("777");
		list.add("555");
		list.add("999");
		list.add("xyz");
		list.add("abc");
		list.add("000");
		list.add("999");
		list.add("455");

		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);

		Collections.swap(list, 0, 5);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);

		
	}
}