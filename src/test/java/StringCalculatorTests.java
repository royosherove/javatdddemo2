import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringCalculatorTests {

    private StringCalculator makeCalc() {
        return new StringCalculator();
    }

    private void checkAdd(String s, int i) {
        StringCalculator sc = makeCalc();
        int result = sc.add(s);
        assertEquals(i, result);
    }

    @Test
    public void add_singlenum_returnsthatnum()
    {
        checkAdd("1", 1);
    }

    @Test
    public void add_twonums_sumsthemup()
    {
        checkAdd("1,2", 3);
        checkAdd("1,3", 4);
    }

    @Test
    public void add_emptystring_returnsDefaultNumber()
    {
        checkAdd("", 0);
    }
}