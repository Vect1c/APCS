public class Line
{
    private Point point1, point2;

    public Line(Point point1, Point point2)
    {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getLineSlope()
    {
        return this.point1.getSlope(this.point2);
    }

    public boolean isIntersect(Line OtherL)
    {
        if (this.getLineSlope() != OtherL.getLineSlope())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}