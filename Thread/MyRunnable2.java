package Thread;

public class MyRunnable2 implements  Runnable{

    @Override
    public void run(){
        for(int i = 20;i>=1;i--){
            System.out.println(" run i "+ i);
        }
    }

    public static void main(String[] args) {
        MyRunnable2 mr = new MyRunnable2();

        Thread mt = new Thread(mr);
        mt.start();

        for( int i=1;i<21;i++)
        System.out.println("main i " + i);
    } 
    
}
