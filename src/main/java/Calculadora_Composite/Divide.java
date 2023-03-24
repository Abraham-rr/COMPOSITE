
package Calculadora_Composite;


public class Divide extends Operator {
    public Divide(Component leftOperand, Component rightOperand) {
        super(leftOperand, rightOperand);
    }
    
    public int operate() {
        return leftOperand.operate() / rightOperand.operate();
    }
}
