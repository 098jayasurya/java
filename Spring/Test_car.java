package Spring;

interface Engine{
    void start();
}
class DieselEngine implements Engine{
    public void start(){
        System.out.println("Diesel engine started");
    }
}

class PetrolEngine implements Engine{
    public void start(){
        System.out.println("Petrol engine started");
    }
}
public class Car {
    
        private Engine engine;

        Car(Engine engine){
            this.engine=engine;
        }

        void drive(){
            engine.start();
        
    }
}

public class Test_car{
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
    }
}
