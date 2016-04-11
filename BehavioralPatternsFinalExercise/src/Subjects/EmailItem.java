package Subjects;

import Observers.ElectronicCommunicationsObserver;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class EmailItem extends BaseNotificationSubject {
    public EmailItem(){
        this.addObserver(ElectronicCommunicationsObserver.getInstance());
    }
}
