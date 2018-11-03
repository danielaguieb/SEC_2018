import java.util.ArrayList;
import java.util.Vector;

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
				busStops.add(busstops.get(i));
				Route route = new Route(numbusses, computeCommuteTime(busStops, size), 
						numbusses*bus_indiv_cap, routeID++, busses, busStops);
			}
		}
		
		else {
			Vector<Location> dest_vector = new Vector<Location>();
			Vector<Location> dropoff_to_pickup = new Vector<Location>();
			for (int i = 0; i < size; i++) {
				int x_dist_dest = Math.abs(busstops.get(i).getThe_stop().i - busstops.get(i).getThe_stop().i);
				int y_dist_dest = Math.abs(busstops.get(i).getThe_stop().j - busstops.get(i).getThe_stop().j);
				dest_vector.add(new Location(x_dist_dest, y_dist_dest));
				
				for (int j = 0; j < size; j++) {
					if (j != i) {
						int x_dist_dtp = Math.abs(busstops.get(i).getDestination().i - busstops.get(j).getThe_stop().i);
						int y_dist_dtp = Math.abs(busstops.get(i).getDestination().j - busstops.get(j).getThe_stop().j);
						dropoff_to_pickup.add(new Location(x_dist_dtp, y_dist_dtp));
					}
				}
			}
			
			int minnumpickups = size / 3;
			int remainingminpickups = size % 3;
			
			Location smallestlocation = busstops.get(0).getThe_stop();
			
			for (int i = 0; i < minnumpickups - 1; i++) {
				//get the shortest part
				int min = 1000000;
				for (int j = 0; j < size - 1; j++) {
					int x = busstops.get(smallestlocation.i).getDestination().i - busstops.get(j).getDestination().i;
					int y = busstops.get(smallestlocation.i).getDestination().j - busstops.get(j).getDestination().j;
					int total = x + y;
					if (total < min) {
						min = total;
						smallestlocation.i = busstops.get(j).getDestination().i;
						smallestlocation.j = busstops.get(j).getDestination().j;
					}
				}
				
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