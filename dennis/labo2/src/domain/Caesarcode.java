package domain;

import java.util.Random;

public class Caesarcode implements CodeBehaviour {

    private int aantal_plaatsen;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public Caesarcode(){
        Random n = new Random();
        aantal_plaatsen = n.nextInt(11);
    }

    @Override
    public String encode(String message) {
        message = message.toLowerCase();
        int index;
        String encoded="";
        for(char x: message.toCharArray()){ //elke letter van de message
            if(alphabet.contains(""+x)){
                index = alphabet.indexOf(x);                 //vindt index van letter van message in alphabet array
                if (index + aantal_plaatsen > 25){
                    index +=aantal_plaatsen -26;
                }else{
                    index += aantal_plaatsen;
                }
                encoded += alphabet.charAt(index);
            }else{
                encoded += " ";
            }
        }
        return encoded;
    }

    @Override
    public String decode(String message) {
        message = message.toLowerCase();
        int index;
        String encoded="";
        for(char x: message.toCharArray()){ //elke letter van de encoded
            if(alphabet.contains(""+x)){
                index = alphabet.indexOf(x) - aantal_plaatsen;                 //vindt index van letter van message in alphabet array
                if (index < 0){
                    index +=  26;
                }
                encoded += alphabet.charAt(index);
            }else{
                encoded += " ";
            }
        }
        return encoded;
    }


}
