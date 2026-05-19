import java.io.Console;

public class console {
    public static void main(String[] args) {
        Console cns =  System.console();

        System.out.println  ("Ener your username ");
        String username = cns.readLine();

        System.out.println("Enter youur password");
        char[] password = cns.readPassword();

        System.out.println("\nusername :" + username);
        System.out.println("password :" + new String(password));

    }
}
