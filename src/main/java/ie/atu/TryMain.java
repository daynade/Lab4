package ie.atu;
import java.util.Scanner;

public class TryMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        String text = sc.nextLine().trim();
        try{
            age=Integer.parseInt(text);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input" + e.getMessage());
        }
    }


}
