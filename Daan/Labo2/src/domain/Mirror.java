package domain;

public class Mirror implements CodeBehavior{
    @Override
    public String encode(String msg){
        String encoded = "";
        for (int i = msg.length() - 1 ; i >= 0 ; i--){
            encoded += msg.charAt(i);
        }
        return encoded;
    }
    @Override
    public String decode(String msg){
        return encode(msg);
    }
}
