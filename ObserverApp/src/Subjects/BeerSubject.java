package Subjects;

import Observers.BevarageObserver;
import Observers.GoodTimeObserver;

public class BeerSubject extends BaseSubject {
    public BeerSubject(){

        this.addObserver(BevarageObserver.getInstance());

        this.addObserver(GoodTimeObserver.getInstance());
    }
}
