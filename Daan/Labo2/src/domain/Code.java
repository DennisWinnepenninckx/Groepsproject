package domain;

public class Code {
    private CodeBehavior cb;


    public Code(CodeBehavior cb){
        setCb(cb);
    }

    public Code(){

    }

    public String encode(String msg){
        return cb.encode(msg);
    }

    public String decode(String msg){
        return cb.decode(msg);
    }

    public void setCb(CodeBehavior cb){
        this.cb = cb;
    }
}
