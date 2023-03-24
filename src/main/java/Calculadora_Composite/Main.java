
package Calculadora_Composite;



public class Main {
    public static void main(String[] args){
        Component two = new Number(2);
        Component three = new Number(3);
        Component four = new Number(4);
        Component five = new Number(5);

        Component multiplication = new Multiply(three, four);
        Component division = new Divide(five, two);
        Component addition = new Sum(two, multiplication);
        Component subtraction = new Subtract(addition, division);

        int result = subtraction.operate();
        System.out.println("El resultado es: " + result);
    }
}
