package Observers;

/**
 * Created by cipri_000 on 4/10/2016.
 */
public class BaseObserver implements BaseObserverinterface {
    protected BaseObserver(){}

    @Override
    public void ourNotify() {
        System.out.println("Seems that more bevarage is needed...");
    }
}
