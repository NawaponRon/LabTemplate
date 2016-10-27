
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadInput {

	public static void main(String[] args) throws IOException {
		Reader.init(new FileInputStream(new File("data/input.txt")));
		Reader.setDelimeter("\t ,");
		
		String s;
		s = Reader.next();
		System.out.println(s);
	}

}
