import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class QueryByTime implements IQuery{
	Timestamp from,to;
	public QueryByTime(Timestamp from,Timestamp to) {
		this.from=from;
		this.to=to;
	}

	public List<LogEntry> query(List<LogEntry> listLogEntry){
		List<LogEntry> resultList = new ArrayList<LogEntry>();
		for (LogEntry entry : listLogEntry) {
			if (entry.timestamp.after(from)&& entry.timestamp.before(to)) {
				resultList.add(entry);
			}
		}
		return resultList;
	}
}