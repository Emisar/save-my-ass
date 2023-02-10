package org.com.very.easy.tasks;

import org.com.very.easy.tasks.task.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.asList(
                new Task1(), new Task2(), new Task3(), new Task4(), new Task5(), new Task6(),
                new Task7(), new Task8(), new Task9(), new Task10(), new Task11(), new Task12(),
                new Task13(), new Task14(), new Task15(), new Task16(), new Task17(), new Task18()
        ).forEach(Task::run);
    }
}
