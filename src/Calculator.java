public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double diff(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws Exception {
        if (b == 0) {  // исправлено: делить на ноль нельзя, если b == 0
            throw new Exception("На ноль делить нельзя!");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) throws Exception {
        if (a < 0) {
            throw new Exception("Корень из отрицательного числа!");
        }
        return Math.sqrt(a);
    }

    public double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public double log(double a) throws Exception {
        if (a <= 0) throw new Exception("Логарифм только от положительных чисел!");
        return Math.log(a);
    }

    public double log10(double a) throws Exception {
        if (a <= 0) throw new Exception("Логарифм только от положительных чисел!");
        return Math.log10(a);
    }


    public double calculate(String operation, double a, double b) throws Exception {
        switch (operation) {
            case "+": return sum(a, b);
            case "-": return diff(a, b);
            case "*": return multiply(a, b);
            case "/": return divide(a, b);
            case "^": return power(a, b);
            default: throw new Exception("Неизвестная бинарная операция: " + operation);
        }
    }


    public double calculateUnary(String operation, double a) throws Exception {
        switch (operation) {
            case "sqrt": return sqrt(a);
            case "sin": return sin(a);
            case "cos": return cos(a);
            case "log": return log(a);
            case "log10": return log10(a);
            default: throw new Exception("Неизвестная унарная операция: " + operation);
        }
    }
}