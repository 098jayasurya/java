package setget;

public class bank {
    public static void main(String[] args) {
        bankAccount b1 = new bankAccount();
        b1.setAccNum(823808230);
        b1.setBankName("hdfcbank");
        b1.setActive(true);

        b1.display();
    }
}
