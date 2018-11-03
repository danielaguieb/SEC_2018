import java.util.ArrayList;

public class Route 
{
	private int deployed_buses;
	private int cost;
	private int total_commute_time;
	private int routeID;
	private ArrayList<BusStop> set_of_bus_stops;
	private ArrayList<Bus> set_of_busses;
	
	public int getDeployed_buses() {
		return deployed_buses;
	}
	public void setDeployed_buses(int deployed_buses) {
		this.deployed_buses = deployed_buses;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTotal_commute_time() {
		return total_commute_time;
	}
	public void setTotal_commute_time(int total_commute_time) {
		this.total_commute_time = total_commute_time;
	}
	public int getRouteID() {
		return routeID;
	}
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	public ArrayList<BusStop> getSet_of_bus_stops() {
		return set_of_bus_stops;
	}
	public void setSet_of_bus_stops(ArrayList<BusStop> set_of_bus_stops) {
		this.set_of_bus_stops = set_of_bus_stops;
	}
	public ArrayList<Bus> getSet_of_busses() {
		return set_of_busses;
	}
	public void setSet_of_busses(ArrayList<Bus> set_of_busses) {
		this.set_of_busses = set_of_busses;
	}
	 
}