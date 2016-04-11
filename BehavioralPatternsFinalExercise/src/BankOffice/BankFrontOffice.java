package BankOffice;

import Handlers.BaseEmployeeHandler;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class BankFrontOffice {
    protected BaseEmployeeHandler firstHandler;

    public BankFrontOffice(BaseEmployeeHandler firstHandler){
        this.firstHandler = firstHandler;
    }

    public void handleCustomer(int amount){
        this.firstHandler.handle(amount);
    }
}
