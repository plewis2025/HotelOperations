package com.hotel;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructor 1: booked rooms default to 0
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Constructor 2: specify booked rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Book rooms
    public boolean bookRoom(int roomsToBook, boolean isSuite) {
        if (isSuite) {
            if (roomsToBook <= getAvailableSuites()) {
                bookedSuites += roomsToBook;
                return true;
            }
            return false;
        } else {
            if (roomsToBook <= getAvailableRooms()) {
                bookedBasicRooms += roomsToBook;
                return true;
            }
            return false;
        }
    }

    // Derived getters
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
}
