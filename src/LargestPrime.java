public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) return -1;
        boolean isNumberPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isNumberPrime = false;
                break;
            }

        }
        if (isNumberPrime) return number;
        for (int i = number / 2; i >= 2; i--) {
            boolean isIPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isIPrime = false;
                    break;
                }
            }
            if (isIPrime && ((number % i) == 0)) return i;
        }
        return -1; // should never reach this point
    }

    public static void main(String[] args) {
        getLargestPrime(217);
    }
}
