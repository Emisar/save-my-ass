package org.com.maven.level.task1;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class UnoArgumentFunctionImpl1Test {

    private static Stream<Arguments> paramsForSolve() {
        return Stream.of(
                Arguments.of(new Double[]{1d, 1d}, 1d, 2d),
                Arguments.of(new Double[]{1d, 2d}, 1d, 3d),
                Arguments.of(new Double[]{2d, 1d}, 1d, 3d),
                Arguments.of(new Double[]{2d, 1d}, 2d, 5d)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSolve")
    void solve(Double[] coefficients, Double x, Double expected) {
        UnoArgumentFunction function = new UnoArgumentFunctionImpl1(coefficients, new Double[0]);
        Double actual = function.solve(x);
        assertEquals(expected, actual);
    }
}