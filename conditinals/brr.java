package conditinals;

public class brr {
    public static void main(String[] args) {
       // m1();
       // m2();
       // m3();
      //  m4();
        for(int i = 0; i < 3 ;i ++){
                for(int j=1;j<=4;j ++){
                    System.out.print(j + "  ");
                }
                System.out.println();
            }
        }
    
        static void m1(){
            System.out.println("m1 start");
            for (int i = 0; i < 10; i++) {
                System.out.println("hi" + i);
                if(i==5){
                    break;
                }
                System.out.println("hello");
            }
        }
        static void m2(){
            System.out.println("m2 start");
            for (int i = 0; i < 10; i++) {
            System.out.println("hi" + i);
            if(i==5){
                continue;
            }   
            System.out.println("hello");
            }
        }
        static void m3 (){
         System.out.println("m3 start");
         if(true){
            return;
         }
         System.out.println("m3 end");
        }

        static void m4(){
            System.out.println("m4 start");
            for(int i =1;i<=10;i++){
                System.out.println("hi " + i);
                if(i == 5){
                    return;
                }
                System.out.println("hello");
            }
            System.out.println("after for");
            System.out.println("m4 end");


            
        }
}
