package Inheritance;

public class College {
    public static void main(String[] args) {
        // Person p1 = new Person("jaya", 6.7, 100);
        // System.out.println(p1);
        // System.out.println();

        Student s1 = new Student("jaya", 6.7, 100, 101, "java", 3000.0);

      //  System.out.println(s1);
    System.out.println();

    Faculty f1 = new Faculty("harikrishna", 7.7, 120, 110, "core java", "java", 100000);

    System.out.println(f1);
    System.out.println();
    System.out.println("=======================================================================================================================");
    s1.setName("harsha");
    f1.setName("raja");
    s1.eat();
    s1.sleep();
    s1.listen();
    s1.reply();
    s1.write();
    System.out.println("==============================================================================================================================");

    f1.eat();
    f1.sleep();
    f1.teach();
    f1.prepareMaterial();
    System.out.println("=======================================================================================================");
    
   
    Canteen jayCanteen = new Canteen();
    jayCanteen.eat(s1);
    jayCanteen.eat(f1);
    }
}
