// Создайте метод public static doubleToHex(double n), который округляет число double до двух знаков после запятой и переводит полученное число в 16ричную систему

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.doubleToHex(16.8));
    }

    public static String doubleToHex(double n) {
        double roundedNumber = Math.round(n*100.0)/100.0;
        int a = (int) roundedNumber;
        roundedNumber = roundedNumber - a;
        String word = Integer.toString(a, 16);

        roundedNumber = roundedNumber *16;
        String l = switch((int) roundedNumber){
            case 10 -> "a";
            case 11 -> "b";
            case 12 -> "c";
            case 13 -> "d";
            case 14 -> "e";
            default -> "f";
        };
        if ((int) roundedNumber > 9){
            word = word + "." + l;
        } else {
            word = word + "." + (int) roundedNumber;
        }

        roundedNumber = (roundedNumber - (int) roundedNumber) *16;
        l = switch((int) roundedNumber){
            case 10 -> "a";
            case 11 -> "b";
            case 12 -> "c";
            case 13 -> "d";
            case 14 -> "e";
            default -> "f";
        };
        if ((int) roundedNumber > 9){
            word = word + l;
        } else {
            word = word + (int) roundedNumber;
        }

        return word;
    }
}