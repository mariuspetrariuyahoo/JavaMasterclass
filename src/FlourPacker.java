public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        final int  BIG_COUNT = 5;
        final int SMALL_COUNT = 1;
        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if (i * BIG_COUNT + j * SMALL_COUNT == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
