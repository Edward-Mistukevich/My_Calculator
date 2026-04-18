import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        List<String> history = new ArrayList<>();

        System.out.println("Операции: +, -, *, /, ^, sqrt, sin, cos, log, log10");
        System.out.println("Команды: 'история', 'очистить', 'выход'");

        while (true) {
            System.out.print("\nВведите выражение: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("выход")) {
                System.out.println("До свидания!");
                break;
            }

            if (input.equalsIgnoreCase("история")) {
                if (history.isEmpty()) {
                    System.out.println("История пуста.");
                } else {
                    System.out.println("\nИстория вычислений: ");
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            }

            if (input.equalsIgnoreCase("очистить")) {
                history.clear();
                System.out.println("История очищена.");
                continue;
            }

            try {
                String[] parts = input.split(" ");
                double result;
                String record;


                if (parts.length == 2 && (parts[0].equals("sqrt") || parts[0].equals("sin") ||
                        parts[0].equals("cos") || parts[0].equals("log") || parts[0].equals("log10"))) {
                    double num = Double.parseDouble(parts[1]);
                    result = calculator.calculateUnary(parts[0], num);
                    record = parts[0] + "(" + num + ") = " + result;
                }

                else if (parts.length == 3) {
                    double a = Double.parseDouble(parts[0]);
                    String op = parts[1];
                    double b = Double.parseDouble(parts[2]);
                    result = calculator.calculate(op, a, b);
                    record = a + " " + op + " " + b + " = " + result;
                } else {
                    System.out.println("Ошибка: используйте формат a + b или sin 30");
                    continue;
                }

                System.out.println("Результат: " + result);
                history.add(record);

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите числа правильно");
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        scanner.close();
    }
}