import java.io.IOException;

import org.zerkck.web.MyWebServer;

public class Main {
	public static void main(String[] args) {
		MyWebServer server = new MyWebServer();
		
		try {
			server.runServer(5555);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
