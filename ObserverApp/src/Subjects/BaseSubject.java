package Subjects;

import Observers.BaseObserver;

import java.util.ArrayList;

public class BaseSubject {
    protected ArrayList<BaseObserver> observers;

    public BaseSubject(){
        this.observers = new ArrayList<>();
    }

    public ArrayList<BaseObserver> getObservers() {
        return observers;
    }

    public BaseSubject setObservers(ArrayList<BaseObserver> observers) {
        this.observers = observers;
        return this;
    }

    public void addObserver(BaseObserver observer) {
        observers.add(observer);
    }

    public void changeState(){
        for(BaseObserver observer : this.observers) {
            observer.observerNotify();
        }
    }
}
