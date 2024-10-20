package NumberGussingGame;
//Import necessary libraries
import java.util.Random;     //for generating random numbers
import java.util.Scanner;   //for reading user input

//define main class
public class GuessTheNumber {
    //define constants for game settings
    private static final int min_range=1;          //minimum number range
    private static final int max_range=100;       //maximum number range
    private static final int max_attempts=10;    //maximum attempts per round
    private static final int max_rounds=2;      //total number of rounds

    //Main Method
    public static void main(String[] args) {
        Random rand= new Random();                 //initialize random number generator
        Scanner sc= new Scanner(System.in);       //initialize scanner for reading user input
        int totalScore=0;                        //initialize total score

        //Display Game Introduction
        System.out.println("!!NUMBER GUESSING GAME!! \n");
        System.out.println("Rules Of Game:-");
        System.out.println("Total Number Of Rounds: 5");
        System.out.println("Attempts to Guess number in each Round:10\n");

        //Loop through each round
        for(int i=1;i<=max_rounds;i++){
            int number=rand.nextInt(max_range)+min_range;        //generate random number for this round
            int attempts=0;                                     //initialize attempts for this round

            //Display round introduction
            System.out.println("Round "+i+": Guess the number between 1 and 100 in 10 attempts");

            //loop until attempts are exhausted or number is guessed
            while(attempts<max_attempts){
                System.out.println("Enter Your Guess:");         //prompt user for guess
                int guessNumber= sc.nextInt();                  //read user input
                attempts = attempts + 1;                       //increment attempts

                //Check if user guessed correctly
                if(guessNumber==number){
                    int score=max_attempts-attempts;          //calculate score for this round
                    totalScore=totalScore +score;            //update total score
                    //display success message
                    System.out.println("BINGO!!Number Guessed Successfully.Attempts="+attempts+".Round Score="+score+"\n");
                    break;           //break out of loop
                }
                //check if user guess is too low
                else if(guessNumber<number){
                    System.out.println("Number is greater than "+guessNumber+".Attempts Left="+(max_attempts-attempts));
                }
                //check if user guess is too high
                else if(guessNumber>number){
                    System.out.println("Number is less than "+guessNumber+".Attempts Left ="+(max_attempts-attempts));
                }
            }      //End while loop

            //check if attempts were exhausted
            if(attempts==max_attempts){
                //display failure message
                System.out.println("\nRound="+i);
                System.out.println("Attempts =0");
                System.out.println("Random Number is:"+number);
                System.out.println("Better luck next time!");
                System.out.println();
            }  //End if
        }     // End for loop

        //display game over message
        System.out.println("Game Over! Total Score ="+totalScore);
        sc.close();          //close scanner
    }    //End main method

}     //End GuessTheNumber class
