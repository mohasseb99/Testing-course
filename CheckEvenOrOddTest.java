import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckEvenOrOddTest {
    CheckEvenOrOdd mod;

    @BeforeEach
    public void init(){
        mod = new CheckEvenOrOdd();
    }

    @Test
    public void zeroExpectedEven(){
        mod.initOperandOne(0);
        assertEquals(true, mod.checkEvenOrOdd());
    }

    @Test
    public void twoExpectedEven(){
        mod.initOperandOne(2);
        assertEquals(true, mod.checkEvenOrOdd());
    }

    @Test
    public void negativeTwoExpectedEven(){
        mod.initOperandOne(-2);
        assertEquals(true, mod.checkEvenOrOdd());
    }

    @Test
    public void negativeOneExpectedOdd(){
        mod.initOperandOne(-1);
        assertEquals(false, mod.checkEvenOrOdd());
    }

    @Test
    public void negativeElevenExpectedOdd(){
        mod.initOperandOne(-11);
        assertEquals(false, mod.checkEvenOrOdd());
    }

    @Test
    public void elevenExpectedOdd(){
        mod.initOperandOne(11);
        assertEquals(false, mod.checkEvenOrOdd());
    }

    @AfterEach
    public void cleanUp(){
        mod = null;
    }

}