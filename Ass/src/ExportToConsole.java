import java.util.List;

public class ExportToConsole implements IExport{
	public void export(List<LogEntry> exportList){
		for (LogEntry entry : exportList) {
			System.out.println(entry.timestamp+" - "+entry.SensorID+" - "+entry.data);
		}
	};
}
