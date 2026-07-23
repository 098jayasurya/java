package Exception;

import java.io.*;

public class Test28_TryWithResource_Rules {
    public static void main(String[] args) {
    
        //RUlE 1 : the resources varaible and object both must be Autoclosable type

        try(PrintStream ps = new PrintStream(System.out)){
            ps.println("Hello");
        }
       //ce try (String s =  "a"){}

       //rule 2 : if the resource object's close() method
       //throws a checked exception either it is exception or ioexception 
       //sqlexception or some other exception,we must handle that exception
       //either by catching or by reporting else we will get ce

    try(PrintStream ps = new PrintStream(System.out)){
    }
    try(FileInputStream fis = new FileInputStream("a.txt")){
        catch(FileNotFoundException e){}
        catch(IOException e){}
    }

    //rule 3: the resource variable must be intialiazed either
    //with an object or with method call or atleast with null
    //else we will get CE: = expected
    try(PrintStream ps){
        System.out.println("in try1");
    }
    try(Printstream ps = null){
        System.out.println("in try2");
    }
    try
    }
}

