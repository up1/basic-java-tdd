import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest2 {

    @Test public void
    convert_to_binary_from_9_to_1001() {
        BinaryGap binaryGap = new BinaryGap();
        String actual = binaryGap.convert(9);
        assertEquals("1001", actual);
    }

    @Test public void
    convert_to_binary_from_529_to_1000010001() {
        BinaryGap binaryGap = new BinaryGap();
        String actual = binaryGap.convert(529);
        assertEquals("1000010001", actual);
    }

    @Test public void
    input_1001_should_return_2() {
        BinaryGap binaryGap = new BinaryGap();
        int actual = binaryGap.solution2(9);
        assertEquals(2, actual);
    }

}
