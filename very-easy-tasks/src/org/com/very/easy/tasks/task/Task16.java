package org.com.very.easy.tasks.task;

import org.com.very.easy.tasks.entity.Point3D;
import org.com.very.easy.tasks.entity.Vector3D;

public class Task16 extends Task {
    public Task16() {
        setNumber(16);
        setDescription("Разработайте класс Vector3D (вектор в трехмерном пространстве). Вектор хранится  в виде набора своих координат. Методы: \n" +
                "\t1) конструктор без параметров (создает нулевой вектор), \n" +
                "\t2) конструктор по координатам, \n" +
                "\t3) конструктор по двум точкам (Point3D), \n" +
                "\t4) длина вектора, \n" +
                "\t5) проверка равенства с заданным вектором.");
    }

    @Override
    public void run() {
        super.run();
        Point3D point1 = new Point3D();
        Point3D point2 = new Point3D(1, 1, 1);
        Vector3D vector1 = new Vector3D();
        Vector3D vector2 = new Vector3D(point1, point2);
        System.out.println("Длина вектора " + vector2 + ": " + vector2.length());
        System.out.println("Равен ли вектор " + vector1 + " вектору " + vector2 + "? Ответ: " + vector1.equals(vector2));
    }
}
