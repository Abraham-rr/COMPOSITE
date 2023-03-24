/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora_Composite;


public class Sum extends Operator {
     public Sum(Component leftOperand, Component rightOperand) {
        super(leftOperand, rightOperand);
    }
    
    public int operate() {
        return leftOperand.operate() + rightOperand.operate();
    }
}
