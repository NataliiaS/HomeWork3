package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_1;



public class Phone
{
    public int id;
    public String surname;
    public String name;
    public String patronymic;
    public String address;
    public long ccn; //credit card number
    public float debit;
    public float credit;
    public double tcc; //time city calls

    public Phone(int id, String surname, String name, String patronymic, String address, long ccn, float debit, float credit, double tcc, double tldc)
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.ccn = ccn;
        this.debit = debit;
        this.credit = credit;
        this.tcc = tcc;
        this.tldc = tldc;
    }

    public int getId()
    {
        return id;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getName()
    {
        return name;
    }

    public String getPatronymic()
    {
        return patronymic;
    }

    public String getAddress()
    {
        return address;
    }

    public long getCcn()
    {
        return ccn;
    }

    public float getDebit()
    {
        return debit;
    }

    public float getCredit()
    {
        return credit;
    }

    public double getTcc()
    {
        return tcc;
    }

    public double getTldc()
    {
        return tldc;
    }

    public double tldc; //time long-distance calls


    @Override
    public String toString()
    {
        return "Id: " + getId() + " Surname:  " + getSurname() + " Name: " + getName() + " Patronymic: " + getPatronymic() + " Address: " + getAddress() + " Credit card number: " + getCcn() + " Debit: " + getDebit() + " Credit: " + " Time city calls: " + getTcc() + " Time long-distance calls: " + getTldc();
    }
}
