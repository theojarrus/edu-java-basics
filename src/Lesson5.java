import java.util.Arrays;

public class Lesson5 {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = {1, 2, 3};
        // int element = array[index]

        System.out.println("Array 1");
        for (int i = 0; i < array2.length; i++) {
            array1[i] = array2[i];
            System.out.println(array2[i]);
        }

        System.out.println("Array 2");
        for (int number : array1) {
            System.out.println(number);
        }

        String[] array3 = new String[3];
        for (String string : array3) {
            System.out.println(string);
        }

        int[] array4 = {5, 2, 1, 65, 7, 8, 0};
        Arrays.sort(array4);
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }

        int number1 = Arrays.binarySearch(array4, 8);
        System.out.println("index = " + number1);
    }
}
