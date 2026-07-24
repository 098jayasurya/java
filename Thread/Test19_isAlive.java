package Thread;

public class Test19_isAlive {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread10 mt = new MyThread10();
		System.out.println("In main #1: " + mt.getState() + " " + mt.isAlive());
		
		mt.start();
		System.out.println("In main #2: " + mt.getState() + " " + mt.isAlive());
		
		Thread.sleep(50);
		System.out.println("In main #4: " + mt.getState() + " " + mt.isAlive());
		
		Thread.sleep(150);
		System.out.println("In main #5: " + mt.getState() + " " + mt.isAlive());

		System.out.println("main end");
	}
}

class MyThread10 extends Thread {
	
	@Override
	public void run() {
		System.out.println("run start");
		System.out.println("In run  #3: "+ getState() + " " + isAlive());

		try {
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("run end");
	}
}
