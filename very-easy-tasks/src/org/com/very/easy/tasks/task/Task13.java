package org.com.very.easy.tasks.task;

public class Task13 extends Task {

    public Task13() {
        setNumber(13);
        setDescription("Проверка: все ли элементы массива положительные.");
    }

    @Override
    public void run() {
        super.run();
        int[] arr = {1, -2, 3, -4, 5};
        boolean isPositive = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                isPositive = false;
                break;
            }
        }
        System.out.println("Все ли элементы положительные? Ответ: " + isPositive);
    }
}
