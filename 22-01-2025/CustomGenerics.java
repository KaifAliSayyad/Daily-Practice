class A <T extends Number>
{
	public void add(T a, T b){
		System.out.println(a+" , "+b+");
	}
} 

public class CustomGenerics{
	public static void main(String args[]){
		A<Double> a1 = new A<>();
		a1.add(1.11, 2.22);
	}
}