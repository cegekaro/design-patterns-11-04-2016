package Observers;

public class BevarageObserver extends BaseObserver{
    private static BevarageObserver instance;

    private BevarageObserver(){};

    public static BevarageObserver getInstance(){
            if (null == instance){
            instance = new BevarageObserver();
        }
        return instance;
    }

    public void observerNotify(){
        System.out.println("The user is not having enough alcohol");
    }
}
