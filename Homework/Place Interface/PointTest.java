import java.util.Scanner;

public class PointTest
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  int[] coords = new int[6];
  for (int j = 0; j < 6; j++)
  {
   int numX = 0;
   String yee = "";
   if (j % 2 == 0)
   {
    yee = "x";
    numX++;
   }
   else
   {
    yee = "y";
   }
   System.out.print("Enter " + yee + " coordinate");
   coords[j] = sc.nextInt();
  }
 
 Point p1 = new Point(coords[0], coords[1]);
 Point p2 = new Point(coords[2], coords[3]);
 Point p3 = new Point(coords[4], coords[5]);

 if (Point.sameDistance(p1, p2, p3))
 {
  System.out.print("Equidistant");
 }
 else 
 {
  System.out.print("Not Equidistant.");
 }
 }
}
