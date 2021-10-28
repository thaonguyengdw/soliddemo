/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiskovSubstitutionPrincipleViolation;

/**
 *
 * @author LENOVO
 */
public abstract class SocialMedia {
    //@support whatsapp, facebook, instagram
    public abstract void chatting();
    //@support facebook, instagram
    public abstract void postImage();
    //@support whatsapp, facebook
    public abstract void groupVideoCall(String... users);
}
