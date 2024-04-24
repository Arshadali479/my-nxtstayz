/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here
package com.example.nxtstayz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.example.nxtstayz.model.*;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room, Integer> {
    List<Room> findByHotel(Hotel hotel);
}