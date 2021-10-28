/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceSegregationPrincipleSolution;

import InterfaceSegregationPrincipleSolution.CashBackManager;

/**
 *
 * @author LENOVO
 */
public class GooglePay implements UPIPayments, CashBackManager{

    @Override
    public void payMoney() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getScratchCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCashBackAsCreditBalance() {
        //this feature is there in gpay
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
