package lab1_DS; // Adam Elshanawany Lab 1

public class Runner {

	private String name;
	private String country;
	private Time startingTime;
	private Time endingTime;
	private Time raceTime;
	
	
	Runner(String name, String country, Time startTime, Time endTime){
		
		this.name = name;
		this.country = country;
		this.startingTime = startTime;
		this.endingTime = endTime;
		
		raceTime();
		
	}
	
	public Time raceTime() { //Uses the minus method to get the race time
		
		raceTime = endingTime.minus(startingTime);
		
		return raceTime;
	}
	
	public String toString() { //Converts all the data into a nicely labeled format
		
		return String.format("%-20s (%s) \nstart: %s, end: %s \n"
				+ "time: %s", name, country, startingTime.toString(), endingTime.toString(), raceTime.toString());
	}
	
	public int compareTo (Runner r) { // Compares the runner times by using the compare to
									  // method in the time class and setting it to a int var here
		
		int comparison = this.raceTime.compareTo(r.raceTime);
		
		if (comparison < 0) {
	        return -1;
	    } else if (comparison == 0) {
	        return 0;
	    } else {
	        return 1;
	    }
	}
	
}
