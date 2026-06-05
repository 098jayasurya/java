package polymorphism;

class Circle extends Shape {

      private static final double PI = 3.14;
      private double r;

      public Circle(double r) {
          this.r = r;
      }
      
      @Override 	
      void findArea() {//overriding with Cicle implementation
            System.out.println("Circle area: "+ (PI * r * r));
      }
}