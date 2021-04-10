/**
 * This is a description for Room class.
 * The room class is to store the instance variable types of room type, room number
 * price and reservation of the room.
 */
package HotelAppCUI;
/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class Room 
{
    private RoomTypes roomtype;
    private int roomNumber;
    private int price;
    private boolean reserved;
    
    public Room(RoomTypes roomtype, int roomNumber, int price , boolean reserved)
    {
        this.roomtype = roomtype;
        this.roomNumber = roomNumber;
        this.price = price;
        this.reserved = reserved;
    }

    public RoomTypes getRoomtype() 
    {
        return roomtype;
    }

    public void setRoomtype(RoomTypes roomtype) 
    {
        this.roomtype = roomtype;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) 
    {
        this.roomNumber = roomNumber;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public boolean isReserved() 
    {
        return reserved;
    }

    public void setReserved(boolean reserved)
    {
        this.reserved = reserved;
    }

    @Override
    public String toString()
    {
        if (reserved) 
        {
            return "Room Type: " + roomtype + ", Room Number: " + roomNumber + ", Price per night: $" + price + ", Reservation Type: Reserved";
        }
        else 
        {
            return "Room Type: " + roomtype + ", Room Number: " + roomNumber + ", Price per night: $" + price + ", Reservation Type: Not Reserved";
        }
    }
}