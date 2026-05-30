package oops;

public class Bike {
    private int gear;

    public Bike(){
        this.gear=0;
    }

    public void setGear(int gear)throws IllegalArgumentException{

        if(gear < 0 || gear> 5)throw new IllegalArgumentException("Invalid gear. its value must be in between(0,5)");{

            this.gear = gear;
            System.out.println("gear changed to" + gear );
                }
        
        }
        public int getGear(){
            return gear;
    }
    public void currentGear(){
        System.out.println("your current gear is" + gear);
    }
}


