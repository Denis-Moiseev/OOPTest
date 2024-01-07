package OOPTest.Controller;

import OOPTest.Model.ComplexNumber;
import OOPTest.Service.ComplexCalculatorService;

public class ComplexCalculatorController {
    private ComplexCalculatorService calculator;

    public ComplexCalculatorController() {
        this.calculator = new ComplexCalculatorService();
    }

    public ComplexNumber performOperation(String operator, ComplexNumber num1, ComplexNumber num2) {
        switch (operator) {
            case "+":
                return calculator.add(num1, num2);
            case "-":
                return calculator.subtract(num1, num2);
            case "*":
                return calculator.multiply(num1, num2);
            case "/":
                return calculator.divide(num1, num2);
            default:
                throw new IllegalArgumentException("Неподдерживаемый оператор: " + operator);
        }
    }
}