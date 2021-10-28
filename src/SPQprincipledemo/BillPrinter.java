/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPQprincipledemo;

/**
 *
 * @author LENOVO
 */
public class BillPrinter {
    private Bill bill;

    public BillPrinter(Bill bill) {
        this.bill = bill;
    }

    public void print() {
        System.out.println(bill.quantity + "x " + bill.cloth.type + " " + bill.cloth.price + " $");
        System.out.println("Discount Rate: " + bill.discountRate);
        System.out.println("Total: " + bill.total + " $");
    }
}
