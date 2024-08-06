import exception.WrongLoginException;
import exception.WrongPasswordException;
import service.ValidationService;

import static service.ValidationService.validate;

public class Main {
    public static void main(String[] args) {
        try {
            validate("login", "password", "password");
            System.out.println("Ооо все окей!");
        } catch (WrongPasswordException a) {
            System.out.println("С паролем что-то не так!");
        } catch (WrongLoginException b) {
            System.out.println("С логином что-то не так!");
        }
//todo Найти как прекратить выполнение блока final
    }
}