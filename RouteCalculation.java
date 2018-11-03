import java.util.ArrayList;

public class RouteCalculation{
	private ArrayList<BusStop> busstops;
	static int routeID = 0;
	//size of bus = 50
	//cost of the bus = 100
	public RouteCalculation(ArrayList<BusStop> busstops)
	{
		this.busstops = busstops;
	}
	
	public void calculateRoute()
	{
		printBusStops();
		ArrayList<Route> routes = new ArrayList<Route>();
		int size = busstops.size();
		
		if (size < 4) {
			for (int i = 0; i < size; i++) {
				int numbusses = Math.celi(busstops.get(i).getNumber_of_people() / 50.0);
				routes.add(new Route());
			}
		}
	}
	
	private void printBusStops()
	{
		for (int i = 0; i < busstops.size(); i++) {
			System.out.println(busstops.get(i).getStop().i + "," + busstops.get(i).getStop().j);
			System.out.println("Number of people: " + busstops.get(i).getNumber_of_people());
			System.out.println(busstops.get(i).getDestination().i + "," + busstops.get(i).getDestination().j);
		}
	}
}