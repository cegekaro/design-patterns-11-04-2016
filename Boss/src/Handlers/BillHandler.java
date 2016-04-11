package Handlers;

public class BillHandler extends BaseHandler {

    public String handle(int amount){
        if(amount >= 100) {
            return "We have received a bill(>1leu).";
        }
        return this.getSuccessor().handle(amount);
    }
}
