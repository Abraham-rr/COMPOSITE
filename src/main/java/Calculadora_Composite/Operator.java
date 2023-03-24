
package Calculadora_Composite;


public abstract class Operator implements Component {
    protected Component leftOperand;
    protected Component rightOperand;
    
    public Operator(Component leftOperand, Component rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
}