package test;

import main.ChopMainClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChopTest {

    @Test
    public void testChop() {
        Assertions.assertEquals(-1, ChopMainClass.chop(3, new int[]{}));
        Assertions.assertEquals(-1, ChopMainClass.chop(3, new int[]{1}));
        Assertions.assertEquals(0, ChopMainClass.chop(1, new int[]{1}));

        Assertions.assertEquals(0, ChopMainClass.chop(1, new int[]{1, 2, 3, 4}));
        Assertions.assertEquals(1, ChopMainClass.chop(2, new int[]{1, 2, 3, 4}));
        Assertions.assertEquals(2, ChopMainClass.chop(3, new int[]{1, 2, 3, 4}));
        Assertions.assertEquals(3, ChopMainClass.chop(4, new int[]{1, 2, 3, 4}));
        Assertions.assertEquals(-1, ChopMainClass.chop(9, new int[]{1, 2, 3, 4}));
        Assertions.assertEquals(-1, ChopMainClass.chop(10, new int[]{1, 2, 3, 4}));

        Assertions.assertEquals(4, ChopMainClass.chop(9, new int[]{1, 2, 3, 4, 9, 12, 35}));
        Assertions.assertEquals(6, ChopMainClass.chop(35, new int[]{1, 2, 3, 4, 9, 12, 35}));
        Assertions.assertEquals(-1, ChopMainClass.chop(100, new int[]{1, 2, 3, 4, 9, 12, 35}));
    }
}
