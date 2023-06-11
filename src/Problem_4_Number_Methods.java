public class Problem_4_Number_Methods {

    public static void main(String[] args) {

        System.out.println(countDigits(123456789));
        System.out.println(getParity(5));

        int[] array = createArray(-12345678);
        printArray(array);
        System.out.println();

        int[] arrayStream = createArrayWithStream(-23456789);
        printArray(arrayStream);
        System.out.println();

        int[] arraylog = logCreateArray(23456789);
        printArray(arraylog);
        System.out.println();

    }

    public static int countDigits(int a) {
        String counter = "" + a;
        return counter.length();
    }

    public static String getParity(int a) {
        String parity = "odd";

        if(a % 2 == 0) {
            parity = "even";
        }

        return parity;
    }

    public static int[] createArray(int a) {
        int[] array = new int[countDigits(a)];
        int i = array.length - 1;

        while (a != 0) {
            int b = a % 10;
            array[i] = b;
            a = a / 10;
            i--;
        }

        return array;
    }

    public static int[] logCreateArray(int a) {
        int len = 1 + (int) (Math.log(a) / Math.log(10));
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            int pow10 = (int) Math.pow(10, len - i - 1);
            int digit = a / pow10;
            array[i] = digit;
            a -= digit * pow10;
        }
        return array;
    }

    public static int[] createArrayWithStream(int a) {
        return String.valueOf(a).chars().map(Character::getNumericValue).toArray();
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static boolean isPrime(int n) {
        //За isPrime самата формула за намиране на просто число не ми е много ясна
        return true;
    }

/*
public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int j = array.length - 1;

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[j];
            j--;
        }
        return newArray;
    }
 */

}
