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
public class Bill {
    public Cloth cloth;
    public int quantity;
    public double discountRate;
    public double total;
    public Bill(Cloth cloth, int quantity, double discountRate, double total) {
        this.cloth = cloth;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.total = total;
    } 
    public double total() {
	        double price = ((cloth.price - cloth.price * discountRate) * this.quantity);

		return price;
	}

	public void printBill() {
            System.out.println(quantity + "x " + cloth.type + " " + cloth.price + "$");
            System.out.println("Discount Rate: " + discountRate);
            System.out.println("Total: " + total);
	}

        public void saveToFile(String filename) {
	// Creates a file with given name and writes the invoice
	}
}
