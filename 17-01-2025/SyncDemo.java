class A implements Runnable{
	public void run(){
		//System.out.println(Thread.currentThread().getName()+" is waiting for the permission");
		//System.out.println(Thread.currentThread().getName()+" has got the permission");			
			for(int i = 1; i <= 20 ; i++){
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try{	
					Thread.sleep(500);	
				}catch(InterruptedException e){
					System.out.println(e);
				}
			
		}
		
	}
}

public class SyncDemo{
	public static void main(String[]  args){
		A a1 = new A();

		//a1.start()
		/*
		Above creation of thread gives error, as start() method is not been implement in Runnable interface, it has been implemented in Thread class, therefore we need to create a Thread class object.
		*/
		

		ThreadGroup tg1 = new ThreadGroup("Demo1");
		ThreadGroup tg2 = new ThreadGroup("Demo2");

		Thread t1 = new Thread(tg1, a1);
		Thread t2 = new Thread(tg1, a1);
		Thread t3 = new Thread(tg2, a1);
		Thread t4 = new Thread(tg2, a1);
		
		t1.setDaemon(true);

		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t4.setName("D");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		for(int i = 1 ; i <= 20 ; i++){
			System.out.println("main : "+i);
			try{
				if(i == 10) tg1.suspend();
				if(i == 15) tg1.resume();
				Thread.sleep(500);
			}catch(InterruptedException e){

			}

		}

		/*
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){

		}
		*/
		System.out.println("Main Exit......");
	}
}