package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_1;

import java.util.Arrays;
import java.util.Comparator;

public class Phones
{
    Phone p1 = new Phone(451, "Бендер", "Остап", "Ибрагимович", "ул. Комбинаторская, 34", 1566651354, 120.57f, 50.60f, 120.58, 65.25);
    Phone p2 = new Phone(120, "Паниковский", "Михаил", "Самуэльевич", "ул. Курьерская, 67", 58764585, 120.57f, 50.60f, 60.24, 0.0);
    Phone p3 = new Phone(231, "Козлевич", "Адам", "Казимирович", "ул. Антилопская, 81", 58764585, 120.57f, 50.60f, 37.54, 0.0);
    Phone p4 = new Phone(654, "Корейко", "Александр", "Иванович", "ул. Золотоносная, 22", 58764585, 120.57f, 50.60f, 28.31, 53.23);
    Phone p5 = new Phone(852, "Воробьянинов", "Ипполит", "Матвеевич", "ул. Петухова, 56", 982887, 120.57f, 50.60f, 65.02, 20.47);
    Phone phone[] = {p1, p2, p3, p4, p5};

    Phones()
    {
        localCalls();
        cityCalls();
        sort();
    }

    private void localCalls()
    {
        System.out.println("Callers which time local calls are more than an hour:");
        for (int i = 0; i < phone.length; i++)
        {
            if (phone[i].tcc > 60)
            {
                System.out.println(phone[i]);
            }
        }
    }


    private void cityCalls()
    {
        System.out.println();
        System.out.println("Callers which have long-distance calls:");
        for (int i = 0; i < phone.length; i++)
        {
            if (phone[i].tldc > 0)
            {
                System.out.println(phone[i]);
            }
        }
    }

    public void sort()
    {
        System.out.println();
        System.out.println("Callers in alphabetical order:");
        Arrays.sort(phone, new SortedBySurname());
        for (Phone i : phone)
        {
            System.out.println(i);
        }
    }

}



