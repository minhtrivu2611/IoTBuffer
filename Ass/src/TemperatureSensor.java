import java.util.Random;

public class TemperatureSensor implements ISensor{
	public String sensorID;
	public Location location;
	public TemperatureSensor(String sensorID, Location location) {
		this.sensorID=sensorID;
		this.location=location;
	}
	public float getData() {
		Random rand = new Random();
		return rand.nextFloat()*30;
	};
	public Location getLocation() {
		return location;
	};
	public String getID() {
		return sensorID;
	}
}