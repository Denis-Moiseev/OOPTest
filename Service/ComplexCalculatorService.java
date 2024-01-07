package OOPTest.Service;

import java.util.logging.Logger;

import OOPTest.Model.ComplexNumber;

public class ComplexCalculatorService {
    private static final Logger logger = Logger.getLogger(ComplexCalculatorService.class.getName());

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);

        logger.info("Выполнена операция сложения комплексных чисел: " + num1 + " + " + num2 + " = " + result);

        return result;
    }

    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() - num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() - num2.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);

        logger.info("Выполнена операция вычитания комплексных чисел: " + num1 + " + " + num2 + " = " + result);

        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = (num1.getRealPart() * num2.getRealPart())
                - (num1.getImaginaryPart() * num2.getImaginaryPart());
        double imaginaryPart = (num1.getRealPart() * num2.getImaginaryPart())
                + (num1.getImaginaryPart() * num2.getRealPart());
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);

        logger.info("Выполнена операция умножения комплексных чисел: " + num1 + " + " + num2 + " = " + result);

        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = Math.pow(num2.getRealPart(), 2) + Math.pow(num2.getImaginaryPart(), 2);
        double realPart = ((num1.getRealPart() * num2.getRealPart())
                + (num1.getImaginaryPart() * num2.getImaginaryPart())) / denominator;
        double imaginaryPart = ((num1.getImaginaryPart() * num2.getRealPart())
                - (num1.getRealPart() * num2.getImaginaryPart())) / denominator;
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);

        logger.info("Выполнена операция деления комплексных чисел: " + num1 + " + " + num2 + " = " + result);

        return result;
    }
}