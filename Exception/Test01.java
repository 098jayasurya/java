package Exception;

public class Test01 {
    public static void main(String[] args){
        System.out.println("mains start");
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("Result :"+ c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : pass two integers  as");
            System.out.println("java Test01 10 2");
        }catch(NumberFormatException e){
            System.out.println("Error :pass only 2 numbers");
        }catch(ArithmeticException e){
            System.out.println("Error :do not pass zero as second value");
        }
    }
}
