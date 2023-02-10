package org.com.very.easy.tasks.task;

public class Task3 extends Task {

    public Task3() {
        setNumber(3);
        setDescription("Модифицируйте программу из предыдущей задачи так, чтобы она работала с  целыми числами. " +
                "Правильно ли работает ваша программа, если на вход подать  числа 1, 2, 5? ");
    }

    @Override
    public void run() {
        super.run();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int mult = num1 * num2 * num3;
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Произведение: " + mult);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Числа: [" + num3 + ", " + num2 + ", " + num1 + "]");
    }
}
