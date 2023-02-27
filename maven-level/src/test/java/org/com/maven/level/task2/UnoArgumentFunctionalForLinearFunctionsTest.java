package org.com.maven.level.task2;

import org.com.maven.level.task1.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class UnoArgumentFunctionalForLinearFunctionsTest {

    private static Stream<Arguments> paramsForSolve() {
        return Stream.of(
                Arguments.of(new Double[]{1d, 1d}, new Double[]{1d, 4d}, 1d, 10.5),
                Arguments.of(new Double[]{1d, 2d}, new Double[]{1d, 4d}, 1d, 13.5),
                Arguments.of(new Double[]{2d, 1d}, new Double[]{1d, 4d}, 1d, 18d),
                Arguments.of(new Double[]{2d, 1d}, new Double[]{1d, 4d}, 2d, 18d)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSolve")
    void solve(Double[] coefficients, Double[] borders, Double x, Double expected) {
        UnoArgumentFunctional<UnoArgumentFunction> functional = new UnoArgumentFunctionalForLinearFunctions<>();
        UnoArgumentFunction function = new UnoArgumentFunctionImpl1(coefficients, borders);
        Double actual = functional.solve(function, x);
        assertEquals(expected, actual);
    }
}