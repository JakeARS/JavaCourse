package task2_2;

import java.util.LinkedList;

public class AssociatedList {
    private int size = 0;
    private ListElement firstElement;
    private ListElement lastElement;

    public void add(int value) {
        if (size == 0) {
            ListElement newElem = new ListElement(value, null, null);
            firstElement = newElem;
            lastElement = newElem;
        }
        else {
            ListElement oldLast = lastElement;
            ListElement newElem = new ListElement(value, oldLast, null);
            oldLast.nextElement = newElem;
            lastElement = newElem;
        }
        size++;
        System.out.println("В конец списка добавлено значение " + value);
    }

    public void add(int position, int value) {
        if (size == 0 || position >= size) {
            add(value);
        } else if (position < size) {
            ListElement x = firstElement;
            for (int i = 0; i < position; i++) {
                x = x.nextElement;
            }
            ListElement newElem = new ListElement(value, x.previousElement, x);
            ListElement temp = null;
            if (position == 0) {
                temp = firstElement;
                temp.previousElement = newElem;
                firstElement = newElem;
            } else {
                temp = x.previousElement;
                temp.nextElement = newElem;
                x.previousElement = newElem;
            }
            size++;

            System.out.println("В позицию " + position + " добавлено значение " + value);
        }
    }

    public void setValue(int position, int value) {
        position = Integer.min(position, size - 1);
        ListElement temp = firstElement;
        for (int i = 0; i < position; i++) {
            temp = temp.nextElement;
        }
        temp.value = value;

        System.out.println(position + "-му элементу установлено значение " + value);
    }

    public void countElement() {
        System.out.println(size);
    }

    public void removeElement(int position) {
        position = Math.min(position, size - 1);

        if (position == 0) {
            firstElement = firstElement.nextElement;
            firstElement.previousElement = null;
        }
        else if (position == size - 1) {
            lastElement = lastElement.previousElement;
            lastElement.nextElement = null;
        } else {
            ListElement temp = firstElement;
            for (int i = 0; i < position; i++) {
                temp = temp.nextElement;
            }
            ListElement tempPrev = temp.previousElement;
            ListElement tempNext = temp.nextElement;
            tempPrev.nextElement = tempNext;
            tempNext.previousElement = tempPrev;
        }
        size--;

        System.out.println("Удален " + position + "-й элемент");
    }

    public void showList() {
        ListElement temp = firstElement;
        System.out.println("Весь список: ");
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " ");
            temp = temp.nextElement;
        }
        System.out.println();
    }

    public void sortList() {
        for (int i = 0; i < size; i++) {
            ListElement temp = firstElement;
            for (int j = 0; j < size - 1; j++) {
                ListElement tempFirst = temp;
                ListElement tempSecond = temp.nextElement;
                if (tempFirst.value > tempSecond.value) {
                    tempSecond.previousElement = tempFirst.previousElement;
                    tempFirst.previousElement = tempSecond;
                    tempFirst.nextElement = tempSecond.nextElement;
                    tempSecond.nextElement = tempFirst;
                    if (j < size - 2) {
                        tempFirst.nextElement.previousElement = tempFirst;
                    }

                    if (j > 0) {
                        tempSecond.previousElement.nextElement = tempSecond;
                    }

                    if (j == 0) {
                        firstElement = tempSecond;
                    }
                    temp = tempFirst;
                } else {
                    temp = tempFirst.nextElement;
                }
            }
        }
        System.out.println("Список отсортирован");
    }

    //Класс, реализующий объекты списка
    public static class ListElement {
        private int value;
        private ListElement previousElement;
        private ListElement nextElement;

        ListElement(int value, ListElement previousElement, ListElement nextElement) {
            this.value = value;
            this.previousElement = previousElement;
            this.nextElement = nextElement;
        }
    }
}
