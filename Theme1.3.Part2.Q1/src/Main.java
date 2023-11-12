public class Main {
    public static void main(String[] args) {
        System.out.println(Main.numberToTriple(81));
    }

    public static int numberToTriple(int n){
        int ost = 0;
        String num = "";
        while (n != 0){
            ost = n % 3;
            num = Integer.toString(ost) + num;
            n = n /3;
        }
        return Integer.parseInt(num);
    }
}