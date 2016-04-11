package Subjects;

import Observers.BaseCommunicationsObserver;

import java.util.ArrayList;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class BaseNotificationSubject {
    protected ArrayList<BaseCommunicationsObserver> observers;
    public boolean isSent = false;

    public BaseNotificationSubject(){
        this.observers = new ArrayList<>();
    }

    public ArrayList<BaseCommunicationsObserver> getObservers() {
        return observers;
    }

    protected void addObserver(BaseCommunicationsObserver observer) {
        this.observers.add(observer);
    }

    public void sendCommunication(){
        for(BaseCommunicationsObserver observer : observers) {
            observer.sendCommunication();
        }
    }

    public void notifyCreditApproved() {
        this.isSent = true;
        this.sendCommunication();
    }
}
