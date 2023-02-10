package org.com.very.easy.tasks.task;

public class Task6 extends Task {

    public Task6() {
        setNumber(6);
        setDescription("Напишите программу для решения системы двух линейных уравнений с двумя неизвестными в вещественных числах.");
    }

    @Override
    public void run() {
        super.run();
        double a1 = 1.0;
        double b1 = -2.0;
        double c1 = -8;

        double a2 = 2.0;
        double b2 = 1.0;
        double c2 = -1.0;

        double coef1 = a1;
        double coef2 = a2;
        a1 *= coef2; b1 *= coef2; c1 *= coef2;
        a2 *= coef1; b2 *= coef1; c2 *= coef1;

        double resA = a1 - a2;
        double resB = b1 - b2;
        double resC = c1 - c2;

        double x = 0;
        double y = 0;
        if (resA == 0) {
            y = -resC / resB;
            x = -(b1 * y + c1) / a1;
        }
        if (resB == 0) {
            x = -resC / resA;
            y = -(a1 * x + c1) / b1;
        }

        System.out.println("Ответ: (" + x + ", " + y + ")");
    }
}
