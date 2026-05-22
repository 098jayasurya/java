package conditinals;

public class iff {
    static void m1(int a){
        System.out.println("HI");

        if(a==10){
            System.out.println("Hello");
        }
        System.out.println("HRU\n");
    }
    public static void main(String[] args) {
        m1(10);
        m1(15);
    }
}
