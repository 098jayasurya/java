 package Arrays;
public class Test_02array{
    public static void main(String[] args){
        int [] ia = new int [5];
        System.out.println(ia[0]); 
        System.out.println(ia[1]);
        System.out.println(ia[2]);
        System.out.println(ia[3]);
        System.out.println(ia[4]);

        ia[0] = 1;
        ia[1] = 2;
        ia[2] = 3;
        ia[3] = 4;
        ia[4] = 5;

        System.out.println(ia[0]); 
        System.out.println(ia[1]);
        System.out.println(ia[2]);
        System.out.println(ia[3]);
        System.out.println(ia[4]);


        int[] ia2 = {2,3,4,5,6};

        System.out.println(ia2[0]); 
        System.out.println(ia2[1]);
        System.out.println(ia2[2]);
        System.out.println(ia2[3]);
        System.out.println(ia2[4]);

        int[] ia3 = new int[] {3,5,6,5,4};
        System.out.println(ia3[0]); 
        System.out.println(ia3[1]);
        System.out.println(ia3[2]);
        System.out.println(ia3[3]);
        System.out.println(ia3[4]);
        System.out.println();
        for(int i=0;i<ia3.length;i++){
            System.out.println(ia3[i]);
        }
    }
}
