public class Dog
{
    private String name;
    private double age;

    public Dog(String name, double age)
    {
        this.name = name;
        this.age = age;
    }

    public double convertToHumanAge(double age1)
    {
        age1 = age;

        if (age > 1)
        {
            age = ((age - 1) * 7) + 13;
        }
        else 
        {
            age = 13;
        }
        return age;
    }
}