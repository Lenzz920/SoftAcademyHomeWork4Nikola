import java.util.Scanner;

public class Problem_1_Say_Hello {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sayHello();
        endProgram();
    }

    public static void sayHello() {
        System.out.println("What's your first name?");
        String firstName = sc.next();

        System.out.println("What's your second name?");
        String secondName = sc.next();

        System.out.println("Hello, " + firstName + " " + secondName + "!");
    }

    public static void endProgram() {
        System.out.println("\nProgram terminated");
        sc.close();
    }
}
