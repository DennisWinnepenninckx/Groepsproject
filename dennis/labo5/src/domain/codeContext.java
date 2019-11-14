package domain;

public class codeContext {
    private CodeStrategy cb;
    public codeContext(String s){
        cb = CodeFactory.makeCode(s);
    }
    public codeContext(String s, Object... args){
        cb = CodeFactory.makeCode(s,args);
    }

    public String encode(String message){
        return cb.encode(message);
    }

    public String decode(String message){
        return cb.decode(message);
    }

    @Override
    public String toString() {
        return cb.toString();
    }
}
