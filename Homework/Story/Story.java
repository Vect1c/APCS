import java.util.Scanner;

public class Story implements LinkableText
{
    private String text;
    private LinkableText next;

    public Story(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public void setNext(LinkableText next)
    {
        this.next = next;
    }
}

class StoryClient
{
    public static void main(String[] args) 
    {
        LinkableText one = new Story("Helloooo");
        LinkableText two = new Story("Wooooorld.");
        one.setNext(two);

        System.out.print("Story: " + one.getText() + " " + two.getText());
    }
}