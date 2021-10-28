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
public class ShoppingMall {
    private BankCard bankCard;
    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }
    public static void main(String[] args) {
        //DebitCard debitCard = new DebitCard();
        //CreditCard creditCard = new CreditCard();
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
