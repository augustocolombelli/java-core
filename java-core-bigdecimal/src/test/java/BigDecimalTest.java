import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.TEN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigDecimalTest {

    public static final BigDecimal SEVEN = BigDecimal.valueOf(7);
    public static final BigDecimal FOUR = BigDecimal.valueOf(4);
    public static final BigDecimal TWO = BigDecimal.valueOf(2);
    public static final BigDecimal THREE = BigDecimal.valueOf(3);

    @Test
    public void testDetailsAboutBigDecimal(){
        BigDecimal value = BigDecimal.valueOf(-52.2036);

        assertEquals(6, value.precision());
        assertEquals(4, value.scale());
        assertEquals(-1, value.signum()); //-1, 0, or 1 is negative, zero, or positive.
    }

    /**
     * -1: less than, 0: equal to and 1: greater than
     */
    @Test
    public void testCompareOnlyValues(){
        BigDecimal one = BigDecimal.ONE;
        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal otherTwo = BigDecimal.valueOf(2);

        assertTrue(one.compareTo(two) == -1);
        assertTrue(two.compareTo(one) == 1);
        assertTrue(two.compareTo(otherTwo) == 0);
    }

    @Test
    public void testCompareValuesAndScale(){
        BigDecimal result = TEN.divide(SEVEN, 5, RoundingMode.HALF_EVEN);//1.4285714285714...
        assertEquals(BigDecimal.valueOf(1.42857), result);

        assertEquals(TWO, TEN.divide(FOUR, 0, RoundingMode.HALF_DOWN));
        assertEquals(THREE, TEN.divide(FOUR, 0, RoundingMode.HALF_UP));
    }

}
