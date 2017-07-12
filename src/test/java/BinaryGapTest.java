import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    @Test public void
    input_1001_should_return_2() {
        BinaryGap binaryGap = new BinaryGap();
        int actual = binaryGap.solution(9);
        assertEquals(2, actual);
    }

    @Test public void
    input_1000010001_should_return_2() {
        BinaryGap binaryGap = new BinaryGap();
        int actual = binaryGap.solution(529);
        assertEquals(4, actual);
    }

    @Test public void
    input_1111_should_return_0() {
        BinaryGap binaryGap = new BinaryGap();
        int actual = binaryGap.solution(15);
        assertEquals(0, actual);
    }

}
