package Methods;

public class m2{
    static boolean  oddeven(int a){
        if(a%2 != 0)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        boolean res =oddeven(5);
        if(res == true)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
    }
}