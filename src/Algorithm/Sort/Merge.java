package Algorithm.Sort;

import static Algorithm.Sort.Selection.print;

public class Merge {

    static void merge(int[] array, int left, int right, int end){   // 合并已经排好序的子数组
        int mid = right - 1;
        int i = left;
        int j = right;
        int k = 0;

        int[] mergeArray = new int[end - left + 1];

        while(i <= mid && j <= end){
            mergeArray[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        while (i <= mid){
            mergeArray[k++] = array[i++];
        }
        while (j <= end){
            mergeArray[k++] = array[j++];
        }

        System.arraycopy(mergeArray, 0, array, left, mergeArray.length);    // 将新合并的数组复制到旧数组中
    }

    static void Sort(int[] array, int start, int end){
        if (start == end) return;   // Base Case停止条件
        int mid = (start + end) / 2;

        Sort(array, start, mid);

        Sort(array, mid + 1, end);

        merge(array, start, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 3, 6, 9, 0, 10};

        print(array);

        System.out.println();
        Sort(array, 0, array.length - 1);

        print(array);
    }
}
