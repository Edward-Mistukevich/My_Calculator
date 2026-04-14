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
            default:
                throw new Exception("Неизвестная операция: " + operation);
        }
    }

}
