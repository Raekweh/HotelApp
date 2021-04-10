    /*
 * This is a description for SingleRooms class.
 * This class will initialize the Single rooms in the hotel and
 * storing it into an ArrayList.
 */
package HotelAppCUI;

import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class SinglesRooms extends RoomList
{    
    private ArrayList<Room> roomList;

    public SinglesRooms()
    {
        initialiseRoom();
    }
    
    //initialising Rooms  
    @Override
    protected ArrayList<Room> initialiseRoom()
    {
        roomList = new ArrayList<>();
        
        //Initiating Single room types
        Room a100 = new Room(RoomTypes.SINGLE, 100, RoomTypes.SINGLE.getPrice() , false);
        Room b101 = new Room(RoomTypes.SINGLE, 101, RoomTypes.SINGLE.getPrice() , false);
        Room c102 = new Room(RoomTypes.SINGLE, 102, RoomTypes.SINGLE.getPrice() , false);
        Room d103 = new Room(RoomTypes.SINGLE, 103, RoomTypes.SINGLE.getPrice() , false);
        Room e104 = new Room(RoomTypes.SINGLE, 104, RoomTypes.SINGLE.getPrice() , false);
        Room f105 = new Room(RoomTypes.SINGLE, 105, RoomTypes.SINGLE.getPrice() , false);
        Room g106 = new Room(RoomTypes.SINGLE, 106, RoomTypes.SINGLE.getPrice() , false);
        Room h107 = new Room(RoomTypes.SINGLE, 107, RoomTypes.SINGLE.getPrice() , false);
        Room i108 = new Room(RoomTypes.SINGLE, 108, RoomTypes.SINGLE.getPrice() , false);
        Room j109 = new Room(RoomTypes.SINGLE, 109, RoomTypes.SINGLE.getPrice() , false);

        //Storing Single room types into room list
        roomList.add(a100);
        roomList.add(b101);
        roomList.add(c102);
        roomList.add(d103);
        roomList.add(e104);
        roomList.add(f105);
        roomList.add(g106);
        roomList.add(h107);
        roomList.add(i108);
        roomList.add(j109);
        
        return roomList;
    }
}