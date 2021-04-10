/**
 * THis is a description for RoomList class.
 * This class is an abstract class which has functionality of storing different types of rooms
 * which contains rooms from SingleRoom, DoubleRoom, QueenRooms and KingRoom class.
 */
package HotelAppCUI;

import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public abstract class RoomList 
{
    //Initialising the rooms of the hotel
    abstract protected ArrayList<Room> initialiseRoom();

    private ArrayList<Room> roomList = initialiseRoom();

    @Override
    public String toString()
    {
        String s = "";
        for (Room r : roomList) 
        {
            s += r;
            s += "\n";
        }
        System.out.println(s);
        return s;
    }

    public ArrayList<Room> getRoomList() 
    {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) 
    {
        this.roomList = roomList;
    }
}