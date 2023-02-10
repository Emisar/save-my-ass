package org.com.very.easy.tasks.task;

public abstract class Task {

    protected Integer number;
    protected String description;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void run() {
        System.out.printf("Задача %d: %s%n", number, description);
    }
}
