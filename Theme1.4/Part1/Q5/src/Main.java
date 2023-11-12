import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {7, 3, 4, 2, 1};
        sortArraySlice(x);
        System.out.println(Arrays.toString(x));
    }

    public static void sortArraySlice(int[] arr){
        for(int i = 1; i < arr.length-1; ++i){
            int a = arr[i];
            int j = i;
            while (j > 1 && arr[j-1]>a){
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = a;
        }
    }
}