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

			Scanner input1 = new Scanner(System.in);
			String userAnswer = input1.nextLine();
			handleQuestion test2 = new handleQuestion();
			String[] alreadyUserAnswer = test2.handleAnswer(userAnswer);
			String result = test2.correspondAnswer(alreadyAnswer, alreadyUserAnswer);
			System.out.print(result);
		} else {
			System.out.println("Sorry, we can't find the file that decide how many question.");
		}	
	}
}

/**
 *  The class handleQuestion will take responsible for Question and answer.
 *		Have the following method.
 *			1.	giveQuestion	Read the file question.txt, and return a question which program requires.
 *			2.	getAnswer		Read the file answer.txt,and return a answer which program requires.
 *			3.	handleAnswer    For the answer split, and return a string array.
 *			4.	correspondAnswer	The method will gain two array(One is answer, another is user answer),
 *									and return a string for the condition of answering question.
 */
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
					stringBuilderForAnswer.append(data); // 2014.9.5 remove \n (For the problem in correspondAnswer method)
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
		String[] firstHandleAnswer = needSeparate.split(","); // First we use , to devide the every blank answer.
		return firstHandleAnswer;
	}// end method handleAnswer

	static String correspondAnswer(String[] correctAnswer, String[] userAnswer){
		/*
		String[] userAnswerForLack;
		if(correctAnswer.length != userAnswer.length){
			userAnswerForLack[correctAnswer.length];

		}Need to exception handle 2014.9.5*/ 
		int count = 0;
		int blank = 1;
		StringBuilder stringBuilderForResult = new StringBuilder();		
		while(count < correctAnswer.length){
			String[] correctIndividualAnswer = correctAnswer[count].split("/"); // Because there are several answers to written, we need to split again.
			/* Program fragment for check the method.
			System.out.println("count = " + count);
			System.out.println("blank = " + blank);
			System.out.println("correctIndividualAnswer length is " + correctIndividualAnswer.length);
			
			for(int j = 0; j < correctIndividualAnswer.length; j++) {
				System.out.println("correctIndividualAnswer index " + j + "is " + correctIndividualAnswer[j]);
			}
			
			System.out.println("userAnswer[count] is " + userAnswer[count]);*/
			int innerCount = 0;
			boolean isCorrect = false;
			while(innerCount < correctIndividualAnswer.length && isCorrect == false){
				if(userAnswer[count].equals(correctIndividualAnswer[innerCount])) {
					isCorrect = true;
					stringBuilderForResult.append("Your answer " + userAnswer[count] + " in the " + blank + " is correct." + "\n");
				}
				innerCount = innerCount + 1;
			}

			if(isCorrect == false){
				stringBuilderForResult.append("Your answer " + userAnswer[count] + " in the " + blank + " is wrong." + "\n");
			}
			count = count + 1; // Control the answer array.
			blank = blank + 1; // Variable for which one blank.
		}

		String stringForResult = new String(stringBuilderForResult); // Convert to string.
		return stringForResult;
	}// end method correspondAnswer
}// end class handleQuestion
