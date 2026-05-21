package expressions;

public class Division {
    public static void main(String[] args) {
        
		System.out.println(22/7 * 10 * 10);		//300
		System.out.println(22.0/7 * 10 * 10);	//314.2857142857143
		
		System.out.println(1/2);
		System.out.println(10/3);
		
		System.out.println(1.0/2);  //0.5
		System.out.println(10/3.0); //3.3333333333333335

	//(0/any number) is 0	
		System.out.println(0/4);		//0
		System.out.println(0./4);		//0.0
		
	//(integer number / integer 0) leads to exception, but not infinity
		//System.out.println(10/0);		//RE: java.lang.ArithmeticException
		
	//any of the operand float or double type, not exception, output is Infinity	
		System.out.println(10.0/0);		//Infinity
		System.out.println(10/0.0);		//Infinity
		System.out.println(-10/0.0);	//-Infinity
		
	//(int 0/int 0) -> AE	
		//System.out.println(0/0);		//RE: AE
		
	//(float 0/0) -> NaN	
		System.out.println(0.0/0);		//NaN  (Not a Number)
		System.out.println(-0.0/0);		//NaN  (Not a Number)
    }
}
