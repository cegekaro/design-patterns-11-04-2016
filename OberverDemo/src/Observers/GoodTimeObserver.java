package Observers;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class GoodTimeObserver extends BaseObserver implements BaseObserverinterface {
    private static GoodTimeObserver instance;

    public static GoodTimeObserver getInstance() {
        if(null == instance){
            instance = new GoodTimeObserver();
            return instance;
        }
        return instance;
    }

    @Override
    public void ourNotify() {
        System.out.println("Seems that the user is no having quite a good time...");
    }
}
