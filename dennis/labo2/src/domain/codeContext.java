package domain;

public class codeContext {
    private CodeStrategy cb;
    public codeContext(CodeStrategy codeStrategy){
        this.cb = codeStrategy;
    }

    public String encode(String message){
        return cb.encode(message);
    }

    public String decode(String message){
        return cb.decode(message);
    }
}
