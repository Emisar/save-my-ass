package org.com.very.easy.tasks.task;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 extends Task {

    public Task9() {
        setNumber(9);
        setDescription("Ввод элементов массива с клавиатуры.");
    }

    @Override
    public void run() {
        super.run();
        int arrSize = 3;
        int[] arr = new int[arrSize];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
