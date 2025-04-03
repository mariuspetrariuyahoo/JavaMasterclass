public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || col == 1) {
                    System.out.print("*");
                    continue;
                }
                if (row == number || col == number) {
                    System.out.print("*");
                    continue;
                }
                if (row == col) {
                    System.out.print("*");
                    continue;
                }
                if (col == number - row + 1) {
                    System.out.print("*");
                    continue;
                }
              System.out.print(" ");
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        printSquareStar(9);
//    }
}
