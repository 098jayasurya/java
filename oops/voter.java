package oops;

public class voter {
    private int age;

    public voter(){
    this.age=0;
    }
    public void setAge(int age)throws IllegalArgumentException{
    if(age<0) throw new IllegalArgumentException("age must be above 1");
    this.age=age;
    }

    public int getAge(){
        return age;
    }
    
    public void myStatus(){
        System.out.println("you can vote now");
    }

}
