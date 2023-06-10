import java.util.Scanner;

public class Problem_3_Array_Methods {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = createArray(4);
        int[] secondArray = fillArray(5);

        System.out.println("The sum of the elements inside your array is: ");
        sumElements(array);

        System.out.println("It is " + contains(array, 3) + " that your elements is in the array");
        System.out.println("The element is found " + countOccurrence(secondArray, 2) + " number of times in the array");

        System.out.println("\nProgram terminated");
        sc.close();
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        printElements(array);
        return array;
    }

    public static void printElements (int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print('[' + array[i] + ']');
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static int[] fillArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Which number would you like to add to the array?");
            int number = sc.nextInt();
            array[i] = number;
        }
        printElements(array);
        return array;
    }

    public static void sumElements(int[] array) {
        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        System.out.println(sum);
    }

    public static boolean contains (int[] array, int a) {
        boolean check = false;

        for (int j : array) {
            if (j == a) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static int countOccurrence(int[] array, int a) {
        int counter = 0;

        for (int j : array) {
            if (j == a) {
                counter++;
            }
        }
        return counter;
    }

}
