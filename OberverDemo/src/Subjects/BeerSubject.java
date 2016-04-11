package Subjects;

import Observers.BaseObserver;
import Observers.BevarageObserver;
import Observers.GoodTimeObserver;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class BeerSubject extends BaseSubject{
    public BeerSubject(){
        this.addObserver(BevarageObserver.getInstance());
        this.addObserver(GoodTimeObserver.getInstance());
    }
}
