package org.com.maven.level.task2;

import org.com.maven.level.task1.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class UnoArgumentFunctionalForTrigonometricFunctionsTest {

    private static Stream<Arguments> paramsForSolve() {
        return Stream.of(
                Arguments.of(new Double[]{1d, 1d}, new Double[]{1d, 4d}, 1d, 1.3800695147617124),
                Arguments.of(new Double[]{1d, 2d}, new Double[]{1d, 4d}, 1d, -0.41294672138411004),
                Arguments.of(new Double[]{2d, 1d}, new Double[]{1d, 4d}, 1d, 2.7601390295234247),
                Arguments.of(new Double[]{2d, 1d}, new Double[]{1d, 4d}, 2d, 2.7601390295234247)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSolve")
    void solve(Double[] coefficients, Double[] borders, Double x, Double expected) {
        UnoArgumentFunctional<UnoArgumentFunction> functional = new UnoArgumentFunctionalForTrigonometricFunctions<>(-1d, 10d);
        UnoArgumentFunction function = new UnoArgumentFunctionImpl2(coefficients, borders);
        Double actual = functional.solve(function, x);
        assertEquals(expected, actual);
    }

    @Test
    void solveThrowException() {
        UnoArgumentFunctional<UnoArgumentFunction> functional = new UnoArgumentFunctionalForTrigonometricFunctions<>(1d, 2d);
        UnoArgumentFunction function = new UnoArgumentFunctionImpl2(new Double[0], new Double[]{-1d, 1d});
        Exception actual = assertThrows(IndexOutOfBoundsException.class, () -> functional.solve(function,1d));
        Exception expected = new IndexOutOfBoundsException();
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}