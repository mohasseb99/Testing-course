import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FindMiniAndMaxInArrayTest {
    FindMiniAndMaxInArray mod;

    @BeforeEach
    public void init(){
        mod = new FindMiniAndMaxInArray();
    }

    @Test
    public void MaxExpected15(){
        ArrayList<Integer> al = new ArrayList<Integer>(){
            {
                add(-5);
                add(-3);
                add(10);
                add(15);
                add(0);
            }
        };
        mod.initOperandOne(al);
        assertEquals(15, mod.findMax());
    }

    @Test
    public void MinExpectedNegativeFive(){
        ArrayList<Integer> al = new ArrayList<Integer>(){
            {
                add(-5);
                add(-3);
                add(10);
                add(15);
                add(0);
            }
        };
        mod.initOperandOne(al);
        assertEquals(-5, mod.findMini());
    }

    @AfterEach
    public void cleanUp(){
        mod = null;
    }

}