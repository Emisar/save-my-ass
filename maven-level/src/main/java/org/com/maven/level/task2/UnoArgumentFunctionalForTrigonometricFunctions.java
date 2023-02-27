package org.com.maven.level.task2;

import org.com.maven.level.task1.*;

public class UnoArgumentFunctionalForTrigonometricFunctions<T extends UnoArgumentFunction> implements UnoArgumentFunctional<T> {

    private final Double a;
    private final Double b;

    public UnoArgumentFunctionalForTrigonometricFunctions(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double solve(T function, Double x) throws IndexOutOfBoundsException {
        if (a > function.getLeftBorder() || b < function.getRightBorder()) throw new IndexOutOfBoundsException();
        int numberOfRectangles = 100;
        double step = (b - a) / numberOfRectangles;
        double result = 0;
        for (double i = a; i < b; i += step) {
            result += function.solve(i + step / 2);
        }
        result *= step;
        return result;
    }
}
