package Thread;

class Addition{
    private int x;
    private int y;

    synchronized void add(int x,int y){
        String name = Thread.currentThread().getName();
        System.out.println(name+"start");
        this.x=x;
        this.y=y;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int res=this.x + this.y;
        System.out.println(name +" result" + res);
        System.out.println(name +" end");
    }
}

class Thread1 extends Thread{
    private Addition a;

    public Thread1(Addition a){
        this.a=a;
    }
    @Override
    public void run(){
        a.add(70, 80);
    }
}

class Thread2 extends Thread{
    private Addition a;

    public Thread2(Addition a){
        this.a=a;
    }
    @Override
    public void run(){
        a.add(50, 80);
    }
}
public class Test33_Synchronization {
    public static void main(String[] args) {
        Addition a = new Addition();

        Thread1 th1 = new Thread1(a);
        Thread2 th2 = new Thread2(a);

        th1.start();
        th2.start();
    }
}
