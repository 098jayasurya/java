package Spring;

interface Payment{
    void makePayment();
}
class CreditCardPayment implements  Payment{
    public void makePayment(){
        System.out.println("payment from creditcard");
    }

}

class UpiPayment implements Payment{
    public void makePayment(){
        System.out.println("payent from UPI");
    }
}

class CashPayment implements Payment{
    public void makePayment(){
        System.out.println("payment from CashPayment");
    }
}

class FoodOrder{
    private Payment payment;
    public FoodOrder(Payment payment){
        this.payment = payment;
    }
    
    public void makePayment(){
    payment.makePayment();
    }

}
public class mini_Second {
    public static void main(String[] args) {
        CreditCardPayment  cPayment = new CreditCardPayment();
        UpiPayment upiPayment= new UpiPayment();
        CashPayment cashPayment = new CashPayment();

        FoodOrder f1 = new FoodOrder(cashPayment);
        FoodOrder f2 = new FoodOrder(cPayment);
        FoodOrder f3 = new FoodOrder(upiPayment);

        f1.makePayment();
        f2.makePayment();
        f3.makePayment();
    }
    
}
