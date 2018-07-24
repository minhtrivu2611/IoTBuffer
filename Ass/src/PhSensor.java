import java.util.Random;

public class PhSensor implements ISensor{
	public String sensorID;
	public Location location;
	public PhSensor(String sensorID, Location location) {
		this.sensorID=sensorID;
		this.location=location;
	}
	public float getData() {
		Random rand = new Random();
		return rand.nextFloat()*10;
	};
	public Location getLocation() {
		return location;
	};
	public String getID() {
		return sensorID;
	}
}
