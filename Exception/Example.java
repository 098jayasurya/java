package Exception;

public class Example {
    void m1(int x){
        if(x <= 0){
            throw new IllegalArgumentException("do not pass -ve num or zero");
        }
        System.out.println("you passed correct value congrats you fucked up");
    }
}
