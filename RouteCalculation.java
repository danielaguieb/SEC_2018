import java.util.ArrayList;

public class RouteCalculation{
	public ArrayList<BusStop> busstops;
	
	public RouteCalculation(ArrayList<BusStop> busstops)
	{
		this.busstops = busstops;
	}
	
	public void calculateRoute()
	{
		printBusStops();
	}
	
	private void printBusStops()
	{
		for (int i = 0; i < busstops.size(); i++) {
			System.out.println(busstops.get(i).getStop().i + "," + busstops.get(i).getStop().j);
			System.out.println("Number of people: " + busstops.get(i).getNumber_of_people());
			System.out.println(busstops.get(i).getDestination()().i + "," + busstops.get(i).getDestination().j);
		}
	}
}