package org.com.maven.level.task2;

import org.com.maven.level.task1.*;

public class UnoArgumentFunctionalForLinearFunctions<T extends UnoArgumentFunction> implements UnoArgumentFunctional<T> {

    @Override
    public Double solve(T function, Double x) {
        Double leftBorder = function.getLeftBorder();
        Double rightBorder = function.getRightBorder();
        Double middle = (leftBorder + rightBorder) / 2;
        return function.solve(leftBorder) + function.solve(rightBorder) + function.solve(middle);
    }
}
