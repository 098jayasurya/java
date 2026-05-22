package conditinals;

public class if4 {
    static void isEven(int a){
        if(a%2==0){
            System.out.println("even");
        }else
            System.out.println("odd");
    }
    public static void main(String[] args) {
        isEven(2);
    }
}
