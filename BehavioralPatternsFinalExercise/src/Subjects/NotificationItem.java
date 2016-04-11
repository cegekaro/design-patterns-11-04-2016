package Subjects;

import Observers.ElectronicCommunicationsObserver;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class NotificationItem extends BaseNotificationSubject {
    public NotificationItem(){
        this.addObserver(ElectronicCommunicationsObserver.getInstance());
    }
}
