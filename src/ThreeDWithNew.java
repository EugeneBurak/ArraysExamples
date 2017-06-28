import java.util.Arrays;

/**
 * Created by java_dev on 24.05.17.
 */
public class ThreeDWithNew {
    public static void main(String[] args) {
        // 2-D array with fixed length:
        int[][] a = new int[3][2];
        System.out.println(Arrays.deepToString(a));
        System.out.println("----------");
        // 3-D array with fixed length:
        int[][][] b = new int[3][2][4];
        System.out.println(Arrays.deepToString(b));
    }
}