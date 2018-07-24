import java.util.List;

public class ExportToIp implements IExport{
	String Ip;
	public ExportToIp(String Ip){
		this.Ip = Ip;
	}
	public void export(List<LogEntry> exportList){
		System.out.println("Exported to IP successfully");
	};
}