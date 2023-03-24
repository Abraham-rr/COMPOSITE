
package Calculadora_Composite;


public class Number implements Component {
    private int value;
    
    public Number(int value) {
        this.value = value;
    }
    
    public int operate() {
        return value;
    }
}