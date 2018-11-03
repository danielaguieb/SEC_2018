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
		ArrayList<BusStop> busStops = new ArrayList<BusStop>();
		int size = busstops.size();
		
		if (size < 4) {
			for (int i = 0; i < size; i++) {
				int numpeopletotransport = busstops.get(i).getNumber_of_people();
				int numbusses = (int) Math.ceil(busstops.get(i).getNumber_of_people() / 50.0);
				for (int j = 0; j < numbusses-1; j++){
//					int currentbuscapacity = numpeopletotransport - bus_indiv_cap;
					busses.add(new Bus(bus_indiv_cost, bus_indiv_cap, routeID));
				}
				ArrayList<BusStop> list_of_stops = new ArrayList<BusStop>();
				list_of_stops.add(busstops.get(i));
				Route route = new Route(numbusses, computeCommuteTime(list_of_stops, size), 
						numbusses*bus_indiv_cap, routeID++, busses, list_of_stops);
			}
		}
		
		
	}
	
	private int computeCommuteTime(ArrayList<BusStop> list_of_stops, int size)
	{
		int x_distance = 0, y_distance = 0;
		System.out.println("the size is " + list_of_stops.size());
		for (int k = 0; k < size; k++) {
			x_distance += Math.abs(list_of_stops.get(k).getThe_stop().i - list_of_stops.get(k).getDestination().i);
			y_distance += Math.abs(list_of_stops.get(k).getThe_stop().j - list_of_stops.get(k).getDestination().j);
		}
		return x_distance + y_distance;
	}
	
	private void printBusStops()
	{
		for (int i = 0; i < busstops.size(); i++) {
			System.out.println(busstops.get(i).getThe_stop().i + "," + busstops.get(i).getThe_stop().j);
			System.out.println("Number of people: " + busstops.get(i).getNumber_of_people());
			System.out.println(busstops.get(i).getDestination().i + "," + busstops.get(i).getDestination().j);
		}
	}
}