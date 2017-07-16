import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("prgsave.dat", true);
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.out.println("ファイル書き込みエラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {}
			}
		}
	}
}

