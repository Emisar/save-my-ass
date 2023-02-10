package org.com.very.easy.tasks.task;

public class Task1 extends Task {

    public Task1() {
        setNumber(1);
        setDescription("Напишите программу, которая выводит на консоль строку 'Hello, World!'.");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Hello, World!");
    }
}
