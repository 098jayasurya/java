package setget;

public class company {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEname("raja");
        e1.setEno(1010);
        e1.setDept("sales");
        e1.setEsalary(50000);
        
        e1.display();

        e1.setEsalary(e1.getSalary()+e1.getSalary()*20/100);

        e1.display();
    }
}
