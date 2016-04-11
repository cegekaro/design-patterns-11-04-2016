import Handlers.BaseEmployeeHandler;
import Handlers.JuniorEmployee;
import Handlers.MediumEmployee;
import Handlers.SeniorEmployee;
import BankOffice.BankFrontOffice;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class Main {
    public static void main(String[] args){
        BaseEmployeeHandler baseEmployeeHandler = new BaseEmployeeHandler();
        SeniorEmployee largeCreditHandler = new SeniorEmployee(baseEmployeeHandler);
        MediumEmployee mediumCreditHandler = new MediumEmployee(largeCreditHandler);
        JuniorEmployee smallreditHandler = new JuniorEmployee(mediumCreditHandler);

        BankFrontOffice controller = new BankFrontOffice(smallreditHandler);

        controller.handleCustomer(400);
        controller.handleCustomer(40000);
        controller.handleCustomer(13000);
    }
}
