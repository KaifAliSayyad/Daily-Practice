import java.util.function.Predicate;
public class PredicateDemo{
	public static void main(String[] args){
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		Predicate<Integer> p1 = (x) ->  x % 2 == 0;	//for even numbers
		Predicate<Integer> p2 = (x) ->  x % 2 == 1;	//for odd numbers
		Predicate<Integer> p3 = p1.negate();		//for negation of even numbers (i.e odd nos)
		Predicate<Integer> p4 = (x) -> x > 50;
		
		System.out.println("for even numbers using function");
		evenNumber(arr);

		System.out.println("for even numbers");
		process(arr, p1);

		System.out.println("for odd numbers");
		process(arr, p2);

		System.out.println("for negation of even numbers (i.e odd numbers)");
		process(arr, p3);	//Or process(arr, p1.negate());

		System.out.println("for even numbers above 50");
		process(arr, p1.and(p4));	//even numbers above 50

		System.out.println("for odd numbers below 50");
		process(arr, p1.negate().and(p4.negate()));	//odd numbers below 50

		System.out.println("for numbers either odd or above 50");
		process(arr, p1.negate().or(p4));		//either odd or above 50
	}

	public static void evenNumber(int[] arr){
		for(int i = 0 ; i <arr.length ; i++){
			if(arr[i] % 2 == 0) System.out.println(arr[i]);
		}
		System.out.println("--------------------------------------------------");
	}

	public static void process(int[] arr, Predicate<Integer> p){
		for(Integer num : arr){
			if(p.test(num)){
				System.out.println(num);
			}
		}
		System.out.println("--------------------------------------------------");

	}
}