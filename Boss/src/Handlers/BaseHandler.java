package Handlers;

public class BaseHandler {
    protected BaseHandler successor;

    public BaseHandler(){}

    public BaseHandler getSuccessor() {
        return successor;
    }

    public BaseHandler setSuccessor(BaseHandler successor) {
        this.successor = successor;
        return this;
    }

    public String handle(int amount){
        return "Ok, we dont know what this is. " + amount;
    }
}
