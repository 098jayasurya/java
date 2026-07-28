package Spring;

interface Vehcile{
    void run();
}
interface Fuel{
    void provideFuel();
}

class petrol implements  Fuel{
    public void provideFuel(){
        System.out.println("running by petrol");
    }
}

class Diesel implements Fuel{
    public void provideFuel(){
        System.out.println("running by Diesel");
    }
}

class car implements Vehcile{
    private Fuel fuel;

    public car(Fuel fuel){
        this.fuel = fuel;

    }
    public void run(){
        fuel.provideFuel();
    }
}

class bike implements Vehcile{
    private Fuel fuel;

    public bike(Fuel fuel){
        this.fuel = fuel;

    }
    public void run(){
        fuel.provideFuel();
    }
}
public class mini_first {
    public static void main(String[] args) {
        car car = new car(new Diesel());
        car.run();
    }
}
