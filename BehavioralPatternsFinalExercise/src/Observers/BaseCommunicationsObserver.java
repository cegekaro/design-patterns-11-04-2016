package Observers;

/**
 * Created by cipri_000 on 4/10/2016.
 */
public class BaseCommunicationsObserver implements BaseCommunicationsObserverInterface {
    protected BaseCommunicationsObserver(){}

    @Override
    public void sendCommunication() {
        System.out.println("Seems like nothing will be sent, unfortunately.");
    }
}
