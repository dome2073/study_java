import java.io.Closeable;
import java.io.IOException;

public class Sample implements Closeable{
	
	
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("close........................");
	}
}
