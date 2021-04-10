/**
 * This is a description for FileIO class.
 * The class will read files and append to files
 */
package HotelAppCUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class FileIO 
{
    public static File CheckInDatefile, CheckOutDatefile, UserInfomationFile, ReservedRoomFile;
    public static FileWriter fr;
    
    //Reading the welcome sign
    public static String ReadingWelcomeSign() throws FileNotFoundException, IOException 
    {
        String WelcomeSign = "";
        try 
        {
            BufferedReader in;
            in = new BufferedReader(new FileReader("WelcomeSign.txt"));
            WelcomeSign = in.readLine();
        } 
        catch (Exception e) 
        {}
        return WelcomeSign;
    }
    
    //Appending the check in date    
    public static void AppendingCheckInDate(String CheckInDate) 
    {
        try 
        {
            CheckInDatefile = new File("CheckInDate.txt");
            fr = new FileWriter(CheckInDatefile, true);
            fr.write(CheckInDate + "\n");
            fr.close();
        }
        catch (Exception e) 
        {}   
    }
    
    //Appending the Check out date
    public static void AppendingCheckOutDate(String CheckOutDate)
    {
        try 
        {
            CheckOutDatefile = new File("CheckOutDate.txt");
            fr = new FileWriter(CheckOutDatefile, true);
            fr.write(CheckOutDate + "\n");
            fr.close();
        }
        catch (Exception e) 
        {}
    }
    
    //Apending the Guest Information
    public static void AppendingGuestInformation(UserInfo UI)
    {
        try 
        {
            UserInfomationFile = new File("UserInformation.txt");
            fr = new FileWriter(UserInfomationFile, true);
            fr.write(UI + "\n");
            fr.close();
        } 
        catch (Exception e)
        {}
    }
    
    //Appending the Reserved Rooms
    public static void ApendingReservedRooms(ArrayList<Room> ReservedRooms)
    {
        try 
        {
            ReservedRoomFile = new File("ReservedRooms.txt");
            fr = new FileWriter(ReservedRoomFile, true);
            for (Room rr : ReservedRooms) 
            {
                fr.write(rr.toString() + "\n");
            }
            fr.close();
        }
        catch(Exception e)
        {}
    }
    
    //Fix this bullshit later
    public static void ReadingReservedRooms() 
    {
        String ReservedRooms = "";
        try 
        {
            BufferedReader in;
            in = new BufferedReader(new FileReader("ReservedRooms.txt"));
            while ((ReservedRooms = in.readLine()) != null) 
            {
                String[] Details = ReservedRooms.split(",");
                //Read the room type, room number and room price
                System.out.println(Details[0] + "," + Details[1] + "," + Details[2]);
            }
        }
        catch(Exception e)
        {}
    }
}