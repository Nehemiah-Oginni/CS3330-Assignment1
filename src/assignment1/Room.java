package assignment1;

public class Room {

	private String roomName;
	private int capacity;

	public Room(String roomName, int capacity) {

	    if (roomName != null && capacity > 0) {//makes sure only valid inputs are given
	       this.roomName = roomName;
	       this.capacity = capacity;
	    }

	    else {//print if error
	    	System.out.println("Room or capacity is invalid. Make sure Room has a name and capacity is positive");
	    }
	}

	public int getCapacity() {
		return capacity;
	}

	 public String toString() {
	        return "Room " + roomName + " (cap " + capacity + ")";
	    }
}
