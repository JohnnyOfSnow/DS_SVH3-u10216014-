import java.io.*;
import java.util.Scanner;

public class ReadFileByRequire{
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("capacity.txt"); // A file use to tell the program how many question do we have.
		if (file.exists()) {
			Scanner input = new Scanner(file);
			String capacityForString = " ";
			while (input.hasNext()) {
				capacityForString = input.next(); // Read items
			}

			input.close(); // Close the file.
			int capacityForInt = Integer.parseInt(capacityForString); // String to integer.
			int chooseQuestion = (int)(Math.random() * capacityForInt); // choose a question for random.
			while(chooseQuestion == 0) {
				chooseQuestion = (int)(Math.random() * capacityForInt);
			}
			handleQuestion test1 = new handleQuestion();
			System.out.print(test1.giveQuestion(chooseQuestion));
		} else {
			System.out.println("Sorry, we can't find the file that decide how many question.");
		}
		
			
	}
}

class handleQuestion{
	handleQuestion(){

	}

	public static String giveQuestion(int number){
		java.io.File file = new java.io.File("capacity.txt"); // A file use to tell the program how many question do we have.

		String question = ""; 
		
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("question.txt"); // A file holds the question.
			br = new BufferedReader(fr);
			String data;
			StringBuilder stringBuilderForQuestion = new StringBuilder();
			int index = 1;
			int times = 1;
				
			while (((data = br.readLine()) != null) && (times <= number)) {
				if (data.equals("-")) {
					String stringForQuestion = new String(stringBuilderForQuestion); // Convert stringBuilder into String data type
					if (times == number) {
						question = stringForQuestion;
						break;
					}
					stringBuilderForQuestion.delete(0, stringForQuestion.length()); // clear the StringBuilder.
					times = times + 1;
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

		return question;
				
	}// end method giveQuestion
}// end class handleQuestion
