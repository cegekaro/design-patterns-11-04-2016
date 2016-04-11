package Subjects;

import Observers.WrittenCommunicationsObserver;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class MailItem extends BaseNotificationSubject {
    public MailItem(){
        this.addObserver(WrittenCommunicationsObserver.getInstance());
    }
}
