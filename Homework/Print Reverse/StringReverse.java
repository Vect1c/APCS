public class StringReverse
{
    private String str;

    public StringReverse(String str)
    {
        this.str = str;
    }

    public String reverse()
    {
        String reversed = "";
        for (int j = str.length() - 1; j >= 0; j--)
        {
            reversed += str.charAt(j);
        }

        return reversed;
    }
}