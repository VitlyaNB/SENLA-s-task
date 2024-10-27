import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "pineapple", "car", "university", "lesson"};
        Random random = new Random();
        String wordToGuess = words[random.nextInt(words.length)];
        char[] guessedLetters = new char[wordToGuess.length()];


        Scanner scanner = new Scanner(System.in);
        int lives = 5;
        while (lives > 0) {
            System.out.print("Загаданное слово: ");

            for (char letter : guessedLetters) {
                System.out.print(letter + " ");
            }

            System.out.println();
            System.out.print("Введите букву: ");

            char guess = scanner.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                lives = lives-1;
                System.out.println("Неправильная буква. Осталось жизней: " + lives);
            }

            String[] HangmanParts = {
                    "  _______    ",
                    "  |      |   ",
                    "  |      O   ",
                    "  |     /|\\  ",
                    "  |     / \\  ",
                    "  |          ",
                    "  |          ",
                    "__|__________"
            };
            if (lives == 0) {

                for (String part : HangmanParts) {
                    System.out.println(part);
                }
                System.out.println("Вы умерли");
                break;
            }

            if (String.valueOf(guessedLetters).equals(wordToGuess)) {
                System.out.println("Поздравляем, вы победили!");
                break;
            }


         int wrong = 6 - lives;
            for (int i = 0; i < wrong; i++) {
                    System.out.println(HangmanParts[i]);
            }
        }
    }
}