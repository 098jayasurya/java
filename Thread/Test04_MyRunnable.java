package Thread;

public class Test04_MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("run start");
        System.out.println("run end");
    }

    public static void main(String[] args) {
        System.out.println("main start");

        Test04_MyRunnable mr = new Test04_MyRunnable();
         //mr.start();
        
        Thread th1 = new Thread(mr);
        th1.start();

        System.out.println("main end");
    }
}
