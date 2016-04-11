import Handlers.BaseHandler;
import Handlers.GetHandler;
import Handlers.PostHandler;
import Handlers.PutHandler;
import Web.FrontController;
import Web.Request;
import com.sun.org.apache.regexp.internal.REUtil;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class Main {

    public static void main(String[] args){
        BaseHandler baseHandler = new BaseHandler();
        PutHandler putHandler = new PutHandler(baseHandler);
        PostHandler postHandler = new PostHandler(putHandler);
        GetHandler getHandler = new GetHandler(postHandler);

        Request request = new Request(Request.PUT);
        FrontController controller = new FrontController(getHandler);

        controller.handleRequest(request);
    }
}
