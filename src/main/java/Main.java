import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В ведите ФИО");
        String x = scanner.nextLine();
        Model model = new Model();
        x = x.trim();
        if (x.split(" ").length == 3) {
            int intFirstName = x.indexOf(" ");
            int intPatronymic = x.lastIndexOf(" ");

            model.setFirstName(x.substring(0, intFirstName));
            model.setSurname(x.substring(intFirstName+1));

            model.setSurname(model.getSurname().substring(0, intFirstName));
            model.setPatronymic(x.substring(intPatronymic+1));

            System.out.println("Фамилия :" + model.getFirstName());
            System.out.println("Имя :" + model.getSurname());
            System.out.println("Отчетво :" + model.getPatronymic());
        } else {
            System.out.println("Ошибка");
        }
    }
}
