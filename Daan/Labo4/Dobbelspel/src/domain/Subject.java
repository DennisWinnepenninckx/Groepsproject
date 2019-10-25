package domain;

import javafx.collections.ObservableSet;

public interface Subject {
    void addObserver(Observer observer);
    void removerObserver(Observer observer);
    void notifyObservers();
}
