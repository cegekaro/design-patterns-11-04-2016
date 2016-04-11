package Handlers;

import Subjects.NotificationItem;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class MediumEmployee extends BaseEmployeeHandler {
    public MediumEmployee(BaseEmployeeHandler successor) {
        super(successor);
    }

    public MediumEmployee(){}

    public void handle(int amount){
        if(amount >= BaseEmployeeHandler.JUNIOR_MAX_AMOUNT
                && amount <= BaseEmployeeHandler.MEDIUM_MAX_AMOUNT) {
            System.out.println("Medium employee: I can approve this credit amount " + amount + ".");
            NotificationItem notificationItem = new NotificationItem();
            notificationItem.notifyCreditApproved();
        } else {
            this.getSuccessor().handle(amount);
        }
    }
}
