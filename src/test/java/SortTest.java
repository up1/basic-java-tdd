import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortTest {

    @Test public void
    case03() {
        MySort mySort = new MySort();
        int[] actual = mySort.sort(10, 6, 7);
        assertArrayEquals(new int[] {6, 7, 10}, actual);
    }

    @Test public void
    case02() {
        MySort mySort = new MySort();
        int[] actual = mySort.sort(10, 6);
        assertArrayEquals(new int[] {6, 10}, actual);
    }

        @Test public void
    case01() {
        MySort mySort = new MySort();
        int[] actual = mySort.sort(10);
        assertArrayEquals(new int[] {10}, actual);
    }

}
