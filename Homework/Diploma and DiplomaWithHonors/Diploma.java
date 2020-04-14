public class Diploma
{
    private String name, subject;
    public Diploma(String name, String subject)
    {
        this.name = name;
        this.subject = subject;
    }

    public String toString()
    {
        return "This certifies that " + name + "\nhas completed a course in " + subject;
    }
}