package Station;

import java.util.ArrayList;

public class TransportLine {
	private String ID;
	public double length;
	public ArrayList<Station> stations;
	public String[] schedule;
	private boolean suspended;
	
	public TransportLine(double length, boolean suspended) {
		this.suspended = suspended;
		this.length = length;
		this.ID = "test string";  // find a way to generate a code
		this.schedule = new String[2];
		this.stations = new ArrayList<Station>();
	}
	
}
