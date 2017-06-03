/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControler;

import java.util.HashMap;

public class Handler {
    private HistoricalView historical;
    private CulturalView cultural;
    private EntertainmentView entertainment;
    
    public Handler(){
        historical = new HistoricalView();
        cultural = new CulturalView();
        entertainment = new EntertainmentView();
    }
    public void handle(String request){
        switch (request){
            case "A":
                historical.show();
                break;
            case "B":
                cultural.show();
                break;
            case "C":
                entertainment.show();
                break;  
        }
            
   
    
    }
}
  

