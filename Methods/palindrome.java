package Methods;

public class palindrome {
    static void palind(int num){
        int digit = num;
        int original=num;

        int rev = 0;

        while(digit>0){
            int lastdigit = digit % 10;
            rev = rev*10 + lastdigit;
            digit = digit/10;
        }

        if(original==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        palind(555);
    }
}
