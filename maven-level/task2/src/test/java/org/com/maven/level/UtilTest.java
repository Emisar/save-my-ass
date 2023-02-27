package org.com.maven.level;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    private static Stream<Arguments> paramsForGetGreatestRoot() {
        return Stream.of(
                Arguments.of(new Equation(2d, -1d, -15d), 3d),
                Arguments.of(new Equation(1d, -6d, 9d), 3d)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForGetGreatestRoot")
    void getGreatestRoot(Equation equation, Double expected) throws NoRootsException {
        Util util = new Util(equation);
        Double actual = util.getGreatestRoot();
        assertEquals(expected, actual);
    }

    @Test
    void getGreatestRootThrowException() {
        Exception actual = assertThrows(NoRootsException.class, () -> new Util(new Equation(3d, 1d, 2d)).getGreatestRoot());
        Exception expected = new NoRootsException();
        assertEquals(expected.getMessage(), actual.getMessage());
    }
}