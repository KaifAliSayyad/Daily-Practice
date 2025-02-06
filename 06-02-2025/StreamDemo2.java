import java.util.*;
import java.util.stream.*;


public class StreamDemo2{
	public static void main(String[] args){
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(11, "Rajesh");
		map.put(22, "Rakesh");
		map.put(33, "Ramesh");
		map.put(44, "Suresh");
		map.put(55, "Dinesh");
		map.put(66, "Gukesh");
		
		//As map cannot be directly converted to stream, we need to first get entrySet()
		System.out.println("Printing all Keys in map");
		map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);

		System.out.println("Printing all Values in map");
		map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
			
		System.out.println("Printing all names with id > 30");
		map.entrySet().stream().filter(me -> me.getKey() > 30).map(Map.Entry::getValue).forEach(System.out::println);

		System.out.println("Working with multiple sources at once ");
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		Set<Integer> l2 = new TreeSet<Integer>();
		l2.add(4);	l2.add(5);	l2.add(6);	l2.add(7);
		List<Integer> l3 = Arrays.asList(8, 9, 10);

		List<Collection<Integer>> list = Arrays.asList(l1, l2, l3);
		
		System.out.println("All the sources concatenated = "+list);
			
		System.out.print("All the sources converted into stream using flatMap and doubled = ");
		list.stream().flatMap(lst -> lst.stream()).map(x -> x * 2).forEach(x -> System.out.print(x+", "));
	}
}