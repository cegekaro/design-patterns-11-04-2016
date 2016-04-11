package Web;

import Handlers.BaseHandler;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class FrontController {
    protected BaseHandler firstHandler;

    public FrontController(BaseHandler firstHandler){
        this.firstHandler = firstHandler;
    }

    public void handleRequest(Request request){
        this.firstHandler.handle(request);
    }
}
