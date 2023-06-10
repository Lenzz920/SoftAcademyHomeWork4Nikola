public class Problem_5_Max_Array_Element {

    public static void main(String[] args) {
        int[] array = {1, 2, 25, 4, 5};
        maxArrayElement(array);

    }



    public static void maxArrayElement (int[] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(array[array.length - 1]);
    }

}
