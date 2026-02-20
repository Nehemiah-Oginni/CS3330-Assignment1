package assignment1;

public final class TimeSlot {
	private final int hour;

	public TimeSlot(int hour) {
		if (hour >= 0 || hour <= 23) {
			this.hour = hour; // takes hour as a int
		}
	}

	public int getHour() {
		return hour;
	}

	public String toString() {
		int hourend = (hour + 1) % 24;// adds 1 to hour and does mod 24 at midnight
		//formats time
		String start24 = String.format("%02d:00", hour);
		String end24 = String.format("%02d:00", hourend);

		// conversions to 12 hours 
		int start12; 
		if(hour % 12 == 0) {
			start12 = 12;
		} else {
			start12 = hour % 12;
		}

		int end12;
		if(hourend % 12 == 0) {
			end12 = 12;	
		} else {
			end12 = hourend % 12;	
		}	

		// check for Am or PM
		String startPeriod;
		
		if (hour < 12) {
			startPeriod = "AM";
    	} else {
        	startPeriod = "PM";
    	}

    	String endPeriod;
		
    	if (hourend < 12) {
        	endPeriod = "AM";
    	} else {
        	endPeriod = "PM";
    	}

		// returns time in a 24 hour format and a 12 hour format
		return String.format("%s-%s (%d:00 %s-%d:00 %s)", start24, end24, start12, startPeriod, end12, endPeriod); 
		
	}
}
