package expressions;

public class incdec {
    public static void main(String[] args) {
        // int a;
        // a = 10;
        // a++;
        // System.out.println(a);

        // int b;
        // b = 10;
        // b--;
        // System.out.println(b);

        // int x;
        // x = 10;
        // System.out.println(++x);
        // System.out.println("x :" + x );

        // x = 10;
        // System.out.println(x++);
        // System.out.println("x :" + x);

        // int x = 10;
		// int y = ++x;
	
		// System.out.println("x: "+x);
		// System.out.println("y: "+y);
		// System.out.println();

		// x = 10;
		// y = x++;
		
		// System.out.println("x: "+x);
		// System.out.println("y: "+y);

        // int x = 1;		
		
		// int y = x++ + ++x ;		
		
		
		// System.out.println("x: " + x);
		// System.out.println("y: " + y);
		// System.out.println();
        

        // x = 1;
		// y = x++ + ++x + x++ + x-- + --x + ++x;


		// System.out.println("x: "+ x);
		// System.out.println("y: "+ y);
		// System.out.println();
        

        // x = 1;
		// y = ++x + --x - x-- + x++ - ++x;

		// System.out.println("x: "+x);
		// System.out.println("y: "+y);
		// System.out.println();

        
		// x = 1; 
		// y = x++ + ++x + x++ + x++ + --x + x-- - ++x;

		// System.out.println("x: "+x);
		// System.out.println("y: "+y);
		// System.out.println();

        // x = 1;
		// x++;
		// y = x++ + ++x - x-- + --x;
		// System.out.println("x: "+x);
		// System.out.println("y: "+y);
		// System.out.println();

        // int[] a = {5, 10, 15};
		// int i = 0,num;			
		//  num = a[++i] + ++i + (++i);

        // System.out.println("i: "+i);
		// System.out.println("num: "+num);           
		// System.out.println();

        // i = num = 0;
		// num = a[i++] + i++ + (i++);
		
		
		// System.out.println("i: "+i);
		// System.out.println("num: "+num);
		// System.out.println();

        // 	int p = 001, q=010, r=100;
        // int s = --p + q++ - r-- - --r + ++q - --p + q-- - --p;
		
         
        // System.out.println("p="+p);
        // System.out.println("q="+q);
        // System.out.println("r="+r);
        // System.out.println("s="+s);

        // char ch = "123".charAt(1);
        // System.out.println(ch++ + ++ch);
        // System.out.println(ch);

        // char ch2 = 'a';
        // System.out.println(++ch2);

        // char ch3 = 'a';
        // System.out.println(ch3++);


        int x = 1;
		x = ++x;
		
		System.out.println(x);

		x = 1;
		x = x++;
		
		System.out.println(x);


        // int i = 1;
		// if (i++ == 1){
		// 	System.out.println("Hi");
		// }
		// System.out.println(i);
		// System.out.println();

		// i = 1;
		// if (++i == 1){
		// 	System.out.println("Hello");
		// }
		// System.out.println(i);
        int i = 1;
		while (i++ <= 4){
			System.out.println(i + "->Hello");
		}
		System.out.println(i);
		System.out.println();

		i = 1;
		while (++i <= 4){
			System.out.println(i + "->Hello");
		}
		System.out.println(i);
    }
}
