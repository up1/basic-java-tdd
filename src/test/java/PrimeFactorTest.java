import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {

    @Test
    public void
    case05() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals("222", primeFactor.of(8));
    }

    @Test public void
    case04() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals("23", primeFactor.of(6));
    }

    @Test public void
    case03() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals("22", primeFactor.of(4));
    }

    @Test public void
    case02() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals("3", primeFactor.of(3));
    }

    @Test public void
    case01() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals("2", primeFactor.of(2));
    }

}
