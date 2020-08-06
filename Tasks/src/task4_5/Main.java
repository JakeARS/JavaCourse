package task4_5;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] inputString = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};

        System.out.println("Computing results...");

        //Отправляем массив строк формата "Имя количество_очков" в метод
        showWinner(inputString);
    }

    public static void showWinner(String[] inputString) {
        //Создаем хэш мапу для хранения итоговых результатов. Ключ - имя, значение - суммарное количество очков
        HashMap<String, Number> resultTable = new HashMap<>();
        //Pattern patternName = Pattern.compile("[a-zA-Z]+");
        //HashSet<String> names = new HashSet(Arrays.asList(inputString));

        /*
        Создаем две переменные для хранения максимального количества очков набранного каким-либо участником и его имени.
        На самом деле тут было бы достаточно только имени, потому что имя уникально в рамках созданной мапы и количество
        очков брать уже по этому ключу
        */
        int maxPoints = 0;
        String winner = new String();

        //реализация через поиск пробела
        //Обрабатываем каждый элемент массива строк
        for (int i = 0; i < inputString.length; i++) {
            /*
            Проверяем, если в нашей мапе нету строки с ключом равным имени текущего элемента,
            то добавляем в мапу имя в качетсве ключа (строка до пробела),
            а в качестве значения количество очков из этой строки.
             */
            if (!resultTable.containsKey(inputString[i].substring(0, inputString[i].indexOf(" ")))) {
                resultTable.put(inputString[i].substring(0, inputString[i].indexOf(" ")), Integer.parseInt(inputString[i].substring(inputString[i].indexOf(" ")+1)));
            }
            /*
            В случае, если ключ равный имени из строки существует, то по этому же ключу мы добавляем к текущему значению мапы по этому ключу
            количество очков из обрабатываемой строки, простое суммирование
             */
            else {
                resultTable.put(inputString[i].substring(0, inputString[i].indexOf(" ")),
                        Integer.parseInt(inputString[i].substring(inputString[i].indexOf(" ")+1)) + (int) resultTable.get(inputString[i].substring(0, inputString[i].indexOf(" "))) );
            }
            /*
            Тут же идет проверка, если человек с этим именем побил рекорд набранных суммарно очков,
            то записываем имя победителя и количество очков в созданные ранее переменные.
            Если у нескольких участников будет равное количество очков, то победителем будет первый,
            кто достиг этого значения, т.к. используем сравнение "строго больше"
             */
            if ((int) resultTable.get(inputString[i].substring(0, inputString[i].indexOf(" "))) > maxPoints) {
                maxPoints = (int) resultTable.get(inputString[i].substring(0, inputString[i].indexOf(" ")));
                winner = inputString[i].substring(0, inputString[i].indexOf(" "));
            }
        }

        System.out.println("And the winner of the TASK4_5 World Competition Cup is ........ " + winner + "!!!! With " + maxPoints + " points!!!");

        //реализация через регулярные выражения
        /*for (int i = 0; i < inputString.length; i++) {
            Matcher matcherName = patternName.matcher(inputString[i]);
            if (matcherName.find()) {
                System.out.println(matcherName.group());
                resultTable.put(matcherName.group(), 0);
            }
        }*/
    }
}