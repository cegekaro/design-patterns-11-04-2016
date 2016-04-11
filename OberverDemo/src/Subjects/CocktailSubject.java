package Subjects;

import Observers.BevarageObserver;
import Observers.GoodTimeObserver;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class CocktailSubject extends BaseSubject {
    public CocktailSubject() {
        this.addObserver(BevarageObserver.getInstance());
        this.addObserver(GoodTimeObserver.getInstance());
    }
}
