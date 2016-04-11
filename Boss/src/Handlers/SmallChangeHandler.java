package Handlers;

public class SmallChangeHandler extends BaseHandler{

    public String handle(int amount){
        if(amount <= 10) {
            return "We have received some small change (<10bani).";
        }
        return this.getSuccessor().handle(amount);
    }
}
