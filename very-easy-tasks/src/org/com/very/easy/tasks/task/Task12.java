package org.com.very.easy.tasks.task;

public class Task12 extends Task {

    public Task12() {
        setNumber(12);
        setDescription("Количество элементов массива, принадлежащих отрезку [a; b].");
    }

    @Override
    public void run() {
        super.run();
        int[] arr = {1, 2, 3, 4, 5};
        int a = 2;
        int b = 4;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                counter++;
            }
        }
        System.out.println("Кол-во элементов в отрезке [" + a + "; " + b + "]: " + counter);
    }
}
