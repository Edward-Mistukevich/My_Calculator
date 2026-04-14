public class Calculator {

    public double sum(double a, double b){
        return a + b;
    }

    public double diff(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divedi(double a, double b) throws Exception {
        if (a == 0) {
            throw new Exception("На ноль делить нельзя!");
        }
        return a / b;
    }

    public double power (double a, double b){
        return Math.pow(a, b);
    }

    public double sqrt(double a) throws Exception{
        if (a < 0) {
            throw new Exception("Крень из отриц. числа!");
        }
        return Math.sqrt(a);
    }

    public double sin(double a) {
        return Math.sin(Math.toRadians(a)); // в градусах
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
            case "+":
                return sum(a, b);
            case "-":
                return diff(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return divedi(a, b);
            case "^":
                return power(a, b);
            case "sin":
                return sin(a);
            case "cos":
                return cos(a);
            case "log":
                return log(a);
            case "log10":
                return log10(a);
            default:
                throw new Exception("Неизвестная операция: " + operation);
        }
    }
}
