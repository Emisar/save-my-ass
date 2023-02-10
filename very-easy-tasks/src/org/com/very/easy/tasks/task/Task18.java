package org.com.very.easy.tasks.task;

import org.com.very.easy.tasks.entity.Point3D;
import org.com.very.easy.tasks.entity.Vector3D;
import org.com.very.easy.tasks.entity.Vector3DArray;
import org.com.very.easy.tasks.exception.NotEqualsLengthsOfArraysException;

import java.util.Arrays;

public class Task18 extends Task {
    public Task18() {
        setNumber(18);
        setDescription("Разработайте класс Vector3DArray (массив трехмерных векторов). Методы: \n" +
                "\t1) конструктор по размеру (создает массив из нулевых векторов), \n" +
                "\t2) длина массива, \n" +
                "\t3) замена i-го элемента массива на заданный вектор, \n" +
                "\t4) наибольшая длина вектора в массиве, \n" +
                "\t5) поиск заданного вектора в массиве (результат – индекс первого вхождения или  –1, если не найден), \n" +
                "\t6) сумма всех векторов в массиве, \n" +
                "\t7) метод, который получает на вход массив вещественных чисел (коэффициентов) и вычисляет линейную комбинацию векторов с заданными коэффициентами. " +
                "При несовпадении длин массивов векторов и коэффициентов, результатом считать нулевой вектор (если кто-то знает, как работать с исключениями, то выбросить исключение), \n" +
                "\t8) метод, который получает на вход точку P (типа Point3D) и вычисляет массив точек, " +
                "каждая из которых – результат сдвига точки P, на соответствующий вектор.");
    }

    @Override
    public void run() {
        super.run();
        Vector3DArray vectorArray = new Vector3DArray(3);
        System.out.println("Массив векторов: " + vectorArray);
        System.out.println("Длинна массива: " + vectorArray.size());
        vectorArray.setVectorByIndex(1, new Vector3D(1, 1, 1, 2, 2, 2));
        System.out.println("Массив векторов с замененным значением: " + vectorArray);
        System.out.println("Наибольшая длинна вектора в массиве: " + vectorArray.getLongestVectorLength());
        Vector3D vectorForSearch = new Vector3D();
        System.out.println("Индекс вектора " + vectorForSearch + " в массиве: " + vectorArray.findVector(vectorForSearch));
        System.out.println("Сумма всех векторов в массиве: " + vectorArray.sumAll());
        int[] coef = {1, 2, 3};
        try {
            System.out.println("Линейная комбинация массива коеффициентов " + Arrays.toString(coef) + " и массива векторов: " + vectorArray.linearComb(coef));
        } catch (NotEqualsLengthsOfArraysException e) {
            System.out.println("Поймано исклчение: " + e.getMessage());
        }
        Point3D point = new Point3D(3, 4, 5);
        System.out.println("Произведение точки " + point + " и массива векторов: " + Arrays.toString(vectorArray.calcPoints(point).toArray()));
    }
}
