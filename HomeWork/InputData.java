package HomeWork;
import java.util.Scanner;

public class InputData {
    @SuppressWarnings("resource")
    public String[] enterData() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String data = sc.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Введены не все данные, пожалуйста повторите ввод");
            } else System.out.println("Вы ввели лишние данные, пожалуйста повторите ввод");

        }

    }

}
