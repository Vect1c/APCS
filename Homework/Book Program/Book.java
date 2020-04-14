public class Book
{
  private int numPages;
  private int currentPage;
  
  public Book(int a)
  {
    numPages = a;
    currentPage = 1;
  }  
    public int getCurrentPage()
    {
      return currentPage;
    }
   
    public int getTotal()
    {
      return numPages;
    }
    
    public int nextPage() // goes to the next page
    {
      if (currentPage <  numPages)
      {
        currentPage++;
      }
      return currentPage;
    }
  
}