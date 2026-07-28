package Spring;

interface Payment{
    void pay();
}

class Creditcard implements  Payment{
    public void pay(){
        System.out.println("paid from Creditcard");
    }
}

class UpiPayment implements Payment{
    public void pay(){
        System.out.println("paid from UpiPayment");
    }
}

class cashPayment implements Payment{
    public void pay(){
        System.out.println("paid from cashPaymnent");
    }
}


class OrderService{
    private final Payment payment;
    public OrderService(Payment payment){
        this.payment = payment;
    }

    public void placeOrder(){
        payment.pay();
    }
}
public class payment_mode {
    public static void main(String[] args) {
        OrderService os = new OrderService(new Creditcard());
        os.placeOrder();

        OrderService os1 = new OrderService(new UpiPayment());
        os1.placeOrder();

        OrderService os2 = new OrderService(new cashPayment());
        os2.placeOrder();
    }
    
}
