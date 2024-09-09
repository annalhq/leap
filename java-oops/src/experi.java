import java.util.Arrays;

public class experi {
    public static void main(String[] args) {

        int[][] triangle = {    // Shorthand
                {1},
                {1, 2},
                {1, 2, 3},  // Trailing comma is okay
        };
        System.out.println( Arrays.toString( triangle ) );
// [[I@9f70c54, [I@234bef66, [I@737996a0]
        System.out.println( Arrays.deepToString( triangle ) );
// [[1], [1, 2], [1, 2, 3]]

    }


}
