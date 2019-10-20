package domain;

public class DBException extends RuntimeException {
    public DBException(String msg, Exception e){
        super(msg, e);
    }

    public DBException(String msg){
        super(msg);
    }
}
