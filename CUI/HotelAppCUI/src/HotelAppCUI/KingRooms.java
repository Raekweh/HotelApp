/*
 * This is a description for KingRooms class.
 * This class will initialize the King rooms in the hotel and
 * storing it into an ArrayList.
 */
package HotelAppCUI;

import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class KingRooms extends RoomList 
{
    private ArrayList<Room> roomList;

    public KingRooms() 
    {
        initialiseRoom();
    }

    //initialising Rooms
    @Override
    protected ArrayList<Room> initialiseRoom()
    {
        roomList = new ArrayList<>();

        //Initiating King room types
        Room a400 = new Room(RoomTypes.KING, 400, RoomTypes.KING.getPrice(), false);
        Room b401 = new Room(RoomTypes.KING, 401, RoomTypes.KING.getPrice(), false);
        Room c402 = new Room(RoomTypes.KING, 402, RoomTypes.KING.getPrice(), false);
        Room d403 = new Room(RoomTypes.KING, 403, RoomTypes.KING.getPrice(), false);
        Room e404 = new Room(RoomTypes.KING, 404, RoomTypes.KING.getPrice(), false);
        Room f405 = new Room(RoomTypes.KING, 405, RoomTypes.KING.getPrice(), false);
        Room g406 = new Room(RoomTypes.KING, 406, RoomTypes.KING.getPrice(), false);
        Room h407 = new Room(RoomTypes.KING, 407, RoomTypes.KING.getPrice(), false);
        Room i408 = new Room(RoomTypes.KING, 408, RoomTypes.KING.getPrice(), false);
        Room j409 = new Room(RoomTypes.KING, 409, RoomTypes.KING.getPrice(), false);

        //Storing King room type into room list
        roomList.add(a400);
        roomList.add(b401);
        roomList.add(c402);
        roomList.add(d403);
        roomList.add(e404);
        roomList.add(f405);
        roomList.add(g406);
        roomList.add(h407);
        roomList.add(i408);
        roomList.add(j409);

        return roomList;
    }
}