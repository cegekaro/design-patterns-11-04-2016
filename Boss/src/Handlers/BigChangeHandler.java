package Handlers;

public class BigChangeHandler extends BaseHandler{
    public String handle(int amount){
        if(amount < 100 && amount > 10) {
            return "We have received some big change (bani).";
        }
        return this.getSuccessor().handle(amount);
    }
}
