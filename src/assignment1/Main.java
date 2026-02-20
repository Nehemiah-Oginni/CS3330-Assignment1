package assignment1;

public class Main {

	public static void main(String[] args) {
		// Create at least 2 rooms
		Room room101 = new Room("Room 101", 4);
		Room room102 = new Room("Room 102", 6);

		// Create time slots
		TimeSlot slot9am = new TimeSlot(9);
		TimeSlot slot10am = new TimeSlot(10);
		TimeSlot slot2pm = new TimeSlot(14);
		TimeSlot slot3pm = new TimeSlot(15);

		// Create reservation manager
		ReservationManager manager = new ReservationManager(20);

		// Create at least 5 reservations across different rooms and time slots
		int res1 = manager.createReservation(room101, "Nehemiah Johnson", slot9am);
		int res2 = manager.createReservation(room101, "Canady Johnson", slot10am);
		int res3 = manager.createReservation(room102, "Ethan Johnson", slot9am);
		int res4 = manager.createReservation(room102, "Jimr Ries", slot2pm);
		int res5 = manager.createReservation(room101, "Ekincan Ries", slot3pm);

		// Cancel at least 1 reservation
		manager.cancelReservation(res2);

		// Check in at least 1 reservation
		manager.checkInReservation(res1);

		// Print all reservations
		manager.printAllReservations();

		// Print reservations for one specific room
		manager.printReservationsForRoom(room101);
	}
}
