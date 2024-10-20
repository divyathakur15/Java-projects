package internpe;
import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String play="yes";

        //while loop to determine if we are going to play the game again
        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            System.out.println("!!NUMBER GUESSING GAME!! \n");
            //while loop to check if the game is over
            while(guess!=randNum)
            {
                System.out.print("Guess a number between 1 and 100:");
                System.out.println();
                guess=reader.nextInt();
                tries++;

                if(guess==randNum)
                {
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("IT only took you "+tries+ " guesses!\n");
                    System.out.println("Would you like to play again? Yes or no:");
                    play=reader.next().toLowerCase();
                }
                else if(guess > randNum){
                    System.out.println("YOur guess is too high, try again.\n");
                }
                else {
                    System.out.println("Your guess is too low, try again.\n");
                }
            }
        }
        reader.close();
    }
}
