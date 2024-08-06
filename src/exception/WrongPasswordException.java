package exception;

public class WrongPasswordException extends RuntimeException{
    private String password;
    private String confirmPassword;
    public WrongPasswordException(String password) {
        super("Не корректный пароль: %s".formatted(password));
        this.password = password;
    }
    public WrongPasswordException(String password, String confirmPassword) {
        super("Пароль %s отличается от %s".formatted(password, confirmPassword));  //todo
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }
}
