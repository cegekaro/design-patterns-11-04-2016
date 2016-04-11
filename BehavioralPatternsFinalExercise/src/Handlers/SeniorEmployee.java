package Handlers;

import Subjects.MailItem;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class SeniorEmployee extends BaseEmployeeHandler {
    public SeniorEmployee(BaseEmployeeHandler successor) {
        super(successor);
    }

    public SeniorEmployee(){}

    public void handle(int amount){
        if(amount >= BaseEmployeeHandler.MEDIUM_MAX_AMOUNT
                && amount <= BaseEmployeeHandler.SENIOR_MAX_AMOUNT) {
            System.out.println("Senior employee: I can approve this credit amount " + amount + ".");
            MailItem mailItem = new MailItem();
            mailItem.notifyCreditApproved();
        } else {
            this.getSuccessor().handle(amount);
        }
    }
}
