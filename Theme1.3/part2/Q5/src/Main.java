public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }

    public static boolean isPowerOfTwo(int n){
        if(n == 0) {
            return false;
        }
        int copy = n;

        while ((copy & 1) == 0) {
            copy >>=1;
        }
        return copy == 1;
    }
}