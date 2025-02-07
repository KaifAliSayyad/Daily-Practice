import java.util.concurrent.*;

public class ConcurrencyDemo3{
	public static void main(String[] args) throws Exception{
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
			for(int i = 1 ; i <= 10 ; i++){
				System.out.println("Using supplyAsync : "+i);
			
				try{
					Thread.sleep(2000);
						
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			return "Complete the execution...";
		}).orTimeout(1, TimeUnit.SECONDS).exceptionally(s -> "Cf1 has timed out.");


		CompletableFuture.runAsync(() -> {
			for(int i = 1 ; i <= 10 ; i++){
				System.out.println("Using runAsync : "+i);
			}
		});

		CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
			int res = 0;
			for(int i = 1 ; i <= 100 ; i++){
				res += i;
			}
			
			return res;
		});

		CompletableFuture<Double> cf3 = CompletableFuture.supplyAsync(() -> {
			for(int i = 1 ; i <= 10 ; i++){
				System.out.println("Using supplyAsync for the Double type: "+i);
			}
		
			return 24.45;
		});

		CompletableFuture<Void> f = CompletableFuture.allOf(cf1, cf2, cf3);
		//f.join();

		cf2.thenApplyAsync((x) -> {
			System.out.println("Result of Summing till 100 is : "+x);
			return x;
		});	


		System.out.println("Result -> "+cf1.get());

		//Thread.sleep(1000);
		System.out.println("Main Exit. ");
	}
}