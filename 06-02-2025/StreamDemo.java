import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class StreamDemo{
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(new Integer[]{22,13, 32, 91, 56, 77, 8, 90});
	
		System.out.println("Initial list -> "+list);
		
		Predicate<Integer> p = (x) -> x%2 == 0;
		
		Stream<Integer>  s = list.stream();
		
		Stream<Integer> en = s.filter(p);
		
		List<Integer> eList = en.collect(Collectors.toList());

		System.out.println("Even numbers -> "+eList);
	
		List<Integer> oList = list.stream().filter(p.negate()).collect(Collectors.toList());
			
		System.out.println("Odd numbers -> "+oList);

		List<Integer> dList = list.stream().map((x) -> x*2).collect(Collectors.toList());

		System.out.println("Double List -> "+dList);

		//Below will result in 5 elements as we've first skipped two elements then used limit(5)
		List<Integer> sList = list.stream().sorted().skip(2).limit(5).collect(Collectors.toList());

		//Below will result in 3 elements as we've used limit(5) then skipped two elements.
		//List<Integer> sList = list.stream().sorted().skip(2).limit(5).collect(Collectors.toList());

		System.out.println("Sorted list -> "+sList);
		
		System.out.print("Generating random phone no -> ");
		Random random = new Random();
		System.out.print(9);
		random.ints(9l, 0, 9).forEach(System.out::print);
		System.out.println();

		System.out.print("Generating number in range 1-10 using IntStream class -> ");
		IntStream is = IntStream.rangeClosed(1, 10);
		is.forEach(System.out::print);
		System.out.println();

		System.out.print("Calculating sum for 1-10 numbers using IntStream and reduce -> ");
		OptionalInt result1 = IntStream.rangeClosed(1, 10).reduce((a, b) -> a+b);	//returns OptionalInt
		//int result1 = IntStream.rangeClosed(1, 10).reduce(10, (a, b) -> a+b);	//returns int
		System.out.println(result1.getAsInt());
		
		System.out.print("Using parallel stream to perform multiple operations at a time -> ");
		int res2 = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a+b, (a, b) -> a*b);
		System.out.println(res2);

		System.out.println("Finding statistics for the given stream (1-10) using class 'IntSummaryStatistics' ");
		IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();
		System.out.println("Min\t:"+stats.getMin());
		System.out.println("Max\t:"+stats.getMax());
		System.out.println("Count\t:"+stats.getCount());
		System.out.println("Average\t:"+stats.getAverage());
		System.out.println("Sum\t:"+stats.getSum());
	}	
}