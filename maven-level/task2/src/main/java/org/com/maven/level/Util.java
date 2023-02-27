package org.com.maven.level;

public class Util {

    private final Equation equation;

    public Util(Equation equation) {
        this.equation = equation;
    }

    public Double getGreatestRoot() throws NoRootsException {
        Double[] solve = equation.solve();
        if (solve.length == 0) throw new NoRootsException();
        if (solve.length == 1) return solve[0];
        return Math.max(solve[0], solve[1]);
    }
}
