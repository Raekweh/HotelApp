/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.JOptionPane;

/**
 *
 * @author Raymond Li
 */
public class Model extends Observable 
{
    public Database db;
    private DateTimeFormatter sdformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private LocalDate CheckInDate;
    private LocalDate CheckOutDate;
    public RoomType roomtype;
    public Room room;
    public RoomList roomlist;
    public ArrayList<Room> list;
    public static ArrayList<Room> ReservedRooms; //Idk if i need this

    public Model()
    {
        roomlist = new RoomList();
        list = roomlist.List();
        ReservedRooms = new ArrayList<>();
        this.db = new Database();
        this.db.GIdbsetup(); //Setting up the Guest information list
    }

    //Checking if the name is valid
    public boolean validName(String fullname) 
    {
        String specialCharacters = "!@#$%^&*()_+-=~";
        boolean isStringContainsSpecialCharacter = false;

        //Loop iterating through the name characters
        for (int i = 0; i < fullname.length(); i++)
        {
            char fullNameChar = fullname.charAt(i);
            //Loop iterating through the special characters
            for (int j = 0; j < specialCharacters.length(); j++) 
            {
                //Comparing the name characters and the special character
                char specialCharacterChar = specialCharacters.charAt(j);
                if (fullNameChar == specialCharacterChar)
                {
                    isStringContainsSpecialCharacter = true;
                }
            }
        }

        //Checks if the string contains the special character or if its empty
        if (fullname == null || fullname.isEmpty() || isStringContainsSpecialCharacter) 
        {
            JOptionPane.showMessageDialog(null, "Error: Please enter a name or a name excluding (!@#$%^&*()_+-=~`)");
            return false;
        } 
        else
        {
            return true;
        }
    }

    //Checking if the age is valid
    public boolean validAge(int age) 
    {
        //Checks if the age is above 18
        if (age < 19) 
        {
            JOptionPane.showMessageDialog(null, "Error: Please enter an age above 18");
            return false;
        }
        //Checks if the age is above the limit 120
        else if (age > 120) 
        {
            JOptionPane.showMessageDialog(null, "Error: Please enter an age between 19 to 120");
            return false;
        } 
        else 
        {
            return true;
        }
    }

    //Check if the email is valid
    public boolean validEmailAddress(String emailAddress) 
    {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        //Correct format
        if (emailAddress.matches(regex)) 
        {
            return true;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Error: Please enter a valid email");
            return false;
        }
    }

    //Check if all the details are valid
    public boolean validGuestInfo(String fullname, int age, String emailAddress) 
    {
        try 
        {
            if (validName(fullname) && validAge(age) && validEmailAddress(emailAddress)) 
            {
                //Inserting the details into the GI database
                db.DBGuestInfo(fullname, age, emailAddress);
                //Setting up the Reserved room list
                this.db.RRLdbsetup();
                return true;
            }
        }
        catch (Exception e) {}
        return false;
    }

    //Booking rooms
    public boolean BookRooms(ArrayList<Room> roomDataBase, int input) 
    {
        switch (input) 
        {
            //Booking Single Rooms
            case 1:
                //Iterating through all the room
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and single room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomType.SINGLE))) 
                    {
                        roomDataBase.get(i).setReserved(true);

                        //Adding into the arrayList
                        ReservedRooms.add(roomDataBase.get(i));

                        //Inserting the details into the RRL database
                        this.db.DBReservedRoomList(roomDataBase.get(i));
                        return true;
                    }
                    //If all the rooms are booked in singles
                    else if (roomDataBase.get(9).isReserved()) 
                    {
                        System.out.println("The singles rooms are full");
                        return false;
                    }
                }
                break;
            //Booking Double Rooms
            case 2:
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and double room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomType.DOUBLE))) 
                    {
                        roomDataBase.get(i).setReserved(true);

                        //Adding into the arrayList
                        ReservedRooms.add(roomDataBase.get(i));

                        //Inserting the details into the RRL database
                        this.db.DBReservedRoomList(roomDataBase.get(i));
                        return true;
                    }
                    //If all the rooms are booked in doubles
                    else if (roomDataBase.get(19).isReserved()) 
                    {
                        System.out.println("The doubles rooms are full");
                        return false;
                    }
                }
                break;
            //Booking Queen Rooms
            case 3:
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and queen room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomType.QUEEN)))
                    {
                        roomDataBase.get(i).setReserved(true);

                        //Adding into the arrayList
                        ReservedRooms.add(roomDataBase.get(i));

                        //Inserting the details into the RRL database
                        this.db.DBReservedRoomList(roomDataBase.get(i));
                        return true;
                    } 
                    //If all the rooms are booked in queens
                    else if (roomDataBase.get(29).isReserved()) 
                    {
                        System.out.println("The queens rooms are full");
                        return false;
                    }
                }
                break;
            //Booking King Rooms
            case 4:
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and king room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomType.KING)))
                    {
                        roomDataBase.get(i).setReserved(true);

                        //Adding into the arrayList
                        ReservedRooms.add(roomDataBase.get(i));

                        //Inserting the details into the RRL database
                        this.db.DBReservedRoomList(roomDataBase.get(i));
                        return true;
                    }
                    //If all the rooms are booked in kings
                    else if (roomDataBase.get(39).isReserved()) 
                    {
                        System.out.println("The kings rooms are full");
                        return false;
                    }
                }
                break;
            //If they input other numbers
            default:
                return false;
        }
        return false;
    }

    //Check if the check in date is valid
    public boolean validCheckInDate(String CheckInDateInput) 
    {
        try
        {
            CheckInDate = LocalDate.parse(CheckInDateInput, sdformat);
            //Checks if the check in date is after the current date
            if (CheckInDate.isAfter(LocalDate.now()))
            {
                return true;
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Error: Please enter a check in date before " + LocalDate.now());
                return false;
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error: Please enter a valid check in date");
            return false;
        }
    }

    //Check if the check out data is valid
    public boolean validCheckOutDate(String CheckInDateInput, String CheckOutDateInput)
    {
        try 
        {
            //Converting the String check in date and the check out date to local date
            CheckInDate = LocalDate.parse(CheckInDateInput, sdformat);
            CheckOutDate = LocalDate.parse(CheckOutDateInput, sdformat);

            //Check if the check out date is after the check in date
            if (CheckInDate.compareTo(CheckOutDate) < 0)
            {
                return true;
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Error: Please enter a check out date after " + CheckInDateInput);
                return false;
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error: Please enter a valid check in date");
            return false;
        }
    }

    //String of Reserved Rooms
    public static String BookRoomSring() 
    {
        String ReservedRoomString = "";
        for (Room rr : ReservedRooms) 
        {
            ReservedRoomString += rr + "\n";
            System.out.println(rr);
        }
        return ReservedRoomString;
    }
}