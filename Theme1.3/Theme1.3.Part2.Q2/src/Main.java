public class Main {
    public static void main(String[] args) {
        System.out.println(Main.findMaxDouble(10.0, 11.0, 11.2));
    }
    public static double findMaxDouble(double num1, double num2, double num3){
        if (num1 > num2){
            if (num1 > num3){
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }
}