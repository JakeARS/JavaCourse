package task2_2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Создаем новый список
        AssociatedList list = new AssociatedList();

        //Добавляем элемент, если указано только значение, то в конец. Если указана позиция, то в эту позицию
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(0, 10);
        list.add(3, 3);

        //Количество элементов
        System.out.println("Всего элементов: ");
        list.countElement();

        //Изменение значения по индексу
        list.setValue(4, 322);
        System.out.println("Всего элементов: ");
        list.countElement();
        list.showList();

        //Удаление элемента по индексу
        list.removeElement(2);
        System.out.println("Всего элементов: ");
        list.countElement();

        //Вывод на экран списка
        list.showList();

        //Сортировка и вывод списка после сортировки
        list.sortList();
        list.showList();
    }
}
