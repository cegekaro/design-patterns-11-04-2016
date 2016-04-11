package Observers;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public interface BaseCommunicationsObserverInterface {
    void sendCommunication();

    static BaseCommunicationsObserver getInstance(){
        return null;
    };
}
