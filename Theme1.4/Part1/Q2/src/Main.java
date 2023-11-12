public class Main {
    public static void main(String[] args) {
        int[] x = {4, 5, 6, 1, 2, 3};

        System.out.println(findElementIndex(x, 7));
    }

    public static int findElementIndex(int[] arr, int x){
        //sort arr
        for(int i = 1; i < arr.length; ++i){
            int a = arr[i];
            int j = i;
            while (j > 0 && arr[j-1]>a){
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = a;
        }
        //binary search
        int low = 0;
        int high = arr.length;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(mid >= arr.length){break;}
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] == x) {
                index = mid;
                break;
            }
        }
        return index;

    }
}