public class Problem_4_Number_Methods {

    public static void main(String[] args) {

        System.out.println(countDigits(123456789));
        System.out.println(getParity(5));

        int[] array = createArray(12345678);
        printArray(array);


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
        int i = 0;

        while (a != 0) {
            int b = a % 10;
            array[i] = b;
            a = a / 10;
            i++;
        }

        return reverseArray(array);
    }

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int j = array.length - 1;

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[j];
            j--;
        }
        return newArray;
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


}
