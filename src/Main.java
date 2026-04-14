import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Операции: +, -, *, /, ^, sqrt, sin, cos, log, log10");
        System.out.println("Для выхода: 'выход'");

        while (true) {
            System.out.print("\nВведите выражение: ");
            String input = scanner.nextLine();

            if (input.equals("выход")) {
                System.out.println("До свидания!");
                break;
            }

            try {
                String[] parts = input.split(" ");
                double result;
                String expression = input;

                 if (parts[0].equals("sin")) {
                     double num = Double.parseDouble(parts[1]);
                     result = calculator.sin(num);
                 }
                 else if (parts[0].equals("cos")) {
                     double num = Double.parseDouble(parts[1]);
                     result = calculator.cos(num);
                 }
                 else if (parts[0].equals("log")) {
                     double num = Double.parseDouble(parts[1]);
                     result = calculator.log(num);
                 }
                 else if (parts[0].equals("log10")) {
                     double num = Double.parseDouble(parts[1]);
                     result = calculator.log10(num);
                 }
                 else if (parts[0].equals("sqrt")) {
                     double num = Double.parseDouble(parts[1]);
                     result = calculator.sqrt(num);
                 }
                 else {
                     if (parts.length != 3) {
                         System.out.println("Ошибка: используйте 'число операция число через пробел'");
                         continue;
                     }

                     double a = Double.parseDouble(parts[0]);
                     String op = parts[1];
                     double b = Double.parseDouble(parts[2]);
                     result = calculator.calculate(op, a, b);
                 }

                System.out.println("Результат: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите числа правильно");
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        scanner.close();
    }
}