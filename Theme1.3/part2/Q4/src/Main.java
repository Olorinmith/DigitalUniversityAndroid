public class Main {
    public static void main(String[] args) {
        System.out.println(compareDouble(11.111112, 11.111111));
    }
    public static String compareDouble(double a, double b){
        double eps = 0.000001;
        if(a - b > eps){
            return "первое число больше";
        } else if (b - a > eps) {
            return "второе число больше";
        } else {
            return "равны";
        }
    }
}