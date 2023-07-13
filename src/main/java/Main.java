import java.util.Scanner;

public class Main {

    static User user;
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanStr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в финансовый менеджер!\nВведите ваше имя:");
        String name = scanStr.nextLine();
        welcome(name);
    }

    static void welcome(String name) {
        System.out.println("Выберите пункт меню цифрой:\n1.Ввести новые данные\n2.Вывести текущие данные\n3.Выход" +
                " из программы");
        int input = scanInt.nextInt();
        switch (input) {
            case 1 -> {
                user = Finance.addFinance(name); //Создали пользователя со всеми данными, добавили в лист
                // пользователей
                welcome(user.getName());
            }

            case 2 -> {
                System.out.println(user);
            }
            case 3 -> {
                System.exit(0);
            }
        }
    }
}
