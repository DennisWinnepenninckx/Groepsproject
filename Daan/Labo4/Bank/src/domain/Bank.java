package domain;

import java.util.ArrayList;

public class Bank implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Rekening> rekeningen;

    public Bank(){
        this.observers = new ArrayList<>();
        this.rekeningen = new ArrayList<>();
    }


    public void addRekening(Rekening rekening){
        this.rekeningen.add(rekening);
        this.notifyObservers(rekening);
    }

    public int getAantalRekeningen(){
        return this.rekeningen.size();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(Rekening rekening) {
        for (Observer observer : observers){
            observer.update(rekening);
        }
    }
}
