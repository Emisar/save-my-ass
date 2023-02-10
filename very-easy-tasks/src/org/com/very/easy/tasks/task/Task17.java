package org.com.very.easy.tasks.task;

import org.com.very.easy.tasks.entity.Vector3D;
import org.com.very.easy.tasks.entity.Vector3DProcessor;

public class Task17 extends Task {
    public Task17() {
        setNumber(17);
        setDescription("Разработайте класс Vector3DProcessor с методами: \n" +
                "\t1) сумма и разность двух векторов, \n" +
                "\t2) скалярное произведение двух векторов, \n" +
                "\t3) векторное произведение двух векторов, \n" +
                "\t4) проверка коллинеарности двух векторов.");
    }

    @Override
    public void run() {
        super.run();
        Vector3D vector1 = new Vector3D(0, 0, 0, 1, 1, 1);
        Vector3D vector2 = new Vector3D(2, 2, 2, 3, 3, 3);
        Vector3D sum = Vector3DProcessor.sum(vector1, vector2);
        Vector3D sub = Vector3DProcessor.sub(vector1, vector2);
        double scalMult = Vector3DProcessor.scalMult(vector1, vector2);
        Vector3D vectMult = Vector3DProcessor.vectMult(vector1, vector2);
        boolean isCollinear = Vector3DProcessor.isCollinear(vector1, vector2);
        System.out.println("Сумма векторов " + vector1 + " и " + vector2 + ": " + sum);
        System.out.println("Разность векторов " + vector1 + " и " + vector2 + ": " + sub);
        System.out.println("Скалярное произведение векторов " + vector1 + " и " + vector2 + ": " + scalMult);
        System.out.println("Векторное произведение векторов " + vector1 + " и " + vector2 + ": " + vectMult);
        System.out.println("Проверка коллинеарности векторов " + vector1 + " и " + vector2 + ": " + isCollinear);
    }
}
