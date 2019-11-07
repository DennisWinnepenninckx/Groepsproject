package domain;

public class CodeFactory {
    public CodeFactory(){

    }

    public static codeContext makeCode(String type){
        CodeStrategy code = null;
        if(type.toLowerCase().equals("spiegeling")){
            code = new Spiegeling();
        }else if(type.toLowerCase().equals("dennis")){
            code = new DennisCode();
        }
        return new codeContext(code);
    }

    public static codeContext makeCode(int plaatsen){
        CodeStrategy code = new Caesarcode(plaatsen);
        return new codeContext(code);
    }
}
