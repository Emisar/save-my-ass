package org.com.maven.level.task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UnoArgumentFunctionTest {

    private UnoArgumentFunction function;

    @BeforeEach
    void setUp() {
        function = new UnoArgumentFunctionImpl1(new Double[0], new Double[]{1d, 2d});
    }

    @Test
    void getLeftBorder() {
        function = new UnoArgumentFunctionImpl1(new Double[0], new Double[]{1d, 2d});
        Double expected = 1d;
        Double actual = function.getLeftBorder();
        assertEquals(expected, actual);
    }

    @Test
    void getRightBorder() {
        function = new UnoArgumentFunctionImpl1(new Double[0], new Double[]{1d, 2d});
        Double expected = 2d;
        Double actual = function.getRightBorder();
        assertEquals(expected, actual);
    }
}