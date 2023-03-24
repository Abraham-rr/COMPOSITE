
package Calculadora_Composite;


public class Multiply extends Operator {
     public Multiply(Component leftOperand, Component rightOperand) {
        super(leftOperand, rightOperand);
    }
    
    public int operate() {
        return leftOperand.operate() * rightOperand.operate();
    }
}
