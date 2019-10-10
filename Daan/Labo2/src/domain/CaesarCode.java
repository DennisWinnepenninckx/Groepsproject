package domain;

import java.util.Random;

public class CaesarCode implements CodeBehavior {
    private int rotateNum;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public CaesarCode(int rotateNum){
        setRotateNum(rotateNum);
    }

    @Override
    public String encode(String msg){
        String encoded = "";
        int position = 0;
        msg = msg.toLowerCase();
        for (int i = 0 ; i < msg.length() ; i++){
            // BLANK ADD TO MAKE CONTAINS WORK
            if (alphabet.contains(msg.charAt(i)+"")) {
                position = alphabet.indexOf(msg.charAt(i)) + rotateNum;
                if (position > 25) {
                    position = position - 26;
                }
                encoded += alphabet.charAt(position);
            }
            else {
                encoded += msg.charAt(i);
            }
        }
        return encoded;
    }

    @Override
    public String decode(String msg){
        String decoded = "";
        int position = 0;
        msg = msg.toLowerCase();
        for (int i = 0 ; i < msg.length() ; i++){
            // BLANK ADD TO MAKE CONTAINS WORK
            if (alphabet.contains(msg.charAt(i)+"")) {
                position = alphabet.indexOf(msg.charAt(i)) - rotateNum;
                if (position < 0) {
                    // ADD BECAUSE NEGATIVE NUMBER
                    position = 26 + position;
                }
                decoded += alphabet.charAt(position);
            }
            else {
                decoded += msg.charAt(i);
            }
        }
        return decoded;
    }

    public void setRotateNum(int num){
        rotateNum = num;
    }
}
