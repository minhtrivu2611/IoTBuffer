import java.util.Random;

public class OxySensor implements ISensor{
	public String sensorID;
	public Location location;
	public OxySensor(String sensorID, Location location) {
		this.sensorID=sensorID;
		this.location=location;
	}
	public float getData(){
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