import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;

public class NumberConverting
{
    // binary input
    public static int binaryToDecimal(int input) 
    {
        int expo = 0;
        int decValue = 0;
        int binaryValue = input;

        while (binaryValue > 0)
        {
            decValue += (binaryValue % 2) * (Math.pow(2, expo));
            binaryValue = binaryValue / 10;
            expo++;
        }

        return decValue;
    }

    public static String binaryToHex(int input)
    {
        int expo = 0;
        int decValue = 0;
        int binaryValue = input;
        String hex = "";

        while (binaryValue > 0)
        {
            decValue += (binaryValue % 2) * (Math.pow(2, expo));
            binaryValue = binaryValue / 10;
            expo++;
        }

        while (decValue >= 1)
        {
            int remainder = decValue % 16;
            if (remainder == 10)
            {
                hex = "A" + hex;
                decValue = decValue / 16;
            }
            else if (remainder == 11)
            {
                hex = "B" + hex;
                decValue = decValue / 16;
            }
            else if (remainder == 12)
            {
                hex = "C" + hex;
                decValue = decValue / 16;
            }
            else if (remainder == 13)
            {
                hex = "D" + hex;
                decValue = decValue / 16;
            }
            else if (remainder == 14)
            {
                hex = "E" + hex;
                decValue = decValue / 16;
            }
            else if (remainder == 15)
            {
                hex = "F" + hex;
                decValue = decValue / 16;
            }
            else if (remainder < 10) 
            {
                hex = "" + remainder + hex;
                decValue = decValue / 16;
            }
        }

        return hex;
    }

    // decimal input

    public static String decToBin(int input)
    {
        int dec = input;
        String bin = "";

        while (dec >= 1)
        {
            int remainder = dec % 2;
            bin = "" + remainder + bin;
            dec = dec / 2;
        }

        return bin;
    }

    public static String decToHex(int input)
    {
        int dec = input;
        String hex = "";

        while (dec >= 1)
        {
            int remainder = dec % 16;
            if (remainder == 10)
            {
                hex = "A" + hex;
                dec = dec / 16;
            }
            else if (remainder == 11)
            {
                hex = "B" + hex;
                dec = dec / 16;
            }
            else if (remainder == 12)
            {
                hex = "C" + hex;
                dec = dec / 16;
            }
            else if (remainder == 13)
            {
                hex = "D" + hex;
                dec = dec / 16;
            }
            else if (remainder == 14)
            {
                hex = "E" + hex;
                dec = dec / 16;
            }
            else if (remainder == 15)
            {
                hex = "F" + hex;
                dec = dec / 16;
            }
            else if (remainder < 10) 
            {
                hex = "" + remainder + hex;
                dec = dec / 16;
            }
        }

        return hex;
    }

    // hexa input
    public static int hextoDec(String input)
    {
        int dec = 0;
        int exp = 0;
        int base = 0;

        while (exp < input.length())
        {
            if (Character.isDigit(input.charAt(exp)))
            {
                base = Integer.parseInt("" + input.charAt(exp));
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++;
            }
            else if (input.charAt(exp) == 'A')
            {
                base = 10;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'B')
            {
                base = 11;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'C')
            {
                base = 12;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'D')
            {
                base = 13;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'E')
            {
                base = 10;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'F')
            {
                base = 10;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
        }

        return dec;
    }

    public static String hexToBin(String input)
    {
        int dec = 0;
        int exp = 0;
        int base = 0;

        while (exp < input.length())
        {
            if (Character.isDigit(input.charAt(exp)))
            {
                base = Integer.parseInt("" + input.charAt(exp));
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++;
            }
            else if (input.charAt(exp) == 'A')
            {
                base = 10;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'B')
            {
                base = 11;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'C')
            {
                base = 12;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'D')
            {
                base = 13;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'E')
            {
                base = 10;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
            else if (input.charAt(exp) == 'F')
            {
                base = 10;
                dec += base * Math.pow(16, input.length() - exp - 1);
                exp++; 
            }
        }

        String bin = "";
        while (dec >= 1)
        {
            int remainder = dec % 2;
            bin = "" + remainder + bin;
            dec = dec / 2;
        }

        return bin;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your options are binary, decimal, hexadecimal. Type 1 for Binary, 2 for Decimal, or 3 for Hexadecimal.");
        int c = sc.nextInt();

        if (c == 1)
        {
            System.out.println("Input binary number: ");
            int input = sc.nextInt();

            System.out.println(input + " is " + binaryToDecimal(input) + " in binary.");
            System.out.println(input + " is " + binaryToHex(input) + " in hexadecimal.");
        }

        else if (c == 2)
        {
            System.out.println("Input decimal number: ");
            int input = sc.nextInt();

            System.out.println(input + " is " + decToBin(input) + " in binary.");
            System.out.println(input + " is " + decToHex(input) + " in hexadecimal.");
        }

        else if (c == 3)
        {
            System.out.println("Input a hexadecimal number: ");
            String input = sc.next();

            System.out.println(input + " is " + hextoDec(input) + " in decimal.");
            System.out.println(input + " is " + hexToBin(input) + " in binary.");
        }

        sc.close();
    }
}




