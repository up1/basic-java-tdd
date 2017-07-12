import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatPhoneNumberTest {

    @Test
    public void xxxx() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("00-44 48 5555 8361");
        assertEquals("004-448-555-583-61", actualResult);
    }

    @Test @Ignore
    public void removeNonDigit() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("00-44 48 5555 8361");
        assertEquals("00444855558361", actualResult);
    }

    @Test
    public void evenPhoneNumber() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("555372654");
        assertEquals("555-372-654", actualResult);
    }

    @Test
    public void oddPhoneNumberOnlyLastGroup() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("004-448-555-583-61");
        assertEquals("004-448-555-583-61", actualResult);
    }

    @Test
    public void oddPhoneNumberOnlyLast2Group() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("0 - 22 1985--324");
        assertEquals("022-198-53-24", actualResult);
    }

}
