public class PhoneNumber
{
  public static void main(String[] args)
  {
   int n1 = (int)(Math.random() * 8);
   int n2 = (int)(Math.random() * 8);
   int n3 = (int)(Math.random() * 8);
   int n4 = (int)(Math.random() * 7);
   int n5 = (int)(Math.random() * 4);
   int n6 = (int)(Math.random() * 2);
   int n7 = (int)(Math.random() * 10);
   int n8 = (int)(Math.random() * 10);
   int n9 = (int)(Math.random() * 10);
   int n10 = (int)(Math.random() * 10);
   
   System.out.print("\n" + n1 + n2 + n3 + "-" + n4 + n5 + n6 + "-" + n7 + n8 + n9 + n10);
  }
}