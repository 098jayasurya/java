package conditinals;

public class iff {
    // static void m1(int a){
    //     System.out.println("HI");

    //     if(a==10){
    //         System.out.println("Hello");
    //     }
    //     System.out.println("HRU\n");

    // }

    static void m1(int a){
        if(a == 5){
            System.out.println("hi1");

        }
        System.out.println("hello1");

        if(a==10){
            System.out.println("hi2");
        }
        System.out.println("Hello2\n");
    }
    public static void main(String[] args) {
        m1(5);
        m1(10);
        m1(20);

    }


    // static void m1(int a) {
	// 	System.out.println("Hi");

	// 	if(a=10){
	// 		System.out.println("Hello");
	// 	}
		
	// 	System.out.println("HRU?\n");
	// }
	
	// public static void main(String[] args) {
	// 	m1(10);  
	// 	m1(15);
	// }
}