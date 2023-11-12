import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] mtx = inputMatrix(3, 3);
        System.out.println(Arrays.deepToString(mtx));
    }

    public static int[][] inputMatrix(int n, int m){
        int[][] matrix = new int[n][m];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}