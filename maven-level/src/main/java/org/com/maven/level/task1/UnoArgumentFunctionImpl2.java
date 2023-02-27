package org.com.maven.level.task1;

public class UnoArgumentFunctionImpl2 implements UnoArgumentFunction {

    private final Double[] coefficients;
    private final Double[] borders;

    public UnoArgumentFunctionImpl2(Double[] coefficients, Double[] borders) {
        this.coefficients = coefficients;
        this.borders = borders;
    }

    @Override
    public Double solve(Double x) {
        double a = coefficients[0];
        double b = coefficients[1];
        return a * Math.sin(b * x);
    }

    @Override
    public Double getLeftBorder() {
        return borders[0];
    }

    @Override
    public Double getRightBorder() {
        return borders[1];
    }
}
