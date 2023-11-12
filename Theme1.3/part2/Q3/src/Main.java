public class Main {
    public static void main(String[] args) {
        System.out.println(getMonth(5));
    }

    public static Month getMonth(int monthNumber){
        return Month.values()[monthNumber-1];
    }

    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
}