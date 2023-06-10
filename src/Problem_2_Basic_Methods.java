public class Problem_2_Basic_Methods {

    public static void main(String[] args) {
        System.out.println("The max number is: "+ max(5, 6));

        System.out.println("The min number is: "+ min(2, 10));

        System.out.println("The sum of the numbers is: "+ sum(10, 15));

        short a = 5;
        short b = 6;
        System.out.println("The multiplication of the numbers is: "+ multiply(a, b));

        System.out.println("The max number is: "+ max(5, 7, 9));

        System.out.println("\nProgram terminated");
    }

    public static int max (int a, int b) {
        return (a > b) ? a : b;
    }

    public static double min(double a, double b) {
        return (a < b) ? a : b;
    }

    public static double sum(long a, long b) {
        return a + b;
    }

    public static short multiply(short a, short b) {
        return (short) (a * b);
    }

    public static int max (int a, int b, int c) {
        return (a > b && a > c) ? a : (b > a && b > c) ? b : c;
    }
}
