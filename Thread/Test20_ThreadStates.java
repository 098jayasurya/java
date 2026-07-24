package Thread;

public class Test20_ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        MyThread14 mt = new MyThread14();
        System.out.println("in main "+mt.getState());
        mt.start();
        System.out.println("in main " + mt.getState());
        Thread.sleep(1000);
        System.out.println("in main s4"+ mt.getState());
        Thread.sleep(3000);
        System.out.println("in mainn s4 "+mt.getState());

        System.out.println("main end");
    }
}

class MyThread14 extends Thread{
    @Override
    public void run(){
        System.out.println("run start");
        System.out.println("in run s3 :" + getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run end");
    }
}

