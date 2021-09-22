package Algorithm.Sort;

import static Algorithm.Sort.Selection.print;
import static Algorithm.Sort.Selection.swap;

// 4. 希尔排序
public class Shell {
    static void ShellSort(int[] array){

        // Knuth序列(生成最优间隔)
        int h = 1;
        while(h <= array.length / 3){
            h = h * 3 + 1;
        }

//        for (int gap = array.length >> 1; gap > 0 ; gap /= 2) {   // 逐渐减小gap间隔直至等于1, 二分化间隔
        for (int gap = h; gap > 0 ; gap = (gap - 1) / 3) {    // 逐渐减小gap间隔直至等于1
            for (int j = gap; j < array.length; j++) {    // 从第一个gap元素开始依次向后遍历
                for (int i = j; i > gap - 1; i -= gap) {   // 根据gap依次向前交换插入
                    if (array[i] < array[i - gap]){
                        swap(array, i, i - gap);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 8, 1, 9, 2, 7};

        print(array);

        System.out.println();
        ShellSort(array);

        print(array);
    }
}
