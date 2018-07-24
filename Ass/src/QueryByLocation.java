import java.util.List;

public class QueryByLocation implements IQuery {
	Location location;

	public QueryByLocation(Location location) {
		this.location = location;
	}

	public List<LogEntry> query(List<LogEntry> listLogEntry) {
		return null;
	}
}