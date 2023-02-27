package org.com.maven.level;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class EquationTest {

    private static Stream<Arguments> paramsForSolve() {
        return Stream.of(
                Arguments.of(3d, 1d, 2d, new Double[0]),
                Arguments.of(2d, -1d, -15d, new Double[]{3d, -2.5}),
                Arguments.of(1d, -6d, 9d, new Double[]{3d})
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForSolve")
    void solve(Double first, Double second, Double third, Double[] expected) {
        Equation equation = new Equation(first, second, third);
        Double[] actual = equation.solve();
        assertArrayEquals(expected, actual);
    }
}