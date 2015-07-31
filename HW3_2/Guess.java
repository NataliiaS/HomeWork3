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

        System.out.println("Игра \"Угадай число\"");
        while (win == false)
        {

            System.out.println("Введите число от 1 до 100: ");

            int number = s.nextInt();
            numberOfTries++;

            if (a == number)
            {
                win = true;
            } else if ((Math.abs(a - number)) > 50)
            {

                if ((a - number) > 0)
                {
                    System.out.println("Загаданное число намного больше!");
                } else
                {
                    System.out.println("Загаданное число намного меньше!");
                }
            } else if ((Math.abs(a - number)) > 30)
            {
                if ((a - number) > 0)
                {
                    System.out.println("Загаданное число значительно больше!");
                } else
                {
                    System.out.println("Загаданное число значительно меньше!");
                }
            } else if ((Math.abs(a - number)) > 10)
            {
                if ((a - number) > 0)
                {
                    System.out.println("Загаданное число немного больше!");
                } else
                {
                    System.out.println("Загаданное число немного меньше!");
                }
            } else if ((Math.abs(a - number)) >= 1)
            {
                if ((a - number) > 0)
                {
                    System.out.println("Загаданное число совсем чуть-чуть больше!");
                } else
                {
                    System.out.println("Загаданное число совсем чуть-чуть меньше!");
                }
            }
        }
        System.out.println("Поздравляю! Вы угадали число!!!");
        System.out.println("Было загадано число: " + a);
        System.out.println("Количество попыток: " + numberOfTries);

    }

    public static void main(String[] args)
    {
        Guess g = new Guess();
        g.guess();
    }
}
