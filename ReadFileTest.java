import java.io.*;
import java.util.Scanner;

public class ReadFileTest {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("capacity.txt"); // A file use to tell the program how many question do we have.

		if(file.exists()) {
			Scanner input = new Scanner(file);
			String capacityForString = " ";
			while (input.hasNext()) {
				capacityForString = input.next(); // Read items
			}

			input.close(); // Close the file.
			int capacityForInt = Integer.parseInt(capacityForString); // String to integer.
			capacityForInt = capacityForInt + 1; // Avoid the index 0, so add one.
			FileReader fr = null;
			BufferedReader br = null;
			String[] question = new String[capacityForInt];
			try {
				fr = new FileReader("question.txt"); // A file holds the question.
				br = new BufferedReader(fr);
				String data;
				StringBuilder stringBuilderForQuestion = new StringBuilder();
				int index = 1;
				
				while ((data = br.readLine()) != null) {
					if (data.equals("-")) {
						String stringForQuestion = new String(stringBuilderForQuestion); // Convert stringBuilder into String data type
						question[index] = stringForQuestion; // A question has connected, so we input the string array.
						index = index + 1;
						stringBuilderForQuestion.delete(0, stringForQuestion.length()); // clear the StringBuilder.
					} else {	
						stringBuilderForQuestion.append(data + "\n"); // connect the long question.
					}
				
				}
			} // end try
			catch(IOException e){}
			finally{
				try {
					br.close(); // Because the br = new BufferedReader(fr); , we close the br.
				}
				catch(IOException e){}
			} // end finally

			int chooseQuestion = (int)(Math.random() * capacityForInt); // choose a question for random.
			while(chooseQuestion == 0) {
				chooseQuestion = (int)(Math.random() * capacityForInt);
			}
				System.out.println(question[chooseQuestion]); // display the question on CMD.
			
		} else {
			System.out.println("You loss a file which decide the capacity,so we cannot load the question."); // Wrong message for check.
		} // end if		
	}// end main method
}// end class ReadFileTest
