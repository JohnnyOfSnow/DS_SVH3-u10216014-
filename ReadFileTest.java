import java.io.*;
public class ReadFileTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("question.txt");
			br = new BufferedReader(fr);
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		}
		catch(IOException e){}
		finally{
			try {
				br.close();
			}
			catch(IOException e){}
		}		
	}
}
