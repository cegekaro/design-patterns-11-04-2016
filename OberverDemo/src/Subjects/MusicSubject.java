package Subjects;

import Observers.GoodTimeObserver;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class MusicSubject extends BaseSubject {
    public MusicSubject() {
        this.addObserver(GoodTimeObserver.getInstance());
    }
}
