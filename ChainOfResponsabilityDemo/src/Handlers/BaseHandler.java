package Handlers;

import Web.Request;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class BaseHandler {
    protected BaseHandler successor;

    public BaseHandler(){}

    BaseHandler(BaseHandler successor) {
        this.successor = successor;
    }

    public void handle(Request request) {
        System.out.println(request.getStatusCode());
    }

    public BaseHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(BaseHandler successor) {
        this.successor = successor;
    }
}
