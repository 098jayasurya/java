package Methods;

public class primenumber {
    static void prime(int p){
        int count=0;
        for(int i = 1;i<=p;i++){
            if(p%i==0)
                count++;
        }
        if(count==2)
            System.out.println("prime");
        else
            System.out.println("not a prime");
    }
    public static void main(String[] args) {
        prime(11);
    }
}
