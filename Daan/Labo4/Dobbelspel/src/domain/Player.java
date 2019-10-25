package domain;

import java.util.Random;

public class Player {
    private int score;

    public Player(){
        this.score = 0;
    }

    public int[] gooi(){
        int[] result = new int[2];
        Random r = new Random();
        result[0] = r.nextInt(6)+1;
        result[1] = r.nextInt(6)+1;
        return result;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        this.score += score;
    }
}
