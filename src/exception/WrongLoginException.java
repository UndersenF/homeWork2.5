package exception;

public class WrongLoginException extends RuntimeException {
    private String login;
    public WrongLoginException(String login) {
        super("Не корректный логин: %s".formatted(login));
        this.login = login;
    }

    public WrongLoginException(String message, String login) {
        super();
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
