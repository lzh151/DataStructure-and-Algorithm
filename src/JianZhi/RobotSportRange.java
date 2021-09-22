package JianZhi;

/*
描述
        地上有一个rows行和cols列的方格。坐标从 [0,0] 到 [rows-1,cols-1]。
        一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于threshold的格子。
        例如，当threshold为18时，机器人能够进入方格[35,37]，因为3+5+3+7 = 18。但是，它不能进入方格[35,38]，因为3+5+3+8 = 19。
        请问该机器人能够达到多少个格子？

        范围:
        1 <= rows, cols<= 100
        0 <= threshold <= 20
*/

//JZ66 机器人的运动范围
public class RobotSportRange {
    static int sum = 0;
    static int threshold;
    static int rows;
    static int cols;
    static int movingCount(int threshold, int rows, int cols) {
        int[][] map = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (count(i) + count(j) <= threshold){
                    map[i][j] = 1;
                }
                else {
                    map[i][j] = 0;
                }
            }
        }
        go(map, 0 ,0);
        return sum;
    }

    static int count(int number){
        int k = 0;
        int remainder = 0;
        while(number / 10 != 0){
            remainder = number % 10;
            k = k + remainder;
            number = number / 10;
        }
        k = k + number % 10;
        return k;
    }

    static void go(int[][] map, int i, int j){
        if(i < 0 || j < 0 || i > rows - 1 || j > cols - 1) {
            return;
        }
        else{
            if(map[i][j] == 0) return;
            go(map, i + 1, j);
            go(map, i, j + 1);
            sum++;
        }

    }

    public static void main(String[] args) {
        threshold = 5;
        rows = 10;
        cols = 10;
        System.out.println(movingCount(threshold, rows, cols));
    }
}