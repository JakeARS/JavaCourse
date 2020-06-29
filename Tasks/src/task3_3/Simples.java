package task3_3;

public interface Simples {
    int lastNum = 1000000;
    int upperBorder = lastNum + 1;
    int maxLength = 20; // Максимальное количество символов с строке
    int maxRows = 5; // Максимальное количество строк на странице

    void fillIsSimple();

    void calcSimplesCount();

    void createSimplesArray();

    void showSimples();
}
