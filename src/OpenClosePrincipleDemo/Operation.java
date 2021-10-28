/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosePrincipleDemo;

/**
 *
 * @author LENOVO
 */
public class Operation {
    public double caculate(double a, double b, String operationType){
        switch(operationType){
            case "+": {
                return a+b ;
            }
            case "-":{
                return a-b;
            }
            default:{
                
            }
            return 0;
        }
    }
}
