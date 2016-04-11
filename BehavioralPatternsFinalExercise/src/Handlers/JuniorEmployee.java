package Handlers;

import Subjects.EmailItem;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class JuniorEmployee extends BaseEmployeeHandler {
    public JuniorEmployee(BaseEmployeeHandler successor) {
        super(successor);
    }

    public JuniorEmployee(){}

    public void handle(int amount){
        if(amount >= 0
                && amount <= BaseEmployeeHandler.JUNIOR_MAX_AMOUNT) {
            System.out.println("Junior employee: I can approve this credit amount " + amount + ".");
            EmailItem email = new EmailItem();
            email.notifyCreditApproved();
        } else {
            this.getSuccessor().handle(amount);
        }
    }
}
