package Thread;

public class MyThread extends Thread{
    private int x;
    public MyThread(int x) {
        this.x = x;
    }

    @Override
    public void run(){
        for(int i= x; i>=1;i--)
            System.out.println(getName() + "run" + i);
    }

    public static void main(String[] args) {
        System.out.println("main start");
        MyThread mt1 = new MyThread(20);
        mt1.start();
        MyThread mt2 = new MyThread(10);
        mt2.start();

        System.out.println("main end");

    }
    
}
