package service;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class ValidationService {
    private static final String VALID_SYMBOLS = "zxcvbnmasdfghjklqwertyiopZXCVBNMASDFGHJKLQWERTYUIOP1234567890_";

    public static void validate(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин", login);
        }
        for (int i = 0; i < login.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Пароль содержит недопустимые символы!", login);
            }
        }

    }

    private static void validatePassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password);
        }
        if (password.length() > 20) {
            throw new WrongPasswordException(password);
        }
        for (int i = 0; i < password.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException(password, confirmPassword);
            }
        }
    }


}
