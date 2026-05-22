package conditinals;

public class if2 {
    public static void main(String[] args){
        if(true){
            int a = 10;
            System.out.println(a);
        }
       // System.out.println(a);
       int a;
       if(true){
        a=10;
       }
       System.out.println(a);

       int b;
       if(false){
        b = 10;
       }
      // System.out.println(b);

      int p = 10;
      int c;
      if(p == 10){
        c = 30;
        System.out.println(c);
      }
     // System.out.println(c);
     System.out.println();

     int q = 10;
     int d = -1;
     if(q == 10){
        d = 30;
        System.out.println(d);
     }
     System.out.println(d);
     System.out.println();

     final int r = 10;
     int e;
     if(r == 10){
        e = 40;
        System.out.println(e);
     }
     System.out.println(e);

     final int s;
		s  = 10;
		int f ;
		if(s == 10){
			f = 50;
			System.out.println(f);
		}
		//System.out.println(f);
		System.out.println();
    }
}
