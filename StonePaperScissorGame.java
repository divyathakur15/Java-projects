package internpe;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissorGame {
    public static void main(String[] args){
        System.out.println("Let's Play Stone Paper Scissor Game with Computer \n 0 for Rock \n 1 for Scissor \n 2 for Paper");
        //Variables
        int computerpoint = 0;
        int userpoint = 0;
        int k= 1;

        //Gameloop
        while (k<= 5) {
            //Taking input from user
            System.out.println("Enter your play");
            Scanner sc = new Scanner(System.in);
            int userplay = sc.nextInt();

            //Taking input from the computer and print
            Random r = new Random();
            int computerplay = r.nextInt(3);

            //Printing the inputs of the user and computer
            System.out.println("Your Play" + userplay);
            System.out.println("Computer Paly" + computerplay);

            //Conditions of the game
            if (userplay == computerplay) {
                System.out.println("It's a tie");
            }
            else if (userplay == 0 && computerplay == 1) {
                System.out.println("Yeahh! You won the round.");
                userpoint += 1;

            }
            else if (userplay == 1 && computerplay == 2) {
                System.out.println("Yeahh! You won the round.");
                userpoint += 1;

            }
            else if (userplay == 2 && computerplay == 0) {
                System.out.println("Yeahh! You won the round.");
                userpoint += 1;

            }
            else if (userplay == 0 && computerplay == 2) {
                System.out.println("Alas! You lost the round.");
                computerpoint += 1;

            }
            else if (userplay == 1 && computerplay == 0) {
                System.out.println("Alas! You lost the round.");
                computerpoint += 1;

            }
            else if (userplay == 2 && computerplay == 1) {
                System.out.println("Alas! You lost the round.");
                computerpoint += 1;

            }
            else {
                System.out.println("Enter a valid Number");
            }
                k++;
        }
        //CALCULATING THE POINTS AND DISPLAYING THE POINTS OF USER AND COMPUTER
        if (computerpoint < userpoint)
        {
            System.out.println("\n YOU WON THE GAME!");
        }
        else {
            System.out.println("\n COMPUTER WON THE GAME!");
        }
        //Printing the Results
        System.out.println("Your Points :" + userpoint);
        System.out.println("Computer Points :" + computerpoint);

    }
}
