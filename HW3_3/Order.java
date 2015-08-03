package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_3;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Order
{
    Car car1 = new Car("GAZ-3302", 1500, "AX3254KO", false);
    Car car2 = new Car("Mercedes-Benz Vito", 1100, "AX0254MC", false);
    Car car3 = new Car("ZIL-5301", 5000, "AX8475BA", false);
    Car car4 = new Car("Mercedes-2535", 10000, "AX7997TP", false);
    Car car5 = new Car("SCANIA P-340", 20000, "AX4892MC", false);

    Car[] cars = {car1, car2, car3, car4, car5};

    Driver d1 = new Driver("Иванов", "Петр", "Емельянович", "ВУА000253", false);
    Driver d2 = new Driver("Матросов", "Сергей", "Анатольевич", "ВУА000387", false);
    Driver d3 = new Driver("Бычок", "Виктор", "Владимирович", "ВУА000478", false);
    Driver d4 = new Driver("Антонов", "Олег", "Игоревич", "ВУА000987", false);
    Driver d5 = new Driver("Ерохин", "Андрей", "Федорович", "ВУА000147", false);
    Driver d6 = new Driver("Якименко", "Александр", "Сергеевич", "ВУА000424", false);
    Driver d7 = new Driver("Гончаров", "Александр", "Владимирович", "ВУА000074", false);
    Driver d8 = new Driver("Гончаров", "Владимир", "Александрович", "ВУА000876", false);
    Driver d9 = new Driver("Миргородский", "Сергей", "Григорьевич", "ВУА001478", false);
    Driver d10 = new Driver("Охрименко", "Степан", "Борисович", "ВУА000654", false);

    Dispatcher disp = new Dispatcher();

    Order (){disp.takeAnOrder(); bang(); makeAnOrder();}

    public int number;
    public boolean bang1;

    public void bang()//who is working today
    {

        LocalDate start1 = LocalDate.of(2015, Month.AUGUST, 1);
        LocalDate[] workday = new LocalDate[183];
        LocalDate today = LocalDate.now();
        int counter = 0;
        for (int i = 0; i < workday.length; i++)
        {
            counter += 2;
            workday[i] = start1.plus(counter, ChronoUnit.DAYS);
            if (today == workday[i])
            {
                bang1 = true;
            }

        }
    }

    public void makeAnOrder()// choose car and driver
    {
           if (disp.weight < car2.capacity)
            {
                System.out.println(car2);
                if (bang1 = true)
                {
                    d3.ready = true;
                    System.out.println(d3);
                } else
                {
                    d4.ready = true;
                    System.out.println(d4);
                }
            } else if (disp.weight >= car2.capacity && disp.weight < car1.capacity)
            {
                System.out.println(car1);
                if (bang1 = true)
                {
                    d1.ready = true;
                    System.out.println(d1);
                } else
                {
                    d2.ready = true;
                    System.out.println(d2);
                }
            } else if (disp.weight >= car1.capacity && disp.weight < car3.capacity)
            {
                System.out.println(car3);
                if (bang1 = true)
                {
                    d5.ready = true;
                    System.out.println(d5);
                } else
                {
                    d6.ready = true;
                    System.out.println(d6);
                }
            } else if (disp.weight >= car3.capacity && disp.weight < car4.capacity)
            {
                System.out.println(car4);
                if (bang1 = true)
                {
                    d7.ready = true;
                    System.out.println(d7);
                } else
                {
                    d8.ready = true;
                    System.out.println(d8);
                }
            } else if (disp.weight >= car4.capacity && disp.weight < car5.capacity)
            {
                System.out.println(car5);
                if (bang1 = true)
                {
                    d9.ready = true;
                    System.out.println(d9);
                } else
                {
                    d10.ready = true;
                    System.out.println(d10);
                }
            }
        }

    public void needRepair(){
        for (int i = 0; i<cars.length; i++){
            cars[i].needRepair = true;
        }
    }
}
