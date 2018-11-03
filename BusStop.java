

public class BusStop {
	private Location stop;
	private Location destination;
	private int number_of_people;
	
	public BusStop(Location stop, Location destination, int numpeople)
	{
		this.stop = stop;
		this.destination = destination;
		number_of_people = numpeople;
	}

	public void setStop(Location stop) {
		this.stop = stop;
	}
	
	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	public int getNumber_of_people() {
		return number_of_people;
	}

	public void setNumber_of_people(int number_of_people) {
		this.number_of_people = number_of_people;
	}

	public Location getStop() {
		return stop;
	}

}

