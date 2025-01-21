import java.util.*;

public class BitSetDemo{
	public static void main(String[] args){
		BitSet b1 = new BitSet(128);
		System.out.println(b1.length());
		
		BitSet b2 = new BitSet(128);
		System.out.println(b2.length());
			
		for(int i = 0 ; i < 15 ; i++){
			if(i % 3 == 0){
				b1.set(i);
			}
		}

		for(int i = 0 ; i < 15 ; i++){
			if(i % 2 == 0){
				b2.set(i);
			}
		}

		System.out.println(b1.length());
		System.out.println(b1);

		System.out.println(b2.length());
		System.out.println(b2);
	
		//b1.and(b2);		//Intersection of b1 and b2
		//System.out.println(b1);

		//b1.or(b2);		//Union of b1 and b2
		//System.out.println(b1);
	
		b1.xor(b2);	//Union - Intersection
		System.out.println(b1);
	}
}