package lab1_DS; // Adam Elshanawany Lab 1

public class Time {
	
	private int hours; // In 24 hour time
	private int minutes;
	private double seconds;

	public Time() {
	
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	public Time(int hours, int minutes, double seconds) { // Initializes time object based on users input
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public String toString() { // Format it so that if any number is less than 10, it will still be in the correct format
		
		return String.format("%02d:%02d:%06.3f", hours, minutes, seconds);
	}
	
	public int compareTo(Time t) {
		
		if (this.hours < t.hours) {
			return -1;
		} else if (this.hours > t.hours) {
			return 1;
		} else { // If hours are equal, compare minutes
			if (this.minutes < t.minutes) {
				return -1;
			} else if (this.minutes > t.minutes) {
				return 1;
			} else { // If minutes are equal, compare seconds
				if (this.seconds < t.seconds) {
					return -1;
				} else if (this.seconds > t.seconds) {
					return 1;
				} else { // If seconds are equal, the times are equal
					return 0;
				}
			}
		}
	}
	
	public Time minus(Time t) {
        int borrow = 0;
        
        double newSeconds = this.seconds - t.seconds;
        if (newSeconds < 0) {
            newSeconds += 60.0;
            borrow = 1;
        }
        int newMinutes = this.minutes - t.minutes - borrow;
        if (newMinutes < 0) {
            newMinutes += 60;
            borrow = 1;
        } else {
            borrow = 0;
        }
        int newHour = this.hours - t.hours - borrow;
        return new Time(newHour, newMinutes, newSeconds);
    }
	
	
}
