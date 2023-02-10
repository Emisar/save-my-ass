package org.com.very.easy.tasks.task;

public class Task7 extends Task {

    public Task7() {
        setNumber(7);
        setDescription("Напишите программу вычисления функции exp(x) разложением в ряд Тейлора с заданной точностью. " +
                "Программа должна суммировать члены ряда до тех пор, пока модуль очередного члена ряда не станет меньше точности.");
    }

    @Override
    public void run() {
        super.run();
        double x = 1.0;
        double h = 0.1;
        double sum = 1.0;
        int i = 1;
        while (Math.pow(x, i) / factorial(i) >= h) {
            sum += Math.pow(x, i) / factorial(i);
            i++;
        }
        System.out.println("Экспонента от Х: " + Math.exp(x) + ". Решение экспоненты через ряд Тейлора: " + sum);
    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
