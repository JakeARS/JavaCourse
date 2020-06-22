package task1;

public class Main {
    public static void main(String[] args) {
        //C(CODE_CAR)_гос номер-Пробег-(доп. параметр)
        String[] arr = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        Transport[] arrTransport = new Transport[arr.length];

        //Затраты топлива
        double fuelAmountLight = 0; //car.calcFuel();
        double fuelAmountCargo = 0;
        double fuelAmountPassenger = 0;
        double fuelAmountHeavy = 0;
        double fuelAmountTotal = 0;

        //Денежные затраты на топливо
        double expensesLight = 0; //car.calcFuel();
        double expensesCargo = 0;
        double expensesPassenger = 0;
        double expensesHeavy = 0;
        double expensesTotal = 0;

        //Заполняем массив типа Transport наследниками
        for (int i = 0; i < arrTransport.length; i++) {
            if (arr[i].contains("C100")) {
                String[] carParams = arr[i].substring(5).split("-");
                arrTransport[i] = new Light(100, Integer.parseInt(carParams[0]), Integer.parseInt(carParams[1]));
                fuelAmountLight += arrTransport[i].calcFuel();
                expensesLight += arrTransport[i].calcExpenses();
            }
            if (arr[i].contains("C200")) {
                String[] carParams = arr[i].substring(5).split("-");
                arrTransport[i] = new Cargo(200, Integer.parseInt(carParams[0]), Integer.parseInt(carParams[1]), Integer.parseInt(carParams[2]));
                fuelAmountCargo += arrTransport[i].calcFuel();
                expensesCargo += arrTransport[i].calcExpenses();
            }
            if (arr[i].contains("C300")) {
                String[] carParams = arr[i].substring(5).split("-");
                arrTransport[i] = new Passenger(300, Integer.parseInt(carParams[0]), Integer.parseInt(carParams[1]), Integer.parseInt(carParams[2]));
                fuelAmountPassenger += arrTransport[i].calcFuel();
                expensesPassenger += arrTransport[i].calcExpenses();
            }
            if (arr[i].contains("C400")) {
                String[] carParams = arr[i].substring(5).split("-");
                arrTransport[i] = new Heavy(400, Integer.parseInt(carParams[0]), Integer.parseInt(carParams[1]), Integer.parseInt(carParams[2]));
                fuelAmountHeavy += arrTransport[i].calcFuel();
                expensesHeavy += arrTransport[i].calcExpenses();
            }
        }

        //Итоги по всем транспортам
        fuelAmountTotal = fuelAmountLight + fuelAmountCargo + fuelAmountPassenger + fuelAmountHeavy;
        expensesTotal = expensesLight + expensesCargo + expensesPassenger + expensesHeavy;

        System.out.println("Литров топлива для легковых: " + fuelAmountLight);
        System.out.println("Литров топлива для грузовых: " + fuelAmountCargo);
        System.out.println("Литров топлива для пассажирских: " + fuelAmountPassenger);
        System.out.println("Литров топлива для тяжелой техники: " + fuelAmountHeavy);
        System.out.println("Литров топлива для всех типов: " + fuelAmountTotal);
        System.out.println();
        System.out.println("Затраты на легковые: " + expensesLight);
        System.out.println("Затраты на грузовые: " + expensesCargo);
        System.out.println("Затраты на пассажирские: " + expensesPassenger);
        System.out.println("Затраты на тяжелую технику: " + expensesHeavy);
        System.out.println("Затраты на все типы: " + expensesTotal);
        System.out.println();

        //Городим три огорода, чтобы вывести дорогой и дешевый типы трансопрта
        System.out.println("Самый дорогой тип: " + (expensesLight > expensesCargo && expensesLight > expensesPassenger && expensesLight > expensesHeavy ? "легковые авто" :
                expensesCargo > expensesPassenger && expensesCargo > expensesHeavy ? "грузовые авто" :
                expensesPassenger > expensesHeavy ? "пассажирский транспорт" : "тяжелая техника"));

        System.out.println("Самый дешевый тип: " + (expensesLight < expensesCargo && expensesLight < expensesPassenger && expensesLight < expensesHeavy ? "легковые авто" :
                expensesCargo < expensesPassenger && expensesCargo < expensesHeavy ? "грузовые авто" :
                        expensesPassenger < expensesHeavy ? "пассажирский транспорт" : "тяжелая техника"));

        System.out.println();

        /**
         * В качестве примера сортировки выведем два типа ТС: 100 и 200, причем для обоих укажем сортировку по полю param.
         * Сделал такой пример, потому что у 100 типа нету доп. параметра.
         */
        showSortedTransport(arrTransport, 100, "param");
        System.out.println();
        showSortedTransport(arrTransport, 200, "param");

    }

    public static void showSortedTransport(Transport[] arrTransport, int type, String field) {
        int countType = 0;
        //определяем количество транспортов заданного типа
        for (int i = 0; i < arrTransport.length; i++) {
            if (arrTransport[i].codeCar == type) {
                countType++;
            }
        }
        //создаем массив транспортов необходимого размера
        Transport[] thisTransport = new Transport[countType];
        //заполняем созданный массив только нужным типом транспорта
        int k = 0;
        for (int i = 0; i < arrTransport.length; i++) {
            if (arrTransport[i].codeCar == type) {
                thisTransport[k] = arrTransport[i];
                k++;
            }
        }
        //В зависимости от входных параметров сортируем по нужному полю
        System.out.println("Сортировка типа " + type + " по полю " + field);
        for (int i = 0; i < thisTransport.length; i++) {
            for (int j = 0; j < thisTransport.length - 1; j++) {
                if (thisTransport[j].mileage > thisTransport[j + 1].mileage && (field == "mileage" || type == 100)) {
                    Transport tempTransport = thisTransport[j];
                    thisTransport[j] = thisTransport[j + 1];
                    thisTransport[j + 1] = tempTransport;
                }
                else if (thisTransport[j].param > thisTransport[j + 1].param && field == "param") {
                    Transport tempTransport = thisTransport[j];
                    thisTransport[j] = thisTransport[j + 1];
                    thisTransport[j + 1] = tempTransport;
                }
            }
        }

        //Вывод на экран всех экземпляров данного типа
        for (int i = 0; i < thisTransport.length; i++) {
            System.out.println("Тип: " + thisTransport[i].codeCar + ", номер: " + thisTransport[i].gosNumber +
                    ", пробег: " + thisTransport[i].mileage + ", доп. параметр: " + thisTransport[i].param);
        }
    }
}
