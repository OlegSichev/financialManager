import java.time.LocalDate;
import java.util.Date;

public class User {
    private String name;
    Finance finance;
    String dateRegistration;

    public User(String name, Finance finance){
        this.name = name;
        this.finance = finance;
        this.dateRegistration = String.valueOf(LocalDate.now());
    }
    public String toString() {
        return "Имы пользователя: " + name;
    }
}
