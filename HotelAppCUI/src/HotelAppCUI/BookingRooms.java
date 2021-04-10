/**
 * This is a description for BookingRooms class.
 * This class will find the first room selected in the list and set the room
 * to reserved. This class will also check if the room selected is full or not.
 */
package HotelAppCUI;

import static HotelAppCUI.HotelApp.ReservedRooms;
import static HotelAppCUI.HotelApp.roomlist;
import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class BookingRooms 
{
    public static boolean BookRooms(ArrayList<Room> roomDataBase, int input) 
    {
        RoomList roomlistSingle = new SinglesRooms();
        RoomList roomlistDouble = new DoublesRooms();
        RoomList roomlistQueen = new QueenRooms();
        RoomList roomlistKing = new KingRooms();

        switch (input) 
        {
            //Booking SinglesRooms
            case 1:
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and single room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomTypes.SINGLE)))
                    {
                        //Set the room to reserved
                        roomDataBase.get(i).setReserved(true);
                        //Adding the reserved rooms to an arraylist
                        ReservedRooms.add(roomDataBase.get(i));
                        return true;
                    }
                    //If all the rooms are booked in singeles
                    else if (roomDataBase.get(roomlistSingle.getRoomList().size() - 1).isReserved()) 
                    {
                        System.out.println("The singles rooms are full \nPlease choose another room");
                        return false;
                    }
                }
                break;
            //Booking DoublesRooms
            case 2:
                roomlist = new DoublesRooms();
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and double room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomTypes.DOUBLE))) 
                    {
                        roomDataBase.get(i).setReserved(true);
                        //Adding the reserved rooms to an arraylist
                        ReservedRooms.add(roomDataBase.get(i));
                        return true;
                    }
                    //If all the rooms are booked in doubles
                    else if (roomDataBase.get(roomlistSingle.getRoomList().size() + roomlistDouble.getRoomList().size() - 1).isReserved())
                    {
                        System.out.println("The Doubles rooms are full");
                        System.out.println("Please try again");
                        return false;
                    }
                }
                break;
            //Booking QueenRooms
            case 3:
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and queen room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomTypes.QUEEN)))
                    {
                        roomDataBase.get(i).setReserved(true);
                        //Adding the reserved rooms to an arraylist
                        ReservedRooms.add(roomDataBase.get(i));
                        return true;
                    } 
                    //If all the rooms are booked in queens
                    else if (roomDataBase.get(roomlistSingle.getRoomList().size() + roomlistDouble.getRoomList().size() + roomlistQueen.getRoomList().size() - 1).isReserved()) 
                    {
                        System.out.println("The Queen rooms are full");
                        System.out.println("Please try again");
                        return false;
                    }
                }
                break;
            //Booking KingRooms
            case 4:
                for (int i = 0; i < roomDataBase.size(); i++) 
                {
                    //Go through the room data base to check if the rooms are reserved and king room type
                    if (!(roomDataBase.get(i).isReserved()) && (roomDataBase.get(i).getRoomtype().equals(RoomTypes.KING)))
                    {
                        roomDataBase.get(i).setReserved(true);
                        //Adding the reserved rooms to an arraylist
                        ReservedRooms.add(roomDataBase.get(i));
                        return true;
                    } 
                    //If all the rooms are booked in kings
                    else if (roomDataBase.get(roomlistSingle.getRoomList().size() + roomlistDouble.getRoomList().size() + roomlistQueen.getRoomList().size() + roomlistKing.getRoomList().size() - 1).isReserved())
                    {
                        System.out.println("The Kings rooms are full");
                        System.out.println("Please try again");
                        return false;
                    }
                }
                break;
            case 5: 
                return true;
            //If they input other numbers
            default:
                return false;
        }
        return false;
    }
}