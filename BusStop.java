

public class BusStop {
	private Location the_stop;
	private Location destination;
	private int number_of_people;
	
	public BusStop(Location the_stop, Location destination, int numpeople)
	{
		this.the_stop = the_stop;
		this.destination = destination;
		number_of_people = numpeople;
	}

	public void setStop(Location the_stop) {
		this.the_stop = the_stop;
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

	public Location getThe_stop() {
		return the_stop;
	}

}

