package sourseit.HomeWork.Sydorenko.HomeWork3.HW3_3;


public class Car
{
    public String brand;
    public int capacity;
    public String reg; //license plate
    public boolean needRepair;

    Car (String brand, int capacity, String reg, boolean needRepair){
        this.brand = brand;
        this.capacity = capacity;
        this.reg = reg;
        this.needRepair = needRepair;
    }
    public String getBrand(){
        return brand;
    }
    public int getCapacity(){
        return capacity;
    }
    public String getReg(){
        return reg;
    }

    @Override
    public String toString()
    {
        return "Car: " + getBrand() + ", Car capacity: " + getCapacity() + "kg" + ", License plate: " + getReg();
    }

}
