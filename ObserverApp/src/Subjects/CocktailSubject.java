package Subjects;

import Observers.BevarageObserver;
import Observers.GoodTimeObserver;

public class CocktailSubject extends BaseSubject{
    public CocktailSubject(){
        this.addObserver(BevarageObserver.getInstance());
        this.addObserver(GoodTimeObserver.getInstance());
    }
}
