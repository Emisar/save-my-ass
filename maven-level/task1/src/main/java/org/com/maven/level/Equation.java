package org.com.maven.level;

public class Equation {

    private final Double first;
    private final Double second;
    private final Double third;

    public Equation(Double first, Double second, Double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Double[] solve() {
        double d = second * second - 4 * first * third;
        if (d > 0) {
            double result1 = (-second + Math.sqrt(d)) / (2 * first);
            double result2 = (-second - Math.sqrt(d)) / (2 * first);
            System.out.println("Дискрименант больше 0 значит два корня. Ответ: x1 = " + result1 + "; x2 = " + result2);
            return new Double[]{result1, result2};
        }
        if (d == 0) {
            double result = -second / (2 * first);
            System.out.println("Дискрименант равен 0 значит корень один. Ответ: x = " + result);
            return new Double[]{result};
        }
        System.out.println("Дискрименант меньше 0 значит решения нет!");
        return new Double[0];
    }
}
