package ie.atu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles
{
    public static void main(String[] args)
    {
        showFile(); //Run the showFile method to read the file
    }

    static void showFile()
    {
        BufferedReader br = null; //Used to read the file line by line
        try
        {
            // Open the file "student.txt"
            FileReader neverUsed = new FileReader("student.txt");
            br = new BufferedReader(neverUsed);

            System.out.println("Contents of students.txt: ");
            String line;
            while ((line = br.readLine()) != null) //Reads each line until the end of the file
            {
                System.out.println(" - " + line); //Print the line
            }
        }
        catch (IOException ex) //If file can't be read
        {
            System.out.println("Could not read file: " + ex.getMessage());
        }
        finally
        {
            if(br != null)  //Close the file if it was opened
            {
                try
                {
                    br.close();
                }
                catch (IOException ex) //If file can't be closed
                {
                    System.out.println("Could not close file: " + ex.getMessage());
                }
            }
        }
    }
}