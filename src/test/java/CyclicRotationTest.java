import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CyclicRotationTest {

    @Test public void
    not_change() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] actual = cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 0);
        assertArrayEquals(new int[]{3, 8, 9, 7, 6}, actual);
    }

    @Test public void
    rotate_with_1() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] actual = cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 1);
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, actual);
    }

    @Test public void
    rotate_with_2() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] actual = cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 2);
        assertArrayEquals(new int[]{7, 6, 3, 8, 9}, actual);
    }

}
