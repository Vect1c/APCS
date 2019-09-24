public class Stock
{
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    public Stock(String s, String n)
    {
       s = symbol;
       n = name; 
    }
  
    public void setPrevousClosingPrice(double x)
    {
        previousClosingPrice = x;
    }

    public void setCurrentPrice(double t)
    {
        currentPrice = t;
    }

    public double getChangePercent()
    {
        return 100 - (currentPrice / previousClosingPrice * 100);
    }
}

