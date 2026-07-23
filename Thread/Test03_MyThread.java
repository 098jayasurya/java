package Thread;

public class Test03_MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("\nrun start");

        System.out.println("run end");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        Test03_MyThread mt = new Test03_MyThread();
        mt.start();
        System.out.println("main end");
    }
    
}
