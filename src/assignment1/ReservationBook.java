package assignment1;

public class ReservationBook {
    private final Reservation[] reservations;
    private int count;

    public ReservationBook(int capacity) {
        this.reservations = new Reservation[capacity > 0 ? capacity : 10];
        this.count = 0;
    }

    public void add(Reservation reservation) {
        if (reservation != null && count < reservations.length) {
            reservations[count] = reservation;
            count++;
        }
    }

    public Reservation findById(int id) {
        return findByIdRecursive(id, 0);
    }

    private Reservation findByIdRecursive(int id, int index) {
        if (index >= count) {
            return null;
        }
        if (reservations[index].getId() == id) {
            return reservations[index];
        }
        return findByIdRecursive(id, index + 1);
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(reservations[i]);
        }
    }

    public void printForRoom(Room room) {
        if (room == null) {
            return;
        }
        for (int i = 0; i < count; i++) {
            if (reservations[i].getRoom() == room) {
                System.out.println(reservations[i]);
            }
        }
    }
}
