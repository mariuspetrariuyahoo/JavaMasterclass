public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int test = (number < 0 ? -number : number);
        int reverse = 0;
        int lastDigit = 0;
        while (test > 9) {
            lastDigit = test % 10;
            reverse *= 10;
            reverse += lastDigit;

            test = test / 10;
            if (test < 10) {
                reverse *= 10;
                reverse += test;
                break;
            }
        }
        return reverse == Math.abs(number);
    }
}
