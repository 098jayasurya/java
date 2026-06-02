package Inheritance;
import java.util.Scanner;

public class Student extends Person{

    private static String institue;

    private int sno;
    private String course;
    private double fee;
    
    static  {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter STUDENT institue name");
        institue=scn.nextLine();
        
    }
    public Student(String name,double height,double weight,int sno,String course,double fee){
        super(name, height, weight);

        this.sno= sno;
        this.course = course;
        this.fee = fee;

    }
    public static String getInstitue() {
        return institue;
    }
    public static void setInstitue(String institue) {
        Student.institue = institue;
    }
    public int getSno() {
        return sno;
    }
    public void setSno(int sno) {
        this.sno = sno;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    public void listen(){
        System.out.println(getName() +"is studying");
    }

    public void reply(){
        System.out.println(getName()+"is replying");
    }

    public void write(){
        System.out.println(getName() +"is writing"+ course+"notes");
    }
    	
	@Override
	public String toString() {
				
		return	super.toString() + "\n" +
				" institute\t: "	+ institue + "\n" +
				" sno\t\t: "		+ sno		+ "\n" +
				" course\t\t: "		+ course	+ "\n" +
				" fee\t\t: "		+ fee;
	}	

}
