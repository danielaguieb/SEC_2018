import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Demo
{
	public static void main(String[] args) throws IOException
	{
		String inputfile = "input.txt";
		FileReader file = new FileReader(inputfile);
        BufferedReader reader = new BufferedReader(file);   
        String readline = reader.readLine();
        
        ArrayList<BusStop> busStops = new ArrayList<BusStop>();
        while (readline != null) {
            String[] txtinfo = readline.split(";");
            String[] pickupcoors = txtinfo[0].split(",");
            String[] destcoors = txtinfo[2].split(",");
            Location pickup = new Location(pickupcoors[0], pickupcoors[1]);
            Location dest = new Location(destcoors[0], destcoors[1]);
            BusStop busStop = new BusStop(pickup, dest, Integer.parseInt(txtinfo[1]));
            busStops.add(busStop);
        	readline=reader.readLine();
        }
        
        RouteCalculation routeCalculation = new RouteCalculation(busStops, 50, 100);
        routeCalculation.calculateRoute();
	}
	
}

