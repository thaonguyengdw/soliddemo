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
public interface OperationFix {
    public double caculate(double a, double b);
}

class AddOperation implements OperationFix{
    @Override
    public double caculate (double a, double b){
        return a+b;
    }
}
class SubtractOperation implements OperationFix{
    @Override
    public double caculate (double a, double b){
        return a-b;
    }
}
class MultiplicationOperation implements OperationFix{
    @Override
    public double caculate (double a, double b){
        return a*b;
    }
}
class DivisionOperation implements OperationFix{
    @Override
    public double caculate (double a, double b){
        return a/b;
    }
}
