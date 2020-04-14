public class Triangle
{
    private double x1, y1, x2, y2, x3, y3;

    /* triangle class contructor: takes the 3 coordinates of a triangle which each point put into a pair */
    public Triangle(double xCoord1, double yCoord1, double xCoord2, double yCoord2, double xCoord3, double yCoord3) 
    {

        x1 = xCoord1;
        y1 = yCoord1;

        x2 = xCoord2;
        y2 = yCoord2;

        x3 = xCoord3;
        y3 = yCoord3;


    }


    public double getPerimeter()
    {
        double distance1, distance2, distance3;

        distance1 = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        distance2 = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
        distance3 = Math.sqrt(Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2));
        
        return distance1 + distance2 + distance3;
    }

    public double getArea()
    {
        double distance1, distance2, distance3, s;
        
        distance1 = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        distance2 = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2));
        distance3 = Math.sqrt(Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2));

        s = (distance1 + distance2 + distance3) / 2;

        Math.sqrt(s * (s - distance1) * (s - distance2) * (s-distance3));

        return Math.sqrt(s * (s - distance1) * (s - distance2) * (s-distance3));
    }

/*
    I'm commenting this out due to realizing fact that I don't need 3 different methods calculating the
    distances between points for this.


    public double getDistance1()
    {
        return sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)) 
    }
    
    public double getDistance2()
    {
        return sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2))
    }

    public double getDistance3()
    {
        return sqrt(Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2))
    }

*/
}
