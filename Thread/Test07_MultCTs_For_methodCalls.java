package Thread;


class m1Thread extends Thread{
    @Override
    public void run(){
        Example.m1();
    }
}
class m2Thread extends Thread{
    @Override
    public void run(){
        Example.m2();
    }
}
class m3Thread extends Thread{
    @Override
    public void run(){
        Example.m3();
    }
}
public class Test07_MultCTs_For_methodCalls {
    public static void main(String[] args) {
    System.out.println("main start");
    m1Thread mt1 = new m1Thread();
    m2Thread mt2 = new m2Thread();
    m3Thread mt3 = new m3Thread();

    mt1.start();
    mt2.start();
    mt3.start();

    System.out.println("main end");
}   
}
