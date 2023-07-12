import java.time.LocalDate;
import java.util.Scanner;

public class Finance {

    static Scanner scanInt = new Scanner(System.in);
    private int totalBudgetToday = 0; //общий бюджет на сегодня
    private int totalCashDeposits = 0; //копилка общая сумма
    private int salaryOfMonth = 0; //зп в месяц
    private int otherIncome = 0; //другой доход
    private int totalCredit = 0; //Общий кредит
    private int creditOfMonth = 0; // кредит в месяц
    private int addCashDeposits = 0; //ежемесячный платеж в копилку
    private String dateRegistrationFinance = null; //дата создания бюджета в программе

    private Finance(int totalBudgetToday, int totalCashDeposits, int salaryOfMonth, int otherIncome, int totalCredit, int creditOfMonth, int addCashDeposits){
        this.totalBudgetToday = totalBudgetToday;
        this.totalCashDeposits = totalCashDeposits;
        this.salaryOfMonth = salaryOfMonth;
        this.otherIncome = otherIncome;
        this.totalCredit = totalCredit;
        this.creditOfMonth = creditOfMonth;
        this.addCashDeposits = addCashDeposits;

        this.dateRegistrationFinance = String.valueOf(LocalDate.now());
    }

    public static Finance addFinance(){
        System.out.println("Введите сумму имеющуюся на руках сегодня (Ваш бюджет)");
        int totalBudgetToday = scanInt.nextInt();
        System.out.println("Введите сумму денег, которая находится в вашей копилке (Отложена на лучшую жизнь)");
        int totalCashDeposits = scanInt.nextInt();
        System.out.println("Введите ваш основной доход (з/п) в месяц:");
        int salaryOfMonth = scanInt.nextInt();
        System.out.println("Введите ваш дополнительный доход в месяц (0 - если его нет)");
        int otherIncome = scanInt.nextInt();
        System.out.println("Введите общую сумму ваших задолжностей (кредита) на сегодня:");
        int totalCredit = scanInt.nextInt();
        System.out.println("Введите сумму вашего ежемесячного кредитного платежа в месяц");
        int creditOfMonth = scanInt.nextInt();
        System.out.println("Введите сумму, которую вы планируете ежемесячно откладывать в копилку (на будущее):");
        int cashDeposits = scanInt.nextInt();
        return new Finance(totalBudgetToday, totalCashDeposits, salaryOfMonth, otherIncome, totalCredit, creditOfMonth, cashDeposits);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
