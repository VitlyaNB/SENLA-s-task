import java.util.Scanner;

public class SimpleCurrencyConverter {
    public static void main(String[] args) {

        String[] currencies = {"Доллар", "Евро", "Белорусский рубль", "Фунт Стерлинга", "Песо"};

        double[] rates = {1.0, 0.92, 3.3, 0.77, 0.05};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер исходной валюты:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        int fromIndex = scanner.nextInt() - 1;

        System.out.println("Выберите номер целевой валюты:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        int toIndex = scanner.nextInt() - 1;

        System.out.print("Введите сумму: ");
        double sum = scanner.nextDouble();

        double result = sum * (rates[toIndex] / rates[fromIndex]);
        System.out.println(sum + " " + currencies[fromIndex] + " = " + result + " " + currencies[toIndex]);
    }
}