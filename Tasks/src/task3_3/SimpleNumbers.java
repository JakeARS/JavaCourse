package task3_3;

import java.io.EOFException;

public class SimpleNumbers implements Simples {

    boolean[] isSimple;
    int countSimple = 0;
    int[] simpleNums;
    int correntLength = 0;
    int currentRows = 0;

    public SimpleNumbers() throws EOFException {
        if (lastNum >= 2) {
            this.isSimple = new boolean[upperBorder];
        } else {
            throw new EOFException("Невозможно создать массив");
        }
    }

    @Override
    public void fillIsSimple() {
        // Заполняем массив true
        for (int i = 0; i < upperBorder ; i++)
            isSimple[i] = true;
        isSimple[0] = isSimple[1] = false;

        // Алгоритм Решето Эратосфена
        for (int i = 2; i < Math.sqrt(upperBorder) + 1; i++) {
            // Вычеркиваем числа кратные данному числу
            if (isSimple[i]) {
                for (int j = 2 * i; j < upperBorder; j += i) {
                    isSimple[j] = false;
                }
            }
        }
    }

    @Override
    public void calcSimplesCount() {
        // Подсчитываем количество простых чисел
        for (int i = 0; i < upperBorder; i++) {
            if (isSimple[i])
                countSimple++;
        }
    }

    @Override
    public void createSimplesArray() {
        // Итоговый массив
        simpleNums = new int[countSimple];

        for (int i = 0, j = 0; i < upperBorder; i++) {
            if (isSimple[i])
                simpleNums[j++] = i;
        }
    }

    @Override
    public void showSimples() {
        // Вывод
        for (int a: simpleNums) {
            System.out.print(a + " ");
            correntLength += String.valueOf(a).length() + 1;
            if (correntLength >= maxLength) {
                // Переход на новую строку
                System.out.println();
                correntLength = 0;
                currentRows++;
            }
            if (currentRows >= maxRows) {
                System.out.println("--------Новая cтраница--------");
                currentRows = 0;
            }
        }
    }
}
