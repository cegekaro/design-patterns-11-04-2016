import Handlers.BaseHandler;
import Handlers.BigChangeHandler;
import Handlers.BillHandler;
import Handlers.SmallChangeHandler;

public class Main {
    public static void main(String[] args) {
        SmallChangeHandler smallChangeHandler = new SmallChangeHandler();
        BigChangeHandler bigChangeHandler = new BigChangeHandler();
        BillHandler billHandler = new BillHandler();

        smallChangeHandler.setSuccessor(bigChangeHandler);
        bigChangeHandler.setSuccessor(billHandler);
        billHandler.setSuccessor(new BaseHandler());

        System.out.println(smallChangeHandler.handle(-100));
    }
}
