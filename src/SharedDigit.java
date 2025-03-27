// coding exercise 19
public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 > 99 || number1 < 10) return false;
        if (number2 > 99 || number2 < 10) return false;
        int firstDigitFromNumber1 = number1 / 10;
        int lastDigitFromNumber1 = number1 % 10;
        int firstDigitFromNumber2 = number2 / 10;
        int lastDigitFromNumber2 = number2 % 10;
        if (firstDigitFromNumber1 == firstDigitFromNumber2 ) return true;
        if (firstDigitFromNumber1 == lastDigitFromNumber2) return true;
        if (lastDigitFromNumber1 == firstDigitFromNumber2) return true;
        if (lastDigitFromNumber1 == lastDigitFromNumber2) return true;
        return false;
    }
}
