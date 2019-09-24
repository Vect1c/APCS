public class StockTest
{
    public static void main(String[] args)
    {
        Stock ORCL = new Stock("ORCL", "Oracle Corporation");
            ORCL.setPrevousClosingPrice(34.5);
            ORCL.setCurrentPrice(34.35);
            
            System.out.println("The percent change is: " + ORCL.getChangePercent());
    }
}