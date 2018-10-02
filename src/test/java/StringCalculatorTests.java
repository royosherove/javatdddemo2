import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringCalculatorTests {

    @Test
    public void add_singlenum_returnsthatnum()
    {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("1");
        assertEquals(1,result);
    }
    @Test
    public void add_emptystring_returnsDefaultNumber()
    {
        StringCalculator sc = new StringCalculator();
        int result = sc.add("");
        assertEquals(0,result);
    }
}