public class LastDigitChecker {
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1)) return false;
        if (!isValid(n2)) return false;
        if (!isValid(n3)) return false;
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;
        int lastDigit3 = n3 % 10;
        return (lastDigit1 == lastDigit2) || (lastDigit2 == lastDigit3) || (lastDigit1 == lastDigit3);
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
