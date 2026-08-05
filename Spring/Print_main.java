package Spring;


class Printer{
    int pages;
    int printed;

    public Printer(int x,int y) {
        this.pages =x;
        this.printed=y;
    }

    
}
class PrinterFactory{

    public Printer getPrinter(int x,int y){
        return new Printer(x,y);
    }
}
public class Print_main {
    public static void main(String[] args){
        PrinterFactory Pf = new PrinterFactory();

        Printer printer = Pf.getPrinter(10,20);






    }
}
