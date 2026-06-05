package polymorphism;

class Square extends Shape {
      private double s;
     
      public Square(double s){
           this.s = s;
      }

      @Override	
      void findArea() {//overriding with Square implementation
            System.out.println("Square area: "+ (s*s));
      }
}