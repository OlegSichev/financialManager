import java.util.Scanner;

public class Main {

    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanStr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в финансовый менеджер!\nВведите ваше имя:");
        String name = scanStr.nextLine();
        welcome(name);
    }

    static void welcome(String name) {
        System.out.println("Добро пожаловать в финансовый менеджер!\nВыберите пункт меню цифрой:\n1.Ввести новые" +
                " данные\n2.Вывести текущие данные\n3.Выход из программы");
        int input = scanInt.nextInt();
        switch (input) {
            case 1 -> {
                //todo new method data in
            }

            case 2 -> {
                //todo showMe data
            }
            case 3 -> {
                System.exit(0);
            }
        }
    }
}
