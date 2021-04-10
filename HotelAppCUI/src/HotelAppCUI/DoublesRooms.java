/**
 * This is a description for DoublesRooms class.
 * This class will initialize the Double rooms in the hotel and
 * storing it into an ArrayList.
 */
package HotelAppCUI;

import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class DoublesRooms extends RoomList
{
    private ArrayList<Room> roomList;

    public DoublesRooms() 
    {
        initialiseRoom();
    }

    //initialising Rooms  
    @Override
    protected ArrayList<Room> initialiseRoom() 
    {
        roomList = new ArrayList<>();

        //Initiating Double room types
        Room a200 = new Room(RoomTypes.DOUBLE, 200, RoomTypes.DOUBLE.getPrice(), false);
        Room b201 = new Room(RoomTypes.DOUBLE, 201, RoomTypes.DOUBLE.getPrice(), false);
        Room c202 = new Room(RoomTypes.DOUBLE, 202, RoomTypes.DOUBLE.getPrice(), false);
        Room d203 = new Room(RoomTypes.DOUBLE, 203, RoomTypes.DOUBLE.getPrice(), false);
        Room e204 = new Room(RoomTypes.DOUBLE, 204, RoomTypes.DOUBLE.getPrice(), false);
        Room f205 = new Room(RoomTypes.DOUBLE, 205, RoomTypes.DOUBLE.getPrice(), false);
        Room g206 = new Room(RoomTypes.DOUBLE, 206, RoomTypes.DOUBLE.getPrice(), false);
        Room h207 = new Room(RoomTypes.DOUBLE, 207, RoomTypes.DOUBLE.getPrice(), false);
        Room i208 = new Room(RoomTypes.DOUBLE, 208, RoomTypes.DOUBLE.getPrice(), false);
        Room j209 = new Room(RoomTypes.DOUBLE, 209, RoomTypes.DOUBLE.getPrice(), false);

        //Storing Double room types into room list
        roomList.add(a200);
        roomList.add(b201);
        roomList.add(c202);
        roomList.add(d203);
        roomList.add(e204);
        roomList.add(f205);
        roomList.add(g206);
        roomList.add(h207);
        roomList.add(i208);
        roomList.add(j209);

        return roomList;
    }
}