import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 9, 4, 7, 6};
        sortArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
