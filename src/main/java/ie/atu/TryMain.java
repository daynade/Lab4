package ie.atu;
import java.util.Scanner;

public class TryMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age;
        while(true) //Loops till there is no exception caught
        {
            System.out.print("Enter your age: ");
            String text = sc.nextLine().trim();
            try{
                age=Integer.parseInt(text); //changes the string into an int
                System.out.println("Thanks!\nYour age is " + age);
                break; //to exit loop
            }
            catch(NumberFormatException e) //Catches a string that can't be converted to numerical value
            {
                System.out.println("Invalid input " + e.getMessage());
            }
        }
    }
}
