package HomeWork;

public class ExceptionInput extends Exception{
    public ExceptionInput() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Введены некоректные данные: %s", i);
        System.out.println();
    }
}
