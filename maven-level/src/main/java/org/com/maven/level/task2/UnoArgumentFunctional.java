package org.com.maven.level.task2;

import org.com.maven.level.task1.*;

public interface UnoArgumentFunctional<T extends UnoArgumentFunction> {

    Double solve(T function, Double x);
}
