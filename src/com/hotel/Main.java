package com.hotel; // make sure this matches your folder structure

public class Main {  // <-- everything must be inside this class
    public static void main(String[] args) {  // <-- main method
        // Create an Employee object
        Employee emp = new Employee(1, "Maria", "Front Desk", 20.0, 0.0);

        // Simulate punch in and punch out using fixed times
        emp.punchIn(14.75);  // 2:45 PM
        emp.punchOut(22.5);  // 10:30 PM

        // Print total hours worked
        System.out.println("Hours worked: " + emp.getHoursWorked());

        // Optional: Test Hotel bookings
        Hotel hotel = new Hotel("Sunny Hotel", 5, 10);
        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available rooms: " + hotel.getAvailableRooms());
        hotel.bookRoom(2, true);
        hotel.bookRoom(5, false);
        System.out.println("Available suites after booking: " + hotel.getAvailableSuites());
        System.out.println("Available rooms after booking: " + hotel.getAvailableRooms());
    }
}

