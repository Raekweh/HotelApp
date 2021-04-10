package HotelAppCUI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class HotelApp 
{
    public static Scanner scan;
    public static SimpleDateFormat formatter;
    public static ArrayList<Room> ReservedRooms = new ArrayList<Room>();
    public static ArrayList<Room> roomDataBase = new ArrayList<Room>();
    public static RoomList roomlist;

    //Welcome Sign
    public static void WelcomeSign() throws FileNotFoundException, IOException 
    {
        System.out.println("--------------------------------");
        String WelcomeSign = FileIO.ReadingWelcomeSign();
        System.out.println(WelcomeSign);
        System.out.println("--------------------------------");
        System.out.println("********************************");
        System.out.println();
    }

    //Getting the user's name
    public static String ValidName() 
    {
        scan = new Scanner(System.in);
        Boolean validFullName = false;
        String fullName = "";

        //Checking if the name is valid
        while (!validFullName) 
        {
            //Getting the user to input their Name
            try 
            {
                System.out.println("What is your Full Name: ");
                fullName = scan.nextLine();
                validFullName = Validation.FullNameValid(fullName);
            } 
            catch (Exception e) 
            {}
        }
        return fullName;
    }

    //Get the age of the user
    public static int ValidAge() 
    {
        scan = new Scanner(System.in);
        Boolean validAge = false;
        int age = 0;

        //Checking if the age is valid
        while (!validAge) 
        {
            age = 0;
            //Getting the user to input their Age
            try 
            {
                System.out.println("What is your Age (Must be above 18):");
                age = scan.nextInt();
                validAge = Validation.AgeValid(age);
            } 
            //Get the user to try inputting a valid age
            catch (Exception e) 
            {
                System.err.println("Invalid Input");
                ValidAge();
                break;
            }
        }
        return age;
    }

    //Appending the Guest Information
    public static void GuestInformation(String fullName, int age)
    {
        UserInfo UI = new UserInfo(fullName, age);
        FileIO.AppendingGuestInformation(UI);
    }

    //Displaying room types and the prices
    public static void RoomType() 
    {
        System.out.println("1." + RoomTypes.SINGLE + ", Price per Night: $" + RoomTypes.SINGLE.getPrice());
        System.out.println("2." + RoomTypes.DOUBLE + ", Price per Night: $" + RoomTypes.DOUBLE.getPrice());
        System.out.println("3." + RoomTypes.QUEEN + ", Price per Night: $" + RoomTypes.QUEEN.getPrice());
        System.out.println("4." + RoomTypes.KING + ", Price per Night: $" + RoomTypes.KING.getPrice());
        System.out.println("5. Quit");
    }

    //Getting Users Input
    public static int ChoosingRoomType()
    {
        int input;
        try {
            scan = new Scanner(System.in);
            input = scan.nextInt();
            switch (input) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
            }
        } 
        catch (Exception e)
        {
            System.err.println("Incorrect input please try again or Quit");
        }
        return 0;
    }

    //Setting my room database
    public static ArrayList<Room> gettingRoomList() {
        roomlist = new SinglesRooms();
        roomDataBase.addAll(roomlist.getRoomList());
        roomlist = new DoublesRooms();
        roomDataBase.addAll(roomlist.getRoomList());
        roomlist = new QueenRooms();
        roomDataBase.addAll(roomlist.getRoomList());
        roomlist = new KingRooms();
        roomDataBase.addAll(roomlist.getRoomList());

        return roomDataBase;
    }

    //Checking the check in date
    public static String CheckInDate() {
        scan = new Scanner(System.in);
        String CheckInDate = "";
        Boolean validDate = false;

        //While Loop to check if the check in date input from the user is valid
        while (!validDate) {
            //Ask the user for a check in date
            System.out.println("What date would you like to check in: (dd-MM-yyyy)");
            CheckInDate = scan.nextLine();
            //If the date if valid exit the while loop
            if (Validation.CheckInDateValid(CheckInDate)) {
                validDate = true;
            }
        }
        //Append the Dates to a file
        FileIO.AppendingCheckInDate(CheckInDate);
        return CheckInDate;
    }

    //Checking the check out date
    public static String CheckOutDate(String CheckInDate) {
        scan = new Scanner(System.in);
        String CheckOutDate = "";
        Boolean validDate = false;

        //While Loop to check if the check in date input from the user is valid
        while (!validDate) {
            //Ask the user for a check in date
            System.out.println("What date would you like to check out: (dd-MM-yyyy) ");
            CheckOutDate = scan.nextLine();
            //If the date if valid exit the while loop
            if (Validation.CheckOutDateValid(CheckInDate, CheckOutDate)) {
                validDate = true;
            }
        }
        //Append the Dates to a file
        FileIO.AppendingCheckOutDate(CheckOutDate);
        return CheckOutDate;
    }

    //Getting the input for making another booking
    public static int RepeatBookingInput() 
    {
        int Continue;
        Boolean ValidInput = true;
        do 
        {
            System.out.println("Would you like to continue? \n 1. Yes \n 2. No");
            Continue = scan.nextInt();
            switch (Continue) {
                case 1:
                    return Continue;
                case 2:
                    return Continue;
                default:
                    System.out.println("Please input a 1 or 2");
                    break;
            }
        } 
        while (ValidInput);
        return -1;
    }

    //Repeat or stop
    public static boolean RepeatBooking(int ReaptingBookingInput) {
        Boolean ValidInput = true;
        do {
            try {
                //Condition if they want to continue booking
                switch (ReaptingBookingInput) {
                    //Condition if they want to stop booking
                    case 1:
                        ValidInput = false;
                        return true;
                    //Invalid Input
                    case 2:
                        ValidInput = false;
                        System.out.println("Hope you enjoy your stay! \nStay safe from Covid19");
                        return false;
                    default:
                        System.out.println("Please Input 1 for Yes or 2 for No");
                        ValidInput = true;
                        break;
                }
            } catch (Exception e) {
                System.err.println("Invalid Input Please enter 1 for Yes or 2 for No");
                ValidInput = true;
            }
        } while (ValidInput);
        return false;
    }

    //Print out the reserved rooms and append
    public static void ReservedRooms() {
        FileIO.ApendingReservedRooms(ReservedRooms);
        FileIO.ReadingReservedRooms();
    }

    public static void main(String[] args) throws Exception 
    {
        String fullName, CheckInDate;
        int age = 0;
        int RoomTypeInput = 0, RepeatingBookingInput;
        boolean Continue = true;

        //Storing the room data base
        roomDataBase = gettingRoomList();

        do {
            boolean Full = false;
            try 
            {
                //Welcome sign
                WelcomeSign();

                //Gets the full Name of the Guest
                fullName = ValidName();

                //Gets the age of the Guest
                age = ValidAge();

                //Check if the rooms are full or not
                while (!Full) 
                {
                    //Display the roomTypes
                    RoomType();

                    //Get the roomType input
                    RoomTypeInput = ChoosingRoomType();

                    //Book the rooms base on the users input
                    Full = BookingRooms.BookRooms(roomDataBase, RoomTypeInput);

                    //The user wants to quit
                    if (RoomTypeInput == 5) 
                    {
                        Continue = false;
                    } 
                    //The user selected a room and the room isn't full
                    else if ((RoomTypeInput < 5 || RoomTypeInput > 0) && Full != false) 
                    {
                        //Get the check in date
                        CheckInDate = CheckInDate();

                        //Get the check out date
                        CheckOutDate(CheckInDate);

                        //Append the information
                        GuestInformation(fullName, age);

                        //Ask the user if they want to repeat and book another room
                        RepeatingBookingInput = RepeatBookingInput();

                        //Continue?
                        Continue = RepeatBooking(RepeatingBookingInput);
                    }
                }
            }
            catch (Exception e)
            {
                System.err.println("Invalid");
            }
        } while (Continue);

        //Display the information selected e.g. Room number, Date, User information
        System.out.println("--------------------------------");
        System.out.println("Reserved Rooms:");
        ReservedRooms();
        System.out.println("--------------------------------");
    }
}