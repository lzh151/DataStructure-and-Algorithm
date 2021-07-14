package Algorithm.Sort;

public class Selection {

    static void SelectionSort(int[] array){
        for (int j = 0; j < array.length - 1; j++) { // 每一轮对选择出来的最小值进行交换，直至最后一个元素
            int minPos = j; // 初始化最小值位置
            for (int i = j + 1; i < array.length; i++) { // 从最小值后的第一个数开始进行遍历查找最小值的位置
                if (array[i] <= array[minPos]){
                    minPos = i;
                }
            }

            // 将最小值与数组最前面未交换的位置进行交换
            swap(array, minPos, j);
        }
    }

    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i]  = array[j];
        array[j] = temp;
    }

    static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 8, 1, 9, 2, 7};

        print(array);

        System.out.println();
        SelectionSort(array);

        print(array);
    }
}
