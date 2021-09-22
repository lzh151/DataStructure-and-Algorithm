package Algorithm.Sort;

import static Algorithm.Sort.Selection.print;
import static Algorithm.Sort.Selection.swap;

// 3. 插入排序
public class Insertion {

    static void InsertionSort(int[] array){
        for (int j = 1; j < array.length; j++) {    // 从第二个元素开始向后遍历
            for (int i = j; i > 0; i--) {   // 依次向前循环交换插入
                if (array[i] < array[i - 1]){
                    swap(array, i, i - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 8, 1, 9, 2, 7};

        print(array);

        System.out.println();
        InsertionSort(array);

        print(array);
    }
}
