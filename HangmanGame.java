import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HangmanGame {
    private static int tries = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] category = {"sports"};
        String[] sports = {"football", "volleyball", "basketball", "cricket","handball"};


        System.out.println("available categories:");

        for (String element : category) {

            System.out.println(element);
        }
        System.out.println("select  a category:");
        String userChoice = scanner.nextLine();

        if (userChoice.equals("sports")) {
            int randomNumber = random.nextInt(10); //random.nextInt(10);
            char[] randomWordToGuess = sports[randomNumber].toCharArray(); // java -> j,a,v,a


            int ammountOfGuesses = randomWordToGuess.length; //total tries to guess a word.
            char[] playerGuess = new char[ammountOfGuesses]; // "_ _ _ _ _ _ _ _"

            // Assign empty dashes at start "_ _ _ _ _ _ _ _"
            Arrays.fill(playerGuess, '_');



                boolean wordIsGuessed = false;


            boolean weArePlaying = true;
            while (weArePlaying  ) {
                System.out.println("Lets Start Playing Hangman ver 0.1");


                while (!wordIsGuessed && tries != ammountOfGuesses) {
                    System.out.println("Current Guesses: ");
                    print(playerGuess);
                    System.out.printf("You have %d amount of tries left.\n", ammountOfGuesses - tries);
                    System.out.println("Enter a single character: ");
                    char input = scanner.nextLine().charAt(0);
                    tries++;
                    hangmanImage();

                    if (input == '-') {
                        wordIsGuessed = true;
                        weArePlaying = false;
                    } else {
                        for (int i = 0; i < randomWordToGuess.length; i++) {
                            if (randomWordToGuess[i] == input) {
                                playerGuess[i] = input;
                            }
                        }

                        if (isTheWordGuessed(playerGuess)) {
                            wordIsGuessed = true;
                            System.out.println("Congratulations");
                        }
                    }
                } /* End of wordIsGuessed */
                if (!wordIsGuessed) {
                    System.out.println("You ran out of guesses.");
                }

                System.out.println("Would you like to play again? (yes/no) ");
                String choice = scanner.nextLine();
                if (choice.equals("no")) {
                    weArePlaying = false;
                }

            }/*End of We Are Playing*/

            System.out.println("Game Over!");
        }
    }
        public static void print ( char array[]){
            for (int i = 0; i < array.length; i++) { // Assign empty dashes at start "_ _ _ _ _ _ _ _"
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        public static boolean isTheWordGuessed ( char[] array){
            boolean condition = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '_') {
                    condition = false;
                }
            }
            return condition;

        }
    public static void hangmanImage() {
        if (tries == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (tries == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (tries == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (tries == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (tries == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (tries == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (tries == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");

        }
    }

}
