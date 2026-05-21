package expressions;

public class concate {
    // Additiom operater means it "adds " the given tw0 operands
    //and generates new value
    //concatenation operator means it 'joins the given two operands
    // and generates new value'
    public static void main(String[] args) {
        
    
    int i1 = 10 + 20;

    //+ as a Ao\
    System.out.println(20 + 5);
    System.out.println('a' + 'b');
    System.out.println(20 + 'a');
    System.out.println();

    //+ as a Co

    System.out.println("a" + "b");
    System.out.println("10" + "20");
    System.out.println("50" +  70);
    System.out.println("a" + 90);
    System.out.println(90 + "a");
    System.out.println();

    //+ as a CO	
		System.out.println("" + 10 + 20);  //"1020" [both +s are COs]
	System.out.println("" + "10" + 20);
	System.out.println("10" + 20);
	System.out.println("10" + "20");
	System.out.println("1020");
    System.out.println("10"+ "" + 20);	
	System.out.println("10" + 20);	
	System.out.println("10" + "20");	
     System.out.println("1020");	


    int a = 10;
	int	b = 5;
		System.out.println("a + b: " + a + b);
	//	System.out.println("a - b: " + a - b); //CE:  bad operand types String and int for binary operator '-' 
		System.out.println("a - b: " + (a - b)); 
		System.out.println("a * b: " + a * b);
		System.out.println("a / b: " + a / b);
		System.out.println("a % b: " + a % b);
		
		// System.out.println("a - b: " + a - b);
		// System.out.println("a - b: " + 10 - 5);
		// System.out.println("a - b: " + "10" - 5);
    }
}
