package Observers;

public class GoodTimeObserver extends BaseObserver{
    private static GoodTimeObserver instance;

    private GoodTimeObserver(){};

    public static GoodTimeObserver getInstance(){
        if (null == instance){
            instance = new GoodTimeObserver();
        }
        return instance;
    }

    public void observerNotify(){
        System.out.println("The user is not having a good time");
    }
}
