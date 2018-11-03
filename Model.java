

public class Model {
	public Route[] routes;
	
	// most likely not necessary
	public Model() {
		routes = new Route[3];
	}
	
	public int[] calculate_total_values() {
		int sum_of_buses = 0;
		int sum_of_cost = 0;
		int sum_of_commute_time = 0;
		int[] the_arr = new int[3];
		
		for(int i=0; i<routes.length; i++) {
			sum_of_buses += routes[i].getDeployed_buses();
			sum_of_cost += routes[i].getCost();
			sum_of_commute_time += routes[i].getCommute_time();
		}
		
		return the_arr;
	}
	
	// the algorithm
	public void compute_routes() {
		
	}
	
	
}
