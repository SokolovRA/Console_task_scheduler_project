package exception;

public class IncorrectArgumentException extends RuntimeException{
    public String argument;

    public IncorrectArgumentException(String argument) {
        this.argument = argument;
    }
}


