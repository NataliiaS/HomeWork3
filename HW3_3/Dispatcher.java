package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_3;

import java.util.Scanner;

public class Dispatcher
{
    public String title;
    public int weight;
    public double distance;
    int number = 0;

    public void takeAnOrder(){

        number++;
        System.out.println("Заказ номер " + number);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите наименование груза: ");
        title = sc.nextLine();
        System.out.println("Введите вес груза: ");
        weight = sc.nextInt();
        System.out.println("Введите расстояние в км.: ");
        distance = sc.nextDouble();

    }

}
