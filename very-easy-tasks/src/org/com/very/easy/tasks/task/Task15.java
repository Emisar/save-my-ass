package org.com.very.easy.tasks.task;

import org.com.very.easy.tasks.entity.Point3D;

public class Task15 extends Task {
    public Task15() {
        setNumber(15);
        setDescription("Разработайте класс Point3D (точка в трехмерном пространстве). Точка хранится в виде набора декартовых координат. Методы: \n" +
                "\t1) конструктор по координатам, \n" +
                "\t2) конструктор без параметров (создает точку – начало координат), \n" +
                "\t3) геттеры и сеттеры, \n" +
                "\t4) вывод точки на консоль. \n" +
                "Создайте несколько объектов этого класса. Сравните две точки на равенство. Для какого-то из объектов проверьте, равна ли эта точка сама себе.");
    }

    @Override
    public void run() {
        super.run();
        Point3D point1 = new Point3D();
        Point3D point2 = new Point3D(1, 1, 1);

        System.out.println("Сравниваем " + point1 + " и " + point2 + ". Равны ли они? Ответ: " + point1.equals(point2));
        System.out.println("Равна ли точка сама себе? Ответ: " + point1.equals(point1));

    }
}
