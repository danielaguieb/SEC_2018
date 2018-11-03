

public class Model {
	public Route[] routes;
	
	public Model() {
		routes = new Route[3];
		
	}
	
	public int total_number_of_buses() {
		int sum = 0;
		for(int i=0; i<routes.length; i++) {
			sum += routes[i].getDeployed_buses();
		}
		return sum;
	}
	
	public int total_cost() {
		int sum = 0;
		for(int i=0; i<routes.length; i++) {
			sum += routes[i].getCost();
		}
		return sum;
	}
	
	public int total_commute_time() {
		int sum = 0;
		for(int i=0; i<routes.length; i++) {
			sum += routes[i].getCommute_time();
		}
		return sum;
	}
	
	// the algorithm
	public void compute_routes() {
		
	}
	
	
}
