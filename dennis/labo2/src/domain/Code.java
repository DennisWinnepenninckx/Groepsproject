package domain;

public class Code {
    private CodeBehaviour cb;
    public Code( CodeBehaviour codeBehaviour){
        this.cb = codeBehaviour;
    }

    public String encode(String message){
        return cb.encode(message);
    }

    public String decode(String message){
        return cb.decode(message);
    }
}
