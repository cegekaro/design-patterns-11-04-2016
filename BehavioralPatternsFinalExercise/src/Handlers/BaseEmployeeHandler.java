package Handlers;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class BaseEmployeeHandler {
    public static int JUNIOR_MAX_AMOUNT = 5000;
    public static int MEDIUM_MAX_AMOUNT = 15000;
    public static int SENIOR_MAX_AMOUNT = 50000;

    protected BaseEmployeeHandler successor;

    public BaseEmployeeHandler(){}
    BaseEmployeeHandler(BaseEmployeeHandler successor) {
        this.successor = successor;
    }

    public void handle(int amount) {
        System.out.println("Please refer to another bank to get a loan of " + amount);
    }

    public BaseEmployeeHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(BaseEmployeeHandler successor) {
        this.successor = successor;
    }
}
