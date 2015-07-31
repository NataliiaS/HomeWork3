package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_1;

import java.util.Comparator;


public class SortedBySurname implements Comparator<Phone>
{
    @Override
    public int compare(Phone o1, Phone o2)
    {
        String str1 = o1.getSurname();
        String str2 = o2.getSurname();
        return str1.compareTo(str2);
    }
}
