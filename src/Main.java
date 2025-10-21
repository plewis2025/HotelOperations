public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 124.00, false, false);
        System.out.println("Room available? " + room1.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation.getReservationTotal());

        Employee employee = new Employee(1, "Maria", "Front Desk", 20.00, 45);
        System.out.println("Total Pay: $" + employee.getTotalPay());
    }
}

