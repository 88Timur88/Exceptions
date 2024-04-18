package HomeWork;

public class ExceptionDate extends Exception {
    public ExceptionDate() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Введены некорректные данные: %s", i);
        System.out.println();
    }
}
