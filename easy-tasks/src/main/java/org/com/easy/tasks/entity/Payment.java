package org.com.easy.tasks.entity;

import java.util.Objects;

public class Payment {
    private String fullName;
    private Date date;
    private int value;

    public Payment() {}

    public Payment(String fullName, Date date, int value) {
        this.fullName = fullName;
        this.date = date;
        this.value = value;
    }

    public Payment(Payment payment) {
        this.fullName = payment.getFullName();
        this.date = new Date(payment.getDate());
        this.value = payment.getValue();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Плательщик: " + fullName + ", " +
                "дата: " + date + " " +
                "сумма: " + value / 100 + " руб. " + value % 100 + " коп.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return value == payment.value && fullName.equals(payment.fullName) && date.equals(payment.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, date, value);
    }
}
