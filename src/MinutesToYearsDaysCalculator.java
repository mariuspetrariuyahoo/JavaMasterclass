public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        final long MINUTES_IN_DAY = 24 * 60;
        final long MINUTES_IN_YEAR = MINUTES_IN_DAY * 365;
        long years = minutes / MINUTES_IN_YEAR;
        long remainingMinutes = minutes % MINUTES_IN_YEAR;
        long days = remainingMinutes / MINUTES_IN_DAY;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

//    public static void main(String[] args) {
//        printYearsAndDays(1440L);
//    }
}
