package Subjects;

import Observers.GoodTimeObserver;

public class MusicSubject extends BaseSubject {
    public MusicSubject(){
        this.addObserver(GoodTimeObserver.getInstance());
    }
}
