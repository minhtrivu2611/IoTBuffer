import java.sql.Timestamp;

public class LogWriter {
	public LogWriter() {
	}
	public void writeEntryToBuffer(ISensor sensor, Buffer buffer){
		LogEntry entry = new LogEntry(new Timestamp(System.currentTimeMillis()),sensor.getID(),sensor.getData());
		buffer.listLogEntry.add(entry);
	}
}