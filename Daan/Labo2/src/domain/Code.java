package domain;

public class Code {
    private CodeBehavior cb;


    public Code(CodeBehavior cb){
        this.cb = cb;
    }

    public String encode(String msg){
        return cb.encode(msg);
    }

    public String decode(String msg){
        return cb.decode(msg);
    }
}
