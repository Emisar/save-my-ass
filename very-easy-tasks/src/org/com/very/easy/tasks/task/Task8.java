package org.com.very.easy.tasks.task;

public class Task8 extends Task {

    public Task8() {
        setNumber(8);
        setDescription("Вывод массива на консоль.");
    }

    @Override
    public void run() {
        super.run();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Ответ: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
