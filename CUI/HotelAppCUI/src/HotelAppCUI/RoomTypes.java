/**
 * This is a description for RoomTypes class.
 * The enum class will store different types of Room types.
 */
package HotelAppCUI;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public enum RoomTypes
{
    SINGLE(110), DOUBLE(120), QUEEN(210), KING(220);

    private int price;

    private RoomTypes(int price)
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
        switch (price) 
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