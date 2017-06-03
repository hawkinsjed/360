
package ApplicationControler;

import java.util.HashMap;

public class ApplicationController {
    private Handler handler;

    public ApplicationController(){
        handler = new Handler();
        
    }
    public void infoRequest(String request){
        handler.handle(request);
    }
    
}