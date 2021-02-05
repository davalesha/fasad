package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RinOpsTest {
    private final BinOps BINOPS = new BinOps();
    private static final String NUMBER_3 = "11";
    private static final String NUMBER_5 = "101";
    private static final String NUMBER_ERROR = "21";

    @Test
    void testSumSuccess() {
        //given
        final String expected = "1000"; //8
        //when
        final String actual = BINOPS.sum(NUMBER_3, NUMBER_5);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSumException() {
        Assertions.assertThrows(Exception.class, () -> {
            BINOPS.sum(NUMBER_3, NUMBER_ERROR);
        });
    }

    @Test
    void testMultSuccess() {
        //given
        final String expected = "1111"; //15
        //when
        final String actual = BINOPS.mult(NUMBER_3, NUMBER_5);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultException() {
        Assertions.assertThrows(Exception.class, () -> {
            BINOPS.mult(NUMBER_3, NUMBER_ERROR);
        });
    }
}
