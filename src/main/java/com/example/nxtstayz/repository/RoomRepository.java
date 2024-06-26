/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxtstayz.repository;

import java.util.*;

import com.example.nxtstayz.model.*;

public interface RoomRepository {
    ArrayList<Room> getRooms();

    Room addRoom(Room room);

    Room getRoomById(int roomId);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

    Hotel getRoomHotel(int roomId);
}