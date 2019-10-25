package domain;

import java.util.ArrayList;

public class Game implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Player> players;
    private int[] vorigeWorp;
    private int[] worp;
    private int behaaldeScore;
    private int huidigeSpeler;
    private int volgendeSpeler;
    private int beurt;

    public Game(){
        this.observers = new ArrayList<>();
        this.players = new ArrayList<>();
        this.vorigeWorp = new int[]{0,0};
        this.worp = new int[]{0,0};
        this.beurt = 1;
        this.huidigeSpeler = 0;
        this.behaaldeScore = 0;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void play(){
        worp = players.get(huidigeSpeler).gooi();
        behaaldeScore = berekenScore();
        players.get(huidigeSpeler).setScore(behaaldeScore);
        vorigeWorp = worp;
        volgendeSpeler = (huidigeSpeler + 1) % players.size();
        notifyObservers();
        huidigeSpeler = (huidigeSpeler + 1) % players.size();
        if (huidigeSpeler == 0) beurt++;
    }

    private int berekenScore(){
        int score = 0;
        score += totaalWorp(worp);
        if (worp[0] == worp[1]) score *= 2;
        if (totaalWorp(vorigeWorp)  == totaalWorp(worp)) score += 5;
        return score;
    }

    private int totaalWorp(int[] worp){
        return worp[0] + worp[1];
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        this.removerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            int vorigeObserver = huidigeSpeler-1;
            if (vorigeObserver<0){
                vorigeObserver = observers.size()-1;
            }
            observer.update();
        }
    }

    public int[] getWorp(){
        return worp;
    }

    public int getBehaaldeScore(){
        return behaaldeScore;
    }

    public int getBeurt(){
        return beurt;
    }

    public int getHuidigeSpeler(){
        return huidigeSpeler;
    }

    public int getVolgendeSpeler(){
        return volgendeSpeler;
    }

    public ArrayList<Observer> getObservers(){
        return observers;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }
}
