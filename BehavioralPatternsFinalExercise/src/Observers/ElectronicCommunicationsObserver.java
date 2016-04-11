package Observers;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class ElectronicCommunicationsObserver extends BaseCommunicationsObserver implements BaseCommunicationsObserverInterface {
    private static ElectronicCommunicationsObserver instance;

    public static ElectronicCommunicationsObserver getInstance() {
        if(null == instance){
            instance = new ElectronicCommunicationsObserver();
            return instance;
        }
        return instance;
    }

    @Override
    public void sendCommunication() {
        System.out.println("Some sort of email or notification has been sent.");
    }
}
