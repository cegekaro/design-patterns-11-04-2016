package Observers;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class WrittenCommunicationsObserver extends BaseCommunicationsObserver implements BaseCommunicationsObserverInterface {
    private static WrittenCommunicationsObserver instance;

    public static WrittenCommunicationsObserver getInstance() {
        if(null == instance){
            instance = new WrittenCommunicationsObserver();
            return instance;
        }
        return instance;
    }

    @Override
    public void sendCommunication() {
        System.out.println("A letter has been sent.");
    }
}
