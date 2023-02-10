package org.com.very.easy.tasks.task;

public class Task11 extends Task {

    public Task11() {
        setNumber(11);
        setDescription("Количество четных чисел в массиве.");
    }

    @Override
    public void run() {
        super.run();
        int[] arr = {1, 2, 3, 4, 5};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Кол-во четных чисел: " + counter);
    }
}
