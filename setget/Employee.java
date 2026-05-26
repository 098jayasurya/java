package setget;

public class  Employee {
    private String Ename;
    private int Eno;
    private double salary;
    private String dept;

    public void setEname(String Ename){
        this.Ename = Ename;
    }
    public String getEname(){
        return this.Ename;
    }
    public void setEno(int Eno){
        this.Eno = Eno;
    }
    public int getEno(){
        return this.Eno;
    }
    public void setEsalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return this.dept;
    }
    void display(){
        System.out.println("Eno\t" + getEno());
        System.out.println("Ename\t" + getEname());
        System.out.println("Edept\t" + getDept());
        System.out.println("Esalary\t" + getSalary());
    }
}
