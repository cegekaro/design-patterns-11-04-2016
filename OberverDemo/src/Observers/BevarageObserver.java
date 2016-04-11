package Observers;

import Subjects.BaseSubject;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class BevarageObserver extends BaseObserver implements BaseObserverinterface {
    private static BevarageObserver instance;

    public static BevarageObserver getInstance() {
        if(null == instance){
            instance = new BevarageObserver();
            return instance;
        }
        return instance;
    }

    @Override
    public void ourNotify() {
        System.out.println("Seems that more bevarage is needed...");
    }
}
