package task5_2;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Massiv arr = new Massiv(new int[10]);

        System.out.println("Заполнение массива, установка значений каждому элементу");
        for (int i = 0; i < arr.a.length + 1; i++) {
            try {
                arr.setValue(ThreadLocalRandom.current().nextInt(1, 101), i);
            } catch (PositionMoreThanSizeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

        System.out.println();
        //Вывод массива на экран
        arr.showArray();

        System.out.println();
        //Выводим количество элементов
        arr.showLength();

        System.out.println();
        //Вставляем в любую позицию массива новый элемент
        try {
            arr.newElement(322, 5);
        } catch (PositionMoreThanSizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {
            arr.newElement(322, 100);
        } catch (PositionMoreThanSizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println();
        //Выводим количество элементов
        arr.showLength();

        System.out.println();
        try {
            arr.removeElement(5);
        } catch (PositionMoreThanSizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {
            arr.removeElement(800);
        } catch (PositionMoreThanSizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println();
        arr.sortArray("asc");

        System.out.println();
        arr.sortArray("desc");

        System.out.println();
        arr.showMaxValue();

        System.out.println();
        arr.showMinValue();

        System.out.println();
        arr.setSameValues(322);
    }
}