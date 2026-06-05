package polymorphism;

class Painter { //User class
   public static void main(String[] args ) {
 
      
       Shape s;

       s = new Rectangle(10, 5);	//Loose Coupling
       s.findArea();			//Runtime Polymorphsinm
					//executed from Rectangle class	
       s = new Square(10);
       s.findArea();			//RP - executed from Square class

       s = new Circle(10);	
       s.findArea();			//RP - executed from Rectangle class
 
	Painter hk = new Painter();
	hk.draw(new Rectangle(10, 5) );
	hk.draw(new Square(10));
	hk.draw(new Circle(10));

   }

   void draw(Shape s){  //LC- any of the sub type can be passed and can be changed
           s.findArea();      //RP- executes from the sub class whose object is passed
   }

}