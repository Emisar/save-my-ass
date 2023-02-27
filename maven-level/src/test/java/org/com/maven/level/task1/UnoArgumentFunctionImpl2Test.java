package org.com.maven.level.task1;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class UnoArgumentFunctionImpl2Test {

    private static Stream<Arguments> paramsForSolve() {
        return Stream.of(
                Arguments.of(new Double[]{1d, 1d}, 1d, 0.8414709848078965),
                Arguments.of(new Double[]{1d, 2d}, 1d, 0.9092974268256817),
                Arguments.of(new Double[]{2d, 1d}, 1d, 1.682941969615793),
                Arguments.of(new Double[]{2d, 1d}, 2d, 1.8185948536513634)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSolve")
    void solve(Double[] coefficients, Double x, Double expected) {
        UnoArgumentFunction function = new UnoArgumentFunctionImpl2(coefficients, new Double[0]);
        Double actual = function.solve(x);
        assertEquals(expected, actual);
    }
}