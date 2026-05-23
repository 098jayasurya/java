package Arrays;


public class arrlog {
    static int[] addsub(int a,int b){
        int[] res = new int[2];
        res[0] = a +b;
        res[1] = a - b;
        return res;


    }
    public static void main(String[] args) {
        int[] result = addsub(3,4);
        System.out.println("add"+result[0]+"sub"+result[1]);
    }
}
