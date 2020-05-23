package br.com.martins.valdelar.exception;

public class ApiException extends Exception {

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
