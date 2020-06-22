package task2;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Massiv arr = new Massiv(new int[10]);

        System.out.println("Заполнение массива, установка значений каждому элементу");
        for (int i = 0; i < arr.a.length; i++) {
            arr.setValue(ThreadLocalRandom.current().nextInt(1, 101), i);
        }

        System.out.println();
        //Вывод массива на экран
        arr.showArray();

        System.out.println();
        //Выводим количество элементов
        arr.showLength();

        System.out.println();
        //Вставляем в любую позицию массива новый элемент
        arr.newElement(322, 100);

        System.out.println();
        //Выводим количество элементов
        arr.showLength();

        System.out.println();
        arr.removeElement(5);

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
