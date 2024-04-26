package com.alexandredresch.infinityinn.service;

import com.alexandredresch.infinityinn.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
