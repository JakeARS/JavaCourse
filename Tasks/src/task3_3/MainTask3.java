package task3_3;

import java.io.EOFException;

public class MainTask3 {

    public static void main(String[] args) throws EOFException {
        /*
         * Реализация генерации всех простых чисел в заданном диапазоне
         */
        SimpleNumbers simp = new SimpleNumbers();

        simp.fillIsSimple();
        simp.calcSimplesCount();
        simp.createSimplesArray();
        simp.showSimples();
    }
}
