import java.sql.Timestamp;

public class LogEntry{
	Timestamp timestamp;
	float  data;
	String SensorID;

	public LogEntry(Timestamp timestamp,String SensorID, float data){
			this.timestamp = timestamp;
			this.data = data;
			this.SensorID = SensorID;
	}

}