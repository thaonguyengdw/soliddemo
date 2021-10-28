/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiskovSubstitutionPrincipleSolution;

/**
 *
 * @author LENOVO
 */
public class Whatsapp implements SocialMedia, SocialVideoCallManager {

    @Override
    public void chatting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void groupVideoCall(String... users) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
