package Web;

/**
 * Created by cipri_000 on 4/9/2016.
 */
public class Request {
    public static int GET = 1;
    public static int POST = 2;
    public static int PUT = 3;

    private int statusCode;

    public Request(int statusCode){
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
