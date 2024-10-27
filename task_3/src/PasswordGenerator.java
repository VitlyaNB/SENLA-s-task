import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите желаемую длину пароля (от 8 до 12 символов): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            System.out.println("Длина пароля должна быть от 8 до 12 символов.");
            return;
        }
        String SmallLetters = "abcdefghijklmnopqrstufwxyz";
        String BigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Numbers = "0123456789";
        String SpecialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        String AllChars = BigLetters + SmallLetters + Numbers + SpecialChars;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(AllChars.length());
            password.append(AllChars.charAt(randomIndex));
        }

        System.out.println("Сгенерированный пароль: " + password.toString());
    }
}