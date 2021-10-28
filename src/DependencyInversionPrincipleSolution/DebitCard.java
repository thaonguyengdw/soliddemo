/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInversionPrincipleSolution;

/**
 *
 * @author LENOVO
 */
public class DebitCard implements BankCard {
    public void doTransaction(long amount){
        System.out.println("payment using DebitCard");
    } 
}
