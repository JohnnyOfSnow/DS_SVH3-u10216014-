import java.io.*;
import java.util.*;
public class Ex_FileWriter{
	public static void main(String[] args) {
		Date day = new Date();
		String day1 = day.toString(); 
		requireFileWriteData("name.txt", day1);
	}
	static void requireFileWriteData(String fileName, String data1){
		File file = new File(fileName);
		if(!file.exists()){
    		try {
        		file.createNewFile();

    		} catch (IOException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
    		}
		}else{
			FileWriter fw = null;

			try{
				fw = new FileWriter(fileName, true);
				fw.write(data1 + "\r\n");
			}// end try
			catch(IOException e) {}
			finally {
				try {
					fw.close();
				}// end try

				catch(IOException e) {}
			}// end finally
		}
	}
}
