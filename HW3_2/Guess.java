package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_2;

import java.util.Scanner;

public class Guess
{
    int a = (int)(Math.random()*101+1);
    Scanner s = new Scanner(System.in);
    int numberOfTries;
    boolean win = false;

    public void guess()
    {
            System.out.println("Game \"Guess a number\"");
            System.out.println("Enter the number from 1 to 100: ");
            while (win == false)
            {
                int number = s.nextInt();
                numberOfTries++;

                if (a == number)
                {
                    win = true;
                } else
                {
                    if (a < number)
                    {
                        System.out.println("Too high. Guess again.");
                    } else
                    {
                        System.out.println("Too low. Guess again.");
                    }
                }
            }
            System.out.println("Congratulations! You guessed the number!!!");
            System.out.println("Unknown number was: " + a);
            System.out.println("The number of attempts: " + numberOfTries);
        }

    public static void main(String[] args)
    {
        Guess g = new Guess();
        g.guess();
    }
}
