import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Buffer {
	IExport exporter;
	IQuery queryer;
	List<LogEntry> listLogEntry = new ArrayList<LogEntry>();

	public Buffer() {

	}

	public Buffer(IQuery queryer) {
		this.queryer = queryer;
	}

	public Buffer(IExport exporter) {
		this.exporter = exporter;
	}

	public Buffer(IExport exporter, IQuery queryer) {
		this.exporter = exporter;
		this.queryer = queryer;
	}

	void export() {
		exporter.export(queryer.query(listLogEntry));
	}

	List<LogEntry> query() {
		return queryer.query(listLogEntry);
		
	}

	void remove(String sensorID, Timestamp timestamp) {
	};
}