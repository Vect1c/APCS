import java.util.Scanner;

public class DogTest
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the dog's name: ");
    String name = scan.nextLine();
    
    System.out.println("Enter the dog's age: ");
    double age = scan.nextDouble();
    
    Dog doge = new Dog(name, age);
    
    System.out.println("Your dog, " + name + ", is " + doge.convertToHumanAge(age) + " in human years!"); 
    
    scan.close();
  }
}