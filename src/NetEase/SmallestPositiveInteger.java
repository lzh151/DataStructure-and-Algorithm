package NetEase;

public class SmallestPositiveInteger {
    public static int[] find(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] > 0 && ints[i] < ints.length){
                int temp = ints[ints[i] - 1];
                ints[ints[i] - 1] = ints[i];
                ints[i] = temp;
            }
        }
        return ints;
    }

    public static void main(String[] args) {
//        int[] ints = {-2, 1, -1, 5, 6};
        int[] ints = {3,4,1,-1};
        find(ints);
        for (int i: ints) {
            System.out.print(i + " ");
        }
    }
}
