package org.com.maven.level.task1;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class UnoArgumentFunctionImpl4Test {

    private static Stream<Arguments> paramsForSolve() {
        return Stream.of(
                Arguments.of(new Double[]{1d, 1d}, 1d, 3.718281828459045),
                Arguments.of(new Double[]{1d, 2d}, 1d, 4.718281828459045),
                Arguments.of(new Double[]{2d, 1d}, 1d, 6.43656365691809),
                Arguments.of(new Double[]{2d, 1d}, 2d, 15.7781121978613)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSolve")
    void solve(Double[] coefficients, Double x, Double expected) {
        UnoArgumentFunction function = new UnoArgumentFunctionImpl4(coefficients, new Double[0]);
        Double actual = function.solve(x);
        assertEquals(expected, actual);
    }
}