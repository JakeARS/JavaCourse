package task3_2;

public interface LoggerCustom {
    String compName = System.getenv("COMPUTERNAME");
    String userName = System.getenv("USERNAME");

    void writeLog(String message);
}
