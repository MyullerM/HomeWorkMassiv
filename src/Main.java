import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] expenses = {10, 20, 30, 40, 50};
        int summ = 0;
        for (int i : expenses) {
            summ += i;
        }
        System.out.println("Cумма трат за месяц составила " + summ + " рублей");

        System.out.println("Задача 2");
        int maxExpenses = -1;
        int minExpenses = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] <= minExpenses) {
                minExpenses = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");

        System.out.println("Задача 3");
        double[] expensesTwo = {1, 2.52, 3, 4, 5};
        int totalDays = expensesTwo.length;
        double summTwo = 0;
        for (double i : expensesTwo) {
            summTwo += i;
        }
        double averageExpenses = summTwo / totalDays;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей ");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}