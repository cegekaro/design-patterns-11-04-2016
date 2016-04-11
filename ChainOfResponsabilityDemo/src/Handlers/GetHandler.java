package Handlers;

import Web.Request;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class GetHandler extends BaseHandler{
    public GetHandler(BaseHandler successor) {
        super(successor);
    }

    public GetHandler(){}

    public void handle(Request request){
        if(request.getStatusCode() == Request.GET) {
            System.out.println("A GET was issued");
        } else {
            this.getSuccessor().handle(request);
        }
    }
}
