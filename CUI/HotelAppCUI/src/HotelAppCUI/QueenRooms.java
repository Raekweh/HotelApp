/*
 * This is a description for QueenRooms class.
 * This class will initialize the Queen rooms in the hotel and
 * storing it into an ArrayList.
 */
package HotelAppCUI;

import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class QueenRooms extends RoomList
{
    private ArrayList<Room> roomList;

        public QueenRooms()
    {
        initialiseRoom();
    }
    
    //initialising Rooms  
    @Override
    protected ArrayList<Room> initialiseRoom()
    {
        roomList = new ArrayList<>();
        
        //Initiating Queen room types
        Room a300 = new Room(RoomTypes.QUEEN, 300, RoomTypes.QUEEN.getPrice() , false);
        Room b301 = new Room(RoomTypes.QUEEN, 301, RoomTypes.QUEEN.getPrice() , false);
        Room c302 = new Room(RoomTypes.QUEEN, 302, RoomTypes.QUEEN.getPrice() , false);
        Room d303 = new Room(RoomTypes.QUEEN, 303, RoomTypes.QUEEN.getPrice() , false);
        Room e304 = new Room(RoomTypes.QUEEN, 304, RoomTypes.QUEEN.getPrice() , false);
        Room f305 = new Room(RoomTypes.QUEEN, 305, RoomTypes.QUEEN.getPrice() , false);
        Room g306 = new Room(RoomTypes.QUEEN, 306, RoomTypes.QUEEN.getPrice() , false);
        Room h307 = new Room(RoomTypes.QUEEN, 307, RoomTypes.QUEEN.getPrice() , false);
        Room i308 = new Room(RoomTypes.QUEEN, 308, RoomTypes.QUEEN.getPrice() , false);
        Room j309 = new Room(RoomTypes.QUEEN, 309, RoomTypes.QUEEN.getPrice() , false);

        //Storing Queen room types into room list
        roomList.add(a300);
        roomList.add(b301);
        roomList.add(c302);
        roomList.add(d303);
        roomList.add(e304);
        roomList.add(f305);
        roomList.add(g306);
        roomList.add(h307);
        roomList.add(i308);
        roomList.add(j309);
        
        return roomList;
    }
}