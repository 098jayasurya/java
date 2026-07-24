package Thread;

public class Test22_ThreadPriority {
    public static void main(String[] args) {
        
        MyThread16 mt = new MyThread16();
        MyThread16 mt1 = new MyThread16();

        System.out.println(mt.getPriority());
        System.out.println(mt1.getPriority());
        System.out.println("");

        mt.setPriority(9);
        mt1.setPriority(7);

        System.out.println(mt.getPriority());
        System.out.println(mt1.getPriority());
        System.out.println("");
        

        mt.start();
        mt1.start();
    }
}

class MyThread16 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println(getName()+"run " + i);
        }
    }
}
