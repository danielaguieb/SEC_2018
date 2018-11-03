import java.util.ArrayList;

public class RouteCalculation{
	private ArrayList<BusStop> busstops;
	static int routeID = 0;
	private int bus_indiv_cap;
	private double bus_indiv_cost;
	//size of bus = 50v
	//cost of the bus = 100
	public RouteCalculation(ArrayList<BusStop> busstops, int bus_indiv_cap, int bus_indiv_cost)
	{
		this.busstops = busstops;
		this.bus_indiv_cap = bus_indiv_cap;
		this.bus_indiv_cost = bus_indiv_cost;
	}
	
	public void calculateRoute()
	{
		printBusStops();
		ArrayList<Route> routes = new ArrayList<Route>();
		ArrayList<Bus> busses = new ArrayList<Bus>();
		int size = busstops.size();
		
		if (size < 4) {
			for (int i = 0; i < size; i++) {
				int numpeopletotransport = busstops.get(i).getNumber_of_people();
				int numbusses = (int) Math.ceil(busstops.get(i).getNumber_of_people() / 50.0);
				for (int j = 0; j < numbusses-1; j++){
					int currentbuscapacity = numpeopletotransport - bus_indiv_cap;
					busses.add(new Bus(bus_indiv_cost, currentbuscapacity, routeID));
				}
				Route route = new Route(numbusses, numbusses*bus_indiv_cap, routeID++, busses);
				computeCommuteTime(route.getSet_of_bus_stops(), size);
			}
		}
		
		
	}
	
	private int computeCommuteTime(ArrayList<BusStop> busstops, int size)
	{
		int x_distance = 0, y_distance = 0;
		for (int i = 0; i < size; i++) {
			x_distance += Math.abs(busstops.get(i).getThe_stop().i - busstops.get(i).getDestination().i);
			y_distance += Math.abs(busstops.get(i).getThe_stop().j - busstops.get(i).getDestination().j);
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