/**
 * This is a description for UserInfo class.
 * The class UserInfo is to store the instance variable type of full name and age
 */
package HotelAppCUI;

/**
 *
 * @author Raymond Li
 * @StudentID 18028813
 */
public class UserInfo 
{
    private String FullName;
    private int Age;
    
    public UserInfo()
    {
        this.FullName = "";
        this.Age = 0;
    }
           
    public UserInfo(String FullName , int Age)
    {
        this.FullName = FullName;
        this.Age = Age;
    }

    public String getFullName() 
    {
        return FullName;
    }

    public void setFullName(String FullName)
    {
        this.FullName = FullName;
    }

    public int getAge() 
    {
        return Age;
    }

    public void setAge(int Age) 
    {
        this.Age = Age;
    }

    @Override
    public String toString() 
    {
        return "Guest Name: " + FullName + ", Age: " + Age;
    }
}