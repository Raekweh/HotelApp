/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raymond Li
 */
public class Database 
{
    Connection conn = null;

    //Guest Information Database
//    String GIurl = "jdbc:derby://localhost:1527/GuestInfo;create=true";
    String GIurl = "jdbc:derby:GuestInfo;create=true";
    String GIdbusername = "DBGuestInfo";
    String GIdbpassword = "DBGI";

    //Room List Data base
//    String RRLurl = "jdbc:derby://localhost:1527/ReservedRoomList;create=true";
    String RRLurl = "jdbc:derby:ReservedRoomList;create=true";
    String RRLusername = "DBReservedRoomList";
    String RRLpassword = "DBRRL";

    //Setting up Guest Information Database
    public void GIdbsetup() 
    {
        try
        {
            conn = DriverManager.getConnection(GIurl, GIdbusername, GIdbpassword);
            Statement statement = conn.createStatement();
            String GItableName = "GuestInfo";

            if (!checkTableExisting(GItableName)) 
            {
                statement.executeUpdate("CREATE TABLE " + GItableName + " (FullName VARCHAR(100), Age INT, EmailAddress VARCHAR(30))");
            }
            statement.close();
        } 
        catch (Throwable e) 
        {
            System.out.println(e);
        }
    }

    //Setting up Room list Database
    public void RRLdbsetup()
    {
        try 
        {
            conn = DriverManager.getConnection(RRLurl, RRLusername, RRLpassword);
            Statement statement = conn.createStatement();
            String RRLtableName = "ReservedRoomList";

            if (!checkTableExisting(RRLtableName)) 
            {
                statement.executeUpdate("CREATE TABLE " + RRLtableName + " (RoomNumber INT, RoomType VARCHAR(30), RoomPrice INT, RoomReservation BOOLEAN)");
            }
            statement.close();
        } 
        catch (Throwable e)
        {
            System.out.println("Error: Setting up Room list");
        }
    }

    //Inserting Guest Information into Database
    public void DBGuestInfo(String fullname, int age, String emailAddress) 
    {
        try 
        {
            //Inserting the values into the table
            Statement statement = conn.createStatement();
            ResultSet re = statement.executeQuery("SELECT fullname, age, emailaddress FROM GuestInfo");
            statement.executeUpdate("INSERT INTO GuestInfo " + "VALUES ('" + fullname + "', " + age + ", '" + emailAddress + "')");
        } 
        catch (SQLException e)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    //Inserting Room into Database
    public void DBReservedRoomList(Room ReservedRoom)
    {
        try 
        {
            Statement statement = conn.createStatement();
            ResultSet re = statement.executeQuery("SELECT ROOMNUMBER, ROOMTYPE, ROOMPRICE, ROOMRESERVATION FROM ReservedRoomList");
            //Inserting room list into the databse
            statement.executeUpdate("INSERT INTO ReservedRoomList " + "VALUES(" + ReservedRoom.getRoomNumber() + ", '" + ReservedRoom.getRoomtype() + "', " + ReservedRoom.getPrice() + ", '" + ReservedRoom.isReserved() + "')");
        }
        catch (SQLException e) 
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //Checks if the table exist
    private boolean checkTableExisting(String newTableName) 
    {
        boolean flag = false;
        try 
        {
            System.out.println("check existing tables.... ");
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);//types);
            //Statement dropStatement=null;
            while (rsDBMeta.next()) 
            {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTableName) == 0)
                {
                    System.out.println(tableName + "  is there");
                    flag = true;
                }
            }
            if (rsDBMeta != null) 
            {
                rsDBMeta.close();
            }
        }
        catch (SQLException ex) 
        {}
        return flag;
    }
}
