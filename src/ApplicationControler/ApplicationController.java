
package ApplicationControler;

import java.util.HashMap;

public class ApplicationController {
    private static final HashMap<String, Handler> controlHash = new HashMap<>();
    
    private final Handler handler;

    public ApplicationController(){
        handler = new Handler();
        
    }
    public void infoRequest(String request){
        handler.handle(request);
    }
    
}