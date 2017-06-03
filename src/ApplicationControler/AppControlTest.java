/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControler;

import java.util.Scanner;

/**
 *
 * @author Yoda
 */
public class AppControlTest {
    public static void main(String[] args)
    {
        String request;
        do{
            
            Scanner input = new Scanner(System.in);
            System.out.println("Enter A for Historical sites \n"
            + "     B for Cultural sites \n"
            + "     C for Entertainment sites \n"
            + "     Q to exit");
            ApplicationController app = new ApplicationController();
        
            request = input.next();
        
            app.infoRequest(request);
        }while (request != "Q");
    }
}
