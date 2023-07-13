import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    static List<User> users = new ArrayList<>();
    private String name;
    Finance finance;
    String dateRegistration;

    public User(String name, Finance finance) {
        this.name = name;
        this.finance = finance;
        this.dateRegistration = String.valueOf(LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Имя пользователя: " + name + "\nВаш бюджет на сегодня: " + this.finance.getTotalBudgetToday() + " " +
                "рублей\nВаш дополнительный бюджет (копилка - отложенные деньги)" +
                this.finance.getTotalCashDeposits() + "Ваш ежемесячный доход: " +
                this.finance.getSalaryOfMonth() + " рублей\nВаш дополнительный доход: " +
                this.finance.getOtherIncome() + " рублей\nВаш кредит: " + this.finance.getTotalCredit() +
                " рублей\nВаш ежемесячный платеж по кредиту:" + this.finance.getCreditOfMonth() + " рублей\nДата" +
                " заполнения" + this.finance.getDateRegistrationFinance();
    }
}
