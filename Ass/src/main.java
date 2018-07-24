import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;

public class main {
	public static void main(String[] args) {
		OxySensor oxy = new OxySensor("oxy01", new Location(1, 1));
		PhSensor ph = new PhSensor("ph01", new Location(2, 2));
		TemperatureSensor temp = new TemperatureSensor("temp01", new Location(3, 3));

		LogWriter logWriter = new LogWriter();
		Buffer buffer = new Buffer(new ExportToConsole(),new QueryByTime(new Timestamp(System.currentTimeMillis()-604800000),new Timestamp(System.currentTimeMillis()+604800000)));
		logWriter.writeEntryToBuffer(oxy, buffer);
		logWriter.writeEntryToBuffer(ph, buffer);
		logWriter.writeEntryToBuffer(temp, buffer);
		buffer.export();
	}
}
