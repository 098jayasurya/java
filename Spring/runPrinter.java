package Spring;


interface Printer{
    void print();
}
class InkjetPrinter implements Printer{
    public void print(){
           System.out.println("printing from InkjetPrinter");
    }
}

class LaserPrinter implements Printer{
    public void print(){
        System.out.println("printing from LaserPrinter");
    }
}

class Computer{
    private  Printer printer;
    
    public Computer(Printer printer){
        this.printer = printer;
    }

    public void print(){
        printer.print();
    }

}
public class runPrinter {
    public static void main(String[] args) {
    InkjetPrinter IP = new InkjetPrinter();
    LaserPrinter LP = new LaserPrinter();

    Computer computer = new Computer(IP);
    computer.print();

    Computer computer1 = new Computer(LP);
    computer1.print();
    }    
}
