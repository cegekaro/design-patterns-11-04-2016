package Subjects;

import Observers.BaseObserver;

import java.util.ArrayList;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class BaseSubject {
    protected ArrayList<BaseObserver> observers;
    protected int state;

    public BaseSubject(){
        this.observers = new ArrayList<>();
        this.state = 0;
    }

    public ArrayList<BaseObserver> getObservers() {
        return observers;
    }

    protected void addObserver(BaseObserver observer) {
        this.observers.add(observer);
    }

    public void ourNotify(){
        for(BaseObserver observer : observers) {
            observer.ourNotify();
        }
    }

    public void changeState() {
        this.state += 1;
        this.ourNotify();
    }
}
