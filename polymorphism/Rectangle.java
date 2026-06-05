package polymorphism;

class Rectangle extends Shape {  //Inheritance

     private double l;		//Encapuslation	
     private double b;

     public Rectangle(double l, double b){
            this.l = l;
	    this.b = b;
     }

     @Override	
     void findArea(){   //Polymorphsim (overriding)
			//overrding with Reactangle implementation	
         System.out.println("Rectangle Area: " +(l * b)));
     }
}