import java.util.concurrent.*;

public class ConcurrencyDemo{
	public static void main(String[] args){

		Semaphore sem = new Semaphore(2);

		new IncThread("Inc:1", sem);
		new DecThread("Dec:1", sem);
		new IncThread("Inc:2", sem);
		new IncThread("Inc:3", sem);
		new DecThread("Dec:2", sem);
		new DecThread("Dec:3", sem);
		new IncThread("Inc:4", sem);
		new IncThread("Inc:5", sem);
		new DecThread("Dec:4", sem);
		new DecThread("Dec:5", sem);
		new DecThread("Dec:6", sem);
		new IncThread("Inc:6", sem);
	}
}

class Shared{
	static int count = 0;

}

class IncThread extends Thread{

	String name;
	Semaphore sem;

	public IncThread(String name, Semaphore sem){
		this.name = name;
		this.sem = sem;
		new Thread(this).start();
	}

	public void run(){
		try{
			System.out.println(name+" is waiting for permission ");
			sem.acquire();
			System.out.println(name+" has got the permission ");
			for(int i = 1 ; i <= 5 ; i++){
					System.out.println(name+" : "+ ++Shared.count);
					Thread.sleep(300);
			}
			System.out.println(name+" is has released the critical section");
			sem.release();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


class DecThread extends Thread{

	String name;
	Semaphore sem;

	public DecThread(String name, Semaphore sem){
		this.name = name;
		this.sem = sem;
		new Thread(this).start();
	}

	public void run(){
		try{
			System.out.println(name+" is waiting for permission ");
			sem.acquire();
			System.out.println(name+" has got the permission ");
			for(int i = 1 ; i <= 5 ; i++){
					System.out.println(name+" : "+ --Shared.count);
					Thread.sleep(300);
			}
			System.out.println(name+" is has released the critical section");
			sem.release();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}