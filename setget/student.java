package setget;

public class student {
    private int sno;
    private String sname;

    public void setSno(int sno){
        this.sno=sno;
    }
    public int getSno(){
        return this.sno;
    }
    public void setSname(String sname){
        this.sname = sname;
    }
    public String getSname(){
        return this.sname;
    }
    void display(){
        System.out.println(sno +" "+sname);
    }
}
