public class BookTest
{
  public static void main(String[] args)
  {
    Book theBestBook = new Book(3); // new 3-page book
    
    for (int j = 1; j <= 3; j++) // loop to run the println statment 3 times
    {
      System.out.println("The current page is: " + theBestBook.nextPage()); 
    }
  }
}