/**
 * This is a description for Validation class.
 * The Validation class checks if the inputs for Check in date, check out date,
 * full name and age are valid inputs
 */
package HotelAppCUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class Validation 
{
    private static DateTimeFormatter sdformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static LocalDate CheckInDate;
    private static LocalDate CheckOutDate;

    //Checks if the check in date is before the current date/time
    public static boolean CheckInDateValid(String CheckInDateInput) 
    {
        try 
        {
            CheckInDate = LocalDate.parse(CheckInDateInput, sdformat);
            //Checks if the check in date is after the current date
            if(CheckInDate.isAfter(LocalDate.now())) 
            {
                return true;
            } 
            else 
            {
                System.out.println(CheckInDate + " is an invalid check in date");
                return false;
            }
        } 
        catch (Exception e) 
        {
            System.err.println("Invalid Input please format the date in dd-Mm-yyyy or check your input");
            return false;
        }
    }

    //Checks if the check in date is before the check out date
    public static boolean CheckOutDateValid(String CheckInDateInput, String CheckOutDateInput) 
    {
        //Converting the String check in date and the check out date to local date
        CheckInDate = LocalDate.parse(CheckInDateInput, sdformat);
        CheckOutDate = LocalDate.parse(CheckOutDateInput, sdformat);

        try 
        {
            //Check if the check out date is after the check in date
            if (CheckInDate.compareTo(CheckOutDate) < 0) 
            {
                return true;
            } 
            else 
            {
                System.out.println(CheckOutDate + " is an invalid check out date");
                return false;
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid input please format the date in dd-MM-yyy or check your input");
            return false;
        }
    }
    
    //Check if the name is valid
    public static boolean FullNameValid(String FullName) 
    {
        try 
        {
            //Special Characters
            String specialCharacters = "!@#$%^&*()_+-=~`";
            boolean isStringContainsSpecialCharacter = false;

            //For loop to check if the character matches a special character            
            for (int i = 0; i < FullName.length(); i++)
            {
                char fullNameChar = FullName.charAt(i);
                for (int j = 0; j < specialCharacters.length(); j++)
                {
                    char specialCharacterChar = specialCharacters.charAt(j);
                    if (fullNameChar == specialCharacterChar)
                    {
                        isStringContainsSpecialCharacter = true;
                    }
                }
            }

            //Check if the name is valid        
            if (FullName == null || FullName.isEmpty() || isStringContainsSpecialCharacter)
            {
                System.out.println("Invalid Input: Please enter a full name which isnt empty or containing special characters");
            }
            else 
            {
                return true;
            }
        } 
        catch (Exception e) 
        {
            System.err.println("Invalid Input");
            return false;
        }
        return false;
    }
    
    //Check if the Age is valid
    public static boolean AgeValid(int Age)
    {
        try 
        {
            //Setting boundaries for the age
            if (Age < 18 || Age > 120)
            {
                System.out.println("You must be at least the age of 18 or check if input is correct");
            } 
            else 
            {
                return true;
            }
        }
        catch (Exception e)
        {
            System.err.println("Invalid Input");
        }
        return false;
    }
}