package Algorithm.Sort;

import static Algorithm.Sort.Selection.print;
import static Algorithm.Sort.Selection.swap;

// 2. 冒泡排序
public class Bubble {
    static void BubbleSort(int[] array){
        for (int j = array.length; j > 0; j--) {    // 数组中元素最大的位置
            for (int i = 0; i < j - 1; i++) {   // 从第一个位置开始循环交换至数组最大的位置(j - 1)
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
