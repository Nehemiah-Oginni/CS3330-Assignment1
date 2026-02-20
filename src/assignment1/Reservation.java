package assignment1;

public class Reservation {
    private final int id;
    private final Room room;
    private final String studentName;
    private final TimeSlot timeSlot;
    private boolean canceled;
    private boolean checkedIn;

    public Reservation(int id, Room room, String studentName, TimeSlot timeSlot) {
        this.id = id;
        this.room = room;
        this.studentName = studentName;
        this.timeSlot = timeSlot;
        this.canceled = false;
        this.checkedIn = false;
    }

    public int getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public String getStudentName() {
        return studentName;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public boolean isActive() {
        return !canceled && !checkedIn;
    }

    public boolean canCheckIn() {
        return !canceled && !checkedIn;
    }

    public void cancel() {
        if (!checkedIn) {
            canceled = true;
        }
    }

    public void checkIn() {
        if (!canceled) {
            checkedIn = true;
        }
    }

    @Override
    public String toString() {
        String status = canceled ? "CANCELED" : (checkedIn ? "CHECKED IN" : "ACTIVE");
        return String.format("ID: %d | %s | %s | %s | %s",
                           id, studentName, room, timeSlot, status);
    }
}
