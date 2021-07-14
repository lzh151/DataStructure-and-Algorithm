package Algorithm.Sort;

import static Algorithm.Sort.Selection.print;
import static Algorithm.Sort.Selection.swap;

public class Bubble {
    static void BubbleSort(int[] array){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 8, 1, 9, 2, 7};

        print(array);

        System.out.println();
        BubbleSort(array);

        print(array);
    }
}
