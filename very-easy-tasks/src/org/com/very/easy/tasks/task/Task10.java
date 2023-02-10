package org.com.very.easy.tasks.task;

public class Task10 extends Task {

    public Task10() {
        setNumber(10);
        setDescription("Сумма всех элементов массива.");
    }

    @Override
    public void run() {
        super.run();
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
