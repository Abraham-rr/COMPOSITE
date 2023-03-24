
package Calculadora_Composite;


public class Subtract extends Operator {
      public Subtract(Component leftOperand, Component rightOperand) {
        super(leftOperand, rightOperand);
    }
    
    public int operate() {
        return leftOperand.operate() - rightOperand.operate();
    }
}
