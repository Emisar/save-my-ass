package org.com.very.easy.tasks.task;

public class Task4 extends Task {

    public Task4() {
        setNumber(4);
        setDescription("Напишите программу, которая вводит три вещественных числа, понимая их как коэффициенты квадратного уравнения. " +
                "Программа производит анализ этого уравнения на предмет количества корней и находит корни. ");
    }

    @Override
    public void run() {
        super.run();
        double a = 1.0;
        double b = 6.0;
        double c = 3.0;
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Дискрименант меньше 0 значит решения нет!");
        }
        if (d == 0) {
            double result = -b / (2 * a);
            System.out.println("Дискрименант равен 0 значит корень один. Ответ: x = " + result);
        }
        if (d > 0) {
            double result1 = (-b + Math.sqrt(d)) / (2 * a);
            double result2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Дискрименант больше 0 значит два корня. Ответ: x1 = " + result1 + "; x2 = " + result2);
        }
    }
}
