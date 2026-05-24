package Methods;

public class perfectnumber {
    static void perfectornot(int a){
        int sum = 0;
        for(int i=1;i<a;i++){
        if(a%i==0)
            sum += i;
        }

        if(sum == a)
            System.out.println("number is perfect");
        else
            System.out.println("not a perfect");
    }
    public static void main(String[] args) {
        perfectornot(6);
    }
}
