import java.util.Scanner;

// TODO: Create class InvalidAgeException extends Exception
// Create a constructor that accepts a message string and passes it to super(message)

public class CustomException {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try
        {
            if(age < 18)
            {
                throw new Exception("Not eligible to vote");
            }
            else
            {
                System.out.println("Eligible to vote");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
        
}
