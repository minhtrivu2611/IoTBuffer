import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class ExportToPath implements IExport {
	String path;

	public ExportToPath(String path) {
		this.path = path;
	}

	public void export(List<LogEntry> exportList) {
	/*	PrintWriter out;
		try {
			out = new PrintWriter("log.txt");
			out.println("abc");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("Exported to path successfully");
	};
}