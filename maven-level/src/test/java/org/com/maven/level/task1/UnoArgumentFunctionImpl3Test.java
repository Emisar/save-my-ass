package org.com.maven.level.task1;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class UnoArgumentFunctionImpl3Test {

    private static Stream<Arguments> paramsForSolve() {
        return Stream.of(
                Arguments.of(new Double[]{1d, 1d, 1d, 1d}, 1d, 1d),
                Arguments.of(new Double[]{1d, 1d, 1d, 2d}, 2d, 0.75),
                Arguments.of(new Double[]{1d, 1d, 2d, 2d}, 2d, 0.5),
                Arguments.of(new Double[]{1d, 2d, 2d, 2d}, 3d, 0.625)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSolve")
    void solve(Double[] coefficients, Double x, Double expected) {
        UnoArgumentFunction function = new UnoArgumentFunctionImpl3(coefficients, new Double[0]);
        Double actual = function.solve(x);
        assertEquals(expected, actual);
    }
}