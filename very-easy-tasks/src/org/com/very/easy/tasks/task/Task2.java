package org.com.very.easy.tasks.task;

public class Task2 extends Task {

    public Task2() {
        setNumber(2);
        setDescription("Напишите программу, которая вводит три вещественных числа и выводит их  произведение, " +
                "среднее арифметическое, а также сами эти числа в порядке  возрастания.");
    }

    @Override
    public void run() {
        super.run();
        double num1 = 1.1;
        double num2 = 2.2;
        double num3 = 3.3;
        double mult = num1 * num2 * num3;
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Произведение: " + mult);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Числа: [" + num3 + ", " + num2 + ", " + num1 + "]");
    }
}
