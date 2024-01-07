package OOPTest;

import OOPTest.Controller.ComplexCalculatorController;
import OOPTest.Model.ComplexNumber;
import OOPTest.View.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = ConsoleView.readComplexNumber();
        ComplexNumber num2 = ConsoleView.readComplexNumber();
        String operator = ConsoleView.readOperator();

        ComplexCalculatorController controller = new ComplexCalculatorController();
        ComplexNumber result = controller.performOperation(operator, num1, num2);

        ConsoleView.displayResult(result);
    }
}