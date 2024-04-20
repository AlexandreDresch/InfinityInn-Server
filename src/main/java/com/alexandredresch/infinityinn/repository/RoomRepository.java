package com.alexandredresch.infinityinn.repository;

import com.alexandredresch.infinityinn.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
