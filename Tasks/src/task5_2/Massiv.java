package task5_2;

public class Massiv {
    int[] a;

    public Massiv(int[] arr) {
        this.a = arr;
    }

    public void setValue(int value, int position) throws PositionMoreThanSizeException {
        //Выбрасываем исключение
        if (position >= a.length) {
            throw new PositionMoreThanSizeException("Указано неверное значение позиции");
        }
        a[position]  = value;
        System.out.println(position + "-му элементу присвоено значение " + "");
    }

    public void showArray() {
        System.out.println("Вывод массива на экран: ");
        for (int i : a
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void newElement(int value, int position) throws PositionMoreThanSizeException {
        //Выбрасываем исключение
        if (position >= a.length) {
            throw new PositionMoreThanSizeException("Указано неверное значение позиции");
        }
        int[] tempArr = new int[a.length];
        int newLength = a.length + 1;

        System.out.println("Вставляем в " + position + " позицию значение " + value);

        tempArr = a;
        position = position >tempArr.length - 1 ? tempArr.length : position;

        a = new int[newLength];

        for (int i = 0; i < a.length; i++) {
            if (i < position) {
                a[i] = tempArr[i];
            } else if (i > position) {
                a[i] = tempArr[i - 1];
            } else if (i == position || position >= a.length) {
                a[i] = value;
            }
        }

        showArray();
    }

    public void removeElement(int position) throws PositionMoreThanSizeException {
        //Выбрасываем исключение
        if (position >= a.length) {
            throw new PositionMoreThanSizeException("Указано неверное значение позиции");
        }
        int[] tempArr = new int[a.length];
        int newlength = a.length - 1;

        tempArr = a;
        position = position > tempArr.length - 1 ? tempArr.length : position;

        System.out.println("Удаляем из массива " + position + "-й элемент");

        a = new int[newlength];

        for (int i = 0; i < a.length; i++) {
            if (i < position) {
                a[i] = tempArr[i];
            }
            else {
                a[i] = tempArr[i + 1];
            }
        }

        showArray();
    }

    public void showLength() {
        int count = 0;

        for (int i : a
        ) {
            count++;
        }

        System.out.println("В массиве " + count + " элементов");
    }

    public void sortArray(String type) {
        int[] tempArr = a;

        System.out.println("Сортируем массив по " + (type.equals("asc") ? "возрастанию" : "убыванию"));

        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 0; j < tempArr.length - 1; j++) {
                if (tempArr[j] > tempArr[j + 1] && type == "asc") {
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                }
                else if (tempArr[j] < tempArr[j + 1] && type == "desc") {
                    int temp = tempArr[j];
                    tempArr[j] = tempArr[j + 1];
                    tempArr[j + 1] = temp;
                }
            }
        }

        for (int i : tempArr
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void showMaxValue() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max=a[i];
            }
        }
        System.out.println("Максимальное значение массива " + max);
    }

    public void showMinValue() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Минимальное значение массива " + min);
    }

    public void setSameValues(int value) {
        System.out.println("Заполняем весь массив значением " + value);
        for (int i = 0; i < a.length; i++) {
            a[i] = value;
        }
        showArray();
    }
}