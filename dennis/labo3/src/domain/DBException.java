package domain;

public class DBException extends RuntimeException {
    public DBException(String message){
        super(message);
    }
}
