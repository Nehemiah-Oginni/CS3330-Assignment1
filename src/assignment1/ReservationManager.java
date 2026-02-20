package assignment1;

public class ReservationManager {
    private final ReservationBook reservationBook;
    private int nextId;

    public ReservationManager(int bookCapacity) {
        this.reservationBook = new ReservationBook(bookCapacity);
        this.nextId = 1;
    }

    public int createReservation(Room room, String studentName, TimeSlot slot) {
        if (room != null && studentName != null && !studentName.trim().isEmpty() && slot != null) {
            int id = nextId++;
            Reservation reservation = new Reservation(id, room, studentName, slot);
            reservationBook.add(reservation);
            return id;
        }
        return -1;
    }

    public boolean cancelReservation(int id) {
        Reservation reservation = reservationBook.findById(id);
        if (reservation != null && !reservation.isCheckedIn()) {
            reservation.cancel();
            return true;
        }
        return false;
    }

    public boolean checkInReservation(int id) {
        Reservation reservation = reservationBook.findById(id);
        if (reservation != null && !reservation.isCanceled()) {
            reservation.checkIn();
            return true;
        }
        return false;
    }

    public void printAllReservations() {
        reservationBook.printAll();
    }

    public void printReservationsForRoom(Room room) {
        reservationBook.printForRoom(room);
    }

    public Reservation findReservation(int id) {
        return reservationBook.findById(id);
    }
}
