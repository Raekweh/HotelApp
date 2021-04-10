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
public enum RoomType 
{
    SINGLE(110), DOUBLE(120), QUEEN(210), KING(220);

    private int price;

    private RoomType(int price)
    {
        this.price = price;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }
    
    @Override
    public String toString()
    {
        switch(price)
        {
            case 110:
                return "Single";
            case 120:
                return "Double";
            case 210:
                return "Queen";
            case 220:
                return "King";
            default:
                return "";
        }
    }
}