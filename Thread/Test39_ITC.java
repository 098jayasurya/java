package Thread;


class Factory{
    private int items;
    private boolean itemsAvailable;

    public synchronized void produce(int items) {
        while(itemsAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.items = this.items + items;
        System.out.println("items produced "+items);
        itemsAvailable=true;

        notify();
    }

    public synchronized void consume(int items){
        while(!itemsAvailable){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.items = this.items - items;
        System.out.println("items consumed " + items);
        itemsAvailable = false;

        notify();
    }
}

class ProducerThread extends Thread{
    private Factory fa;
    public ProducerThread(Factory fa){
        this.fa = fa;
    }

    @Override
    public void run(){
        for(int i = 1;i<=10;i++)
            fa.produce(i);
    }
}

class ConsumerThread extends Thread{
    private Factory fa;
    public ConsumerThread(Factory fa){
        this.fa = fa;
    }
    @Override
    public void run(){
        for(int i=1;i<=10;i++)
            fa.consume(i);
    }
}
public class Test39_ITC {
    public static void main(String[] args){
    Factory factory = new Factory();
    ProducerThread pa = new ProducerThread(factory);
    ConsumerThread ca = new ConsumerThread(factory);

    pa.start();
    ca.start();
    }
}
