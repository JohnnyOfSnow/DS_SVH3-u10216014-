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
			int chooseQuestion = (int)(Math.random() * capacityForInt) + 1; // choose a question for random.
			while(chooseQuestion == 0) {
				chooseQuestion = (int)(Math.random() * capacityForInt);
			}
			System.out.println("Ramdom result is " + chooseQuestion);
			handleQuestion test1 = new handleQuestion();
			System.out.print(test1.giveQuestion(chooseQuestion));
			String answer = test1.getAnswer(chooseQuestion);
			String[] alreadyAnswer = test1.handleAnswer(answer);

			for(int i = 0; i < alreadyAnswer.length; i++){
				System.out.println(alreadyAnswer[i]);
			}
		} else {
			System.out.println("Sorry, we can't find the file that decide how many question.");
		}
		
			
	}
}

class handleQuestion{
	handleQuestion(){

	}

	public static String giveQuestion(int number){

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

	static String getAnswer(int number){
		String answer = ""; 
		
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("answer.txt"); // A file holds the question.
			br = new BufferedReader(fr);
			String data;
			StringBuilder stringBuilderForAnswer = new StringBuilder();
			int index = 1;
			int times = 1;
				
			while (((data = br.readLine()) != null) && (times <= number)) {
				if (data.equals("-")) {
					String stringForAnswer = new String(stringBuilderForAnswer); // Convert stringBuilder into String data type
					if (times == number) {
						answer = stringForAnswer;
						break;
					}
					stringBuilderForAnswer.delete(0, stringForAnswer.length()); // clear the StringBuilder.
					times = times + 1;
				} else {	
					stringBuilderForAnswer.append(data + "\n"); // connect the long answer.
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

		return answer;
	}// end method getAnswer

	static String[] handleAnswer(String needSeparate){
		String[] firstHandleAnswer = needSeparate.split(",");
		return firstHandleAnswer;
	}// end method handleAnswer
}// end class handleQuestion
