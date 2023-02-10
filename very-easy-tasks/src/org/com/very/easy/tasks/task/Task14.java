package org.com.very.easy.tasks.task;

import java.util.Arrays;

public class Task14 extends Task {

    public Task14() {
        setNumber(14);
        setDescription("Переставьте в массиве элементы в обратном порядке.");
    }

    @Override
    public void run() {
        super.run();
        int[] arr = {1, 2, 3, 4, 5};
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(resultArr));
    }
}
