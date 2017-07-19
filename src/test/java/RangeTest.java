import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeTest {

    @Test public void
    final_problem() {
        MyRange range = new MyRange();
        String actualResult = range.of("[1,5]");
        assertEquals("12345", actualResult);
    }

    @Test public void
    หาตัวเลขสุดท้าย2() {
        MyRange range = new MyRange();
        int actualResult = range.getLastNumber("[1,5)");
        assertEquals(4, actualResult);
    }

    @Test public void
    หาตัวเลขสุดท้าย() {
        MyRange range = new MyRange();
        int actualResult = range.getLastNumber("[1,5]");
        assertEquals(5, actualResult);
    }

    @Test public void
    ตรวจสอบว่าเป็น_ก้ามปูปิด() {
        MyRange range = new MyRange();
        boolean actualResult = range.isก้ามปูปิด("[1,5]");
        assertTrue("ต้องเป็นก้ามปูปิดนะ", actualResult);
    }

    @Test public void
    หาตัวเลขเริ่มต้น3() {
        MyRange range = new MyRange();
        int actualResult = range.getFirstNumber("(1,5]");
        assertEquals(2, actualResult);
    }

    @Test public void
    หาตัวเลขเริ่มต้น2() {
        MyRange range = new MyRange();
        int actualResult = range.getFirstNumber("[2,5]");
        assertEquals(2, actualResult);
    }

    @Test public void
    หาตัวเลขเริ่มต้น() {
        MyRange range = new MyRange();
        int actualResult = range.getFirstNumber("[1,5]");
        assertEquals(1, actualResult);
    }

    @Test public void
    ตรวจสอบว่าเป็น_ก้ามปูเปิด() {
        MyRange range = new MyRange();
        boolean actualResult = range.isก้ามปูเปิด("[1,5]");
        assertTrue("ต้องเป็นก้ามปูเปิดนะ", actualResult);
    }

    @Test public void
    ตรวจสอบว่าเป็น_วงเล็บเปิด() {
        MyRange range = new MyRange();
        boolean actualResult = range.isก้ามปูเปิด("(1,5]");
        assertFalse("ต้องเป็นวงเล็บเปิดนะ", actualResult);
    }

}
