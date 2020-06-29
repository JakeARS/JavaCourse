package task3_2;

import java.util.Calendar;
import java.util.Date;

public class MyLoggerCustom implements LoggerCustom {

    @Override
    public void writeLog(String message) {
        Date dateNow = Calendar.getInstance().getTime();
        System.out.print(System.lineSeparator() + compName + " " + userName + " " + dateNow + ": " + message);
    }
}
