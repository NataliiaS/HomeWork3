package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_3;


public class Driver
{
    public String surname;
    public String name;
    public String patronymic;
    public String dl;//driver's license
    public boolean ready;//at the workplace

    Driver (String surname, String name, String patronymic, String dl, boolean ready){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dl = dl;
        this.ready = ready;
    }

    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getDl(){
        return dl;
    }
    @Override
    public String toString()
    {
        return "Driver: " + getSurname() + " " + getName() + " " + getPatronymic() + " " + "; driver's license: " + getDl();
    }
}
