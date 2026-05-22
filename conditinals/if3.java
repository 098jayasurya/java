package conditinals;

public class if3 {

    static void m1(int a){
		System.out.println("Before if-else");
		
		if(a ==10)
			System.out.println("Hi");
		else
			System.out.println("Hello");
		
		System.out.println("After if-else");

	}
	
    public static void main(String[] args) {
		// if(false)
		// 	System.out.println("Hi-1");
		// 	System.out.println("Hello-1");
			
		// if(false);
		// 	System.out.println("Hi-2");
		// 	System.out.println("Hello-2");

		// //if(false)
		// //	int a = 10;
		// 	System.out.println("Hi-3");
		// 	System.out.println("Hello-3");
			
		// if(false);
		// 	int a = 10;
		// 	System.out.println("Hi-4");
		// 	System.out.println("Hello-4");
			m1(10);
		
		m1(15);
	}
}
