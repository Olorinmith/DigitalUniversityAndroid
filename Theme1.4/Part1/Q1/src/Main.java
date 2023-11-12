import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {3, 4, 5, 2, 1};
        System.out.println(Arrays.toString(sortArray(x)));
    }

    public static int[] sortArray(int[] arr){
        for(int i = 1; i < arr.length; ++i){
            int x = arr[i];
            int j = i;
            while (j > 0 && arr[j-1]>x){
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = x;
        }
        return arr;
    }
}