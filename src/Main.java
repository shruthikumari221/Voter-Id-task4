import java.util.*;
import java.lang.*;
class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}
class Main
{
    public static void main(String[] a)
    {
        int age;
        Scanner in = new Scanner(System.in);
        try
        {
            System.out.println("Enter Age.");
            age=in.nextInt();
            if(age<18)
                throw new InvalidAgeException("You are not eligible to vote");
            else
                System.out.println("You are eligible to vote");
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Caught An Exception");
            System.out.println(e.getMessage());
        }
    }
}