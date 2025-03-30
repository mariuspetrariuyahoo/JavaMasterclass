public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Number");
            return;
        }
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {

                if (row == 1 || row == column) {
                    System.out.print("*");
                    break;
                }
                ;
                if ((column == 1 || column == number)) {
                    System.out.print("*");
                    break;
                }
                if ((row == column)) {
                    System.out.print("*");

                }
            }
        }
    }
}
