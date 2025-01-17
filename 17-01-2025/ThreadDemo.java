public class ThreadDemo{
	public static void main(String[] args) throws Exception{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		a1.start();
		a1.start();
		b1.start();
		c1.start();

		a1.setPriority(9);


		for(int i = 0 ; i <= 20 ; i++){
			System.out.println("from Main : "+i);
			Thread.sleep(10);
		}

		a1.join();
		System.out.println("Main Exit.......");	
	}

}

class A extends Thread{
	public void run(){
		for(int i = 1 ;  i <= 20 ; i++){
			try{
				System.out.println("from A with thread name : "+this.getName()+" -> "+i);
				if(i % 2 == 0) Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i = 1 ;  i <= 20 ; i++){
			try{
				System.out.println("from B with thread name : "+this.getName()+" -> "+i);
				if(i % 2 == 0) Thread.sleep(200);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class C extends Thread{
	public void run(){
		for(int i = 1 ;  i <= 20 ; i++){
			try{
				System.out.println("from C with thread name : "+this.getName()+" -> "+i);
				if(i % 2 == 0) Thread.sleep(200);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
