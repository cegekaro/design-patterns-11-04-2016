package Handlers;

import Web.Request;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class PostHandler extends BaseHandler{
    public PostHandler(BaseHandler successor) {
        super(successor);
    }

    public PostHandler(){}

    public void handle(Request request){
        if(request.getStatusCode() == Request.POST) {
            System.out.println("A POST was issued");
        } else {
            this.getSuccessor().handle(request);
        }
    }
}
