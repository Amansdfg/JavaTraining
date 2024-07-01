import java.util.Random;
import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"write", "that", "programming", "java", "hangman", "word"};

        char playAgain;

        do {
            String word = words[random.nextInt(words.length)]; // Randomly select a word
            int misses = 0;
            boolean[] guessed = new boolean[word.length()];

            System.out.println("Welcome to Hangman!");
            char[] displayWord = new char[word.length()];

            for (int i = 0; i < displayWord.length; i++) {
                displayWord[i] = '*';
            }

            while (true) {
                System.out.print("(Guess) Enter a letter in word " + new String(displayWord) + " > ");
                char guess = scanner.next().charAt(0);
                boolean missed = true;

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess && !guessed[i]) {
                        displayWord[i] = guess;
                        guessed[i] = true;
                        missed = false;
                    }
                }

                if (missed) {
                    System.out.println(" " + guess + " is not in the word");
                    misses++;
                }

                if (new String(displayWord).equals(word)) {
                    System.out.println("The word is " + word + ". You missed " + misses + " time(s)");
                    break;
                }
            }

            System.out.print("Do you want to guess another word? Enter y or n > ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'y');
    }
}

