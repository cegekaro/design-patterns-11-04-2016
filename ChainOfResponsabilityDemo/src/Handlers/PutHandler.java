package Handlers;

import Web.Request;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class PutHandler extends BaseHandler{
    public PutHandler(BaseHandler successor) {
        super(successor);
    }

    public PutHandler(){}

    public void handle(Request request){
        if(request.getStatusCode() == Request.PUT) {
            System.out.println("A PUT was issued");
        } else {
            this.getSuccessor().handle(request);
        }
    }
}
