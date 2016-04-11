package Observers;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public interface BaseObserverinterface {
    void ourNotify();

    static BaseObserver getInstance(){
        return null;
    };
}
