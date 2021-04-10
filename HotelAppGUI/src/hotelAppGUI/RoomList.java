/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelAppGUI;

import java.util.ArrayList;

/**
 *
 * @author Raymond Li
 */
public class RoomList {

    public ArrayList<Room> roomList;
    public RoomList()
    {
        roomList = new ArrayList<>();
    }

    public ArrayList<Room> List()
    {
        //Initiating Single room types
        Room a100 = new Room(RoomType.SINGLE, 100, RoomType.SINGLE.getPrice(), false);
        Room b101 = new Room(RoomType.SINGLE, 101, RoomType.SINGLE.getPrice(), false);
        Room c102 = new Room(RoomType.SINGLE, 102, RoomType.SINGLE.getPrice(), false);
        Room d103 = new Room(RoomType.SINGLE, 103, RoomType.SINGLE.getPrice(), false);
        Room e104 = new Room(RoomType.SINGLE, 104, RoomType.SINGLE.getPrice(), false);
        Room f105 = new Room(RoomType.SINGLE, 105, RoomType.SINGLE.getPrice(), false);
        Room g106 = new Room(RoomType.SINGLE, 106, RoomType.SINGLE.getPrice(), false);
        Room h107 = new Room(RoomType.SINGLE, 107, RoomType.SINGLE.getPrice(), false);
        Room i108 = new Room(RoomType.SINGLE, 108, RoomType.SINGLE.getPrice(), false);
        Room j109 = new Room(RoomType.SINGLE, 109, RoomType.SINGLE.getPrice(), false);

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

        //Initiating Double room types
        Room a200 = new Room(RoomType.DOUBLE, 200, RoomType.DOUBLE.getPrice(), false);
        Room b201 = new Room(RoomType.DOUBLE, 201, RoomType.DOUBLE.getPrice(), false);
        Room c202 = new Room(RoomType.DOUBLE, 202, RoomType.DOUBLE.getPrice(), false);
        Room d203 = new Room(RoomType.DOUBLE, 203, RoomType.DOUBLE.getPrice(), false);
        Room e204 = new Room(RoomType.DOUBLE, 204, RoomType.DOUBLE.getPrice(), false);
        Room f205 = new Room(RoomType.DOUBLE, 205, RoomType.DOUBLE.getPrice(), false);
        Room g206 = new Room(RoomType.DOUBLE, 206, RoomType.DOUBLE.getPrice(), false);
        Room h207 = new Room(RoomType.DOUBLE, 207, RoomType.DOUBLE.getPrice(), false);
        Room i208 = new Room(RoomType.DOUBLE, 208, RoomType.DOUBLE.getPrice(), false);
        Room j209 = new Room(RoomType.DOUBLE, 209, RoomType.DOUBLE.getPrice(), false);

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

        //Initiating Queen room types
        Room a300 = new Room(RoomType.QUEEN, 300, RoomType.QUEEN.getPrice(), false);
        Room b301 = new Room(RoomType.QUEEN, 301, RoomType.QUEEN.getPrice(), false);
        Room c302 = new Room(RoomType.QUEEN, 302, RoomType.QUEEN.getPrice(), false);
        Room d303 = new Room(RoomType.QUEEN, 303, RoomType.QUEEN.getPrice(), false);
        Room e304 = new Room(RoomType.QUEEN, 304, RoomType.QUEEN.getPrice(), false);
        Room f305 = new Room(RoomType.QUEEN, 305, RoomType.QUEEN.getPrice(), false);
        Room g306 = new Room(RoomType.QUEEN, 306, RoomType.QUEEN.getPrice(), false);
        Room h307 = new Room(RoomType.QUEEN, 307, RoomType.QUEEN.getPrice(), false);
        Room i308 = new Room(RoomType.QUEEN, 308, RoomType.QUEEN.getPrice(), false);
        Room j309 = new Room(RoomType.QUEEN, 309, RoomType.QUEEN.getPrice(), false);

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

        //Initiating King room types
        Room a400 = new Room(RoomType.KING, 400, RoomType.KING.getPrice(), false);
        Room b401 = new Room(RoomType.KING, 401, RoomType.KING.getPrice(), false);
        Room c402 = new Room(RoomType.KING, 402, RoomType.KING.getPrice(), false);
        Room d403 = new Room(RoomType.KING, 403, RoomType.KING.getPrice(), false);
        Room e404 = new Room(RoomType.KING, 404, RoomType.KING.getPrice(), false);
        Room f405 = new Room(RoomType.KING, 405, RoomType.KING.getPrice(), false);
        Room g406 = new Room(RoomType.KING, 406, RoomType.KING.getPrice(), false);
        Room h407 = new Room(RoomType.KING, 407, RoomType.KING.getPrice(), false);
        Room i408 = new Room(RoomType.KING, 408, RoomType.KING.getPrice(), false);
        Room j409 = new Room(RoomType.KING, 409, RoomType.KING.getPrice(), false);

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