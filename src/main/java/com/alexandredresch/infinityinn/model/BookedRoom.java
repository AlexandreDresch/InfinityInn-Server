package com.alexandredresch.infinityinn.model;

import java.time.LocalDate;

public class BookedRoom {
    private Long bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int NumOfAdults;
    private int NumOfChildren;
    private int totalNumOfGuests;
    private String bookingConfirmationCode;
    private Room room;

    public void calculateTotalNumberOfGuests(){
        this.totalNumOfGuests = this.NumOfAdults + this.NumOfChildren;
    }
}
