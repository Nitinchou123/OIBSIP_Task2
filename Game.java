import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(0, 100);
        int k;
        int guesscount;
        System.out.println();
        System.out.println("------------------------------NUMBER GUESSING GAME----------------------------");
        System.out.println();
        System.out.println("Enter the number of Chances you want to take to guess the number 'less than 5'");
        guesscount = sc.nextInt();
        if (guesscount > 5) {
            System.out.println("You can't enter number of chances more than 5. Please enter number less than 5");
            guesscount = sc.nextInt();
        }
        System.out.println();
        int score = 50;

        while (guesscount > 0) {
            System.out.println();
            System.out.println("GUESS COUNT LEFT:" + guesscount);
            System.out.println("Enter your guess: ");
            k = sc.nextInt();
            int value = Math.abs(n - k);
            if (k == n) {
                System.out.println("HURRAY......YOU WON THE GAME");
                System.out.println("You guessed the correct number: " + n);
                break;
            } else if (value < 5) {
                System.out.println("You have entered 'Very Close!' value: ");
                System.out.println("please try again..!");
                guesscount--;
                score = score - 10;
            }

            else if (value < 10) {
                System.out.println("You have entered 'Close!' value: ");
                System.out.println("please try again..!");
                guesscount--;
                score = score - 10;
            }

            else if (value < 20) {
                System.out.println("You have entered 'Far!' value: ");
                System.out.println("please try again..!");
                guesscount--;
                score = score - 10;
            }

            else if (value < 40) {
                System.out.println("You have entered ' Very Far!' value: ");
                System.out.println("please try again..!");
                guesscount--;
                score = score - 10;
            } else {
                System.out.println("You have entered 'Wrong!' value: ");
                System.out.println("Please try again..!");
                guesscount--;
                score = score - 10;
            }
        }
        if (guesscount == 0) {
            System.out.println();
            System.out.println("Better luck next time!");
            System.out.println("The correct guess is: " + n);
            System.out.println("Your Score is: " + score);
        }
    }
}
