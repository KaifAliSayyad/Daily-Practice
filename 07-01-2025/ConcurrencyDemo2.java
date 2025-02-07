import java.util.concurrent.*;

public class ConcurrencyDemo2{
	public static void main(String[] args) throws Exception{
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		es.submit(new Greet());
		Future<Integer> f1 = es.submit(new Sum(5));
		Future<Integer> f2 = es.submit(new Sum(10));

		System.out.println("Sum till 5 = "+f1.get());
		System.out.println("Sum till 10 = "+f2.get());

		es.shutdown();
	}
}

class Greet implements Runnable{
	public void run(){
		for(int i= 1; i <=10 ; i++){
			System.out.println("From Greet : "+i);
		}
	}
}

class Sum implements Callable{
	
	int val;
	Sum(int val){
		this.val = val;
	}

	public Integer call(){
		int res = 0;
		for(int i= 1; i <=val ; i++){
			res += i;

		}

		return res;
	}
}