package OOPTest.View;

import OOPTest.Model.ComplexNumber;

public class ConsoleView {
    public static ComplexNumber readComplexNumber() {
        System.out.print("Введите действительную часть: ");
        double realPart = Double.parseDouble(System.console().readLine());
        System.out.print("Введите мнимую часть: ");
        double imaginaryPart = Double.parseDouble(System.console().readLine());
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static String readOperator() {
        System.out.print("Введите оператор (+, -, *, /): ");
        return System.console().readLine().trim();
    }

    public static void displayResult(ComplexNumber result) {
        System.out.println("Результат: " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
    }
}