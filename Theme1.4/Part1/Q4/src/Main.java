import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mtx = inputArray(3);
        System.out.println(Arrays.toString(mtx));
    }

    public static int[] inputArray(int n){
        int[] matrix = new int[n];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            matrix[i] = input.nextInt();
        }
        return matrix;
    }
}