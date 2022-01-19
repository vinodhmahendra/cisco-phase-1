import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestNodeStreams {

	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("file1");
			try {
				FileWriter output = new FileWriter("file2");
				try {
					char[] buffer = new char[128];
					int charsRead;
					
					charsRead = input.read(buffer);
					
					while ( charsRead  != -1) {
						output.write(buffer, 0 , charsRead);
						
						//read the next buffer
						charsRead = input.read(buffer);
					}
				}finally {
					output.close();
				}
			}finally {
				input.close();
			}// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
