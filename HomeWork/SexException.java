package HomeWork;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Введены неверные данные! Введите пол в формате: m или f: %s", i);
        System.out.println();
    }
}
