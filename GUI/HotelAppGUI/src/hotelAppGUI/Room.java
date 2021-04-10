/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

/**
 *
 * @author Raymond Li
 */
public class Room 
{
    private RoomType roomtype;
    private int roomNumber;
    private int price;
    private boolean reserved;
    
    public Room(RoomType roomtype, int roomNumber, int price , boolean reserved)
    {
        this.roomtype = roomtype;
        this.roomNumber = roomNumber;
        this.price = price;
        this.reserved = reserved;
    }

    public RoomType getRoomtype() 
    {
        return roomtype;
    }

    public void setRoomtype(RoomType roomtype) 
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
        return "Room Number: " + roomNumber +  ", price: $" + price + ", Room Type:" + roomtype ;
    }
}