package com.hotel;  // use your package name

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double lastPunchInTime;  // store last punch-in time

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.lastPunchInTime = 0;
    }

    // Punch in using a double
    public void punchIn(double time) {
        lastPunchInTime = time;
        System.out.println(name + " punched in at " + formatTime(time));
    }

    // Punch out using a double
    public void punchOut(double time) {
        double worked = time - lastPunchInTime;
        if (worked < 0) worked += 24; // in case employee worked past midnight
        hoursWorked += worked;
        System.out.println(name + " punched out at " + formatTime(time));
    }

    // Overloaded punchIn using current time
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchIn(time);
    }

    // Overloaded punchOut using current time
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchOut(time);
    }

    // Format double to 2 decimal places
    private String formatTime(double time) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(time);
    }

    // Get total hours worked
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Optional: Payroll calculations
    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    // Getters for employee info (optional)
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
}
