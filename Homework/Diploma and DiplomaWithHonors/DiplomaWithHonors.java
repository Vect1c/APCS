public class DiplomaWithHonors extends Diploma
{
    public DiplomaWithHonors(String name, String subject)
    {
        super(name, subject);
    }

    public String toString()
    {
        return super.toString() + "\n*** with honors ***";
        
    }
}