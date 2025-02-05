import java.util.*;
public class OptionalDemo{
	public static void main(String[] args){
		Integer i1 = null;
		Integer i2 = 20;
	
		Optional<Integer> o1 = Optional.ofNullable(i1);
		Optional<Integer> o2 = Optional.ofNullable(i2);
		add(o1, o2);
	}

	public static void add(Optional<Integer> o1, Optional<Integer> o2){
		Integer i1 = o1.orElse(0);
		Integer i2 = o2.orElse(0);
		System.out.println(i1 + i2);
	}
}