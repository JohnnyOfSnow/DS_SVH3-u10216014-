/**
 *  The class handleQuestion will take responsible for Question and answer.
 *		Have the following method.
 *			1.	giveQuestion	Read the file, and return a question which program requires.
 *			3.	handleAnswer    For the answer split, and return a string array.
 *			4.	correspondAnswer	The method will gain two array(One is answer, another is user answer),
 *									and return a string for the condition of answering question.
 *		Have the following variable.
 *			1.	gradeString		Read the file, spilt by the @, hold the question every blank's grade.
 *			2.	stringForAnswer Read the file, spilt by the #, hold the question every blank's answer.
 *			3.	wholeQuestion	Read the file, it will store to a file when the question that user answer.
 *			4.	grade           When the user qnswer, the variable will record the grade.
 *
 *
 */
class handleQuestion{
	static String gradeString = "";
	static String stringForAnswer = "";
	static String wholeQuestion = "";
	static String grade = "0";
	handleQuestion(){

	}

	public static String giveQuestion(int number){

		String question = "";
		String connectQuestion = ""; 
		
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("exam1.txt"); // A file holds the question.
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
			String[] splitForGrade = question.split("@");
			gradeString = splitForGrade[1]; // give the question every blank grade.

			wholeQuestion = splitForGrade[0];

			String[] splitForAnswer = splitForGrade[0].split("#");
			for(int i = 0; i < splitForAnswer.length; i++){
				System.out.println("splitForAnswer[" + i + "] is " + splitForAnswer[i]);
			}

			StringBuilder stringBuilderForAnswer = new StringBuilder();
			StringBuilder stringBuilderForBlank = new StringBuilder();
			int flag = splitForAnswer.length - 2;
			int blank = 1;
			for(int i = 1; i < splitForAnswer.length; i = i + 2){
				if(i == flag){
					stringBuilderForAnswer.append(splitForAnswer[i]);
					stringBuilderForBlank.append("__" + blank + "__");
					String stringforblank = new String(stringBuilderForBlank);
					splitForAnswer[i] = stringforblank;
					stringBuilderForBlank.delete(0, stringforblank.length());
					blank = blank + 1;
				}else{
					stringBuilderForAnswer.append(splitForAnswer[i] + ",");
					stringBuilderForBlank.append("__" + blank + "__");
					String stringforblank = new String(stringBuilderForBlank);
					splitForAnswer[i] = stringforblank;
					stringBuilderForBlank.delete(0, stringforblank.length());
					blank = blank + 1;
				}	
			}
			stringForAnswer = new String(stringBuilderForAnswer); // connect the answer.

			StringBuilder stringBuilderForConnectQuestion = new StringBuilder();
			for(int j = 0; j < splitForAnswer.length; j++){
				stringBuilderForConnectQuestion.append(splitForAnswer[j]);
			}
			connectQuestion = new String(stringBuilderForConnectQuestion);

		} // end try
		catch(IOException e){}
		finally{
			try {
				br.close(); // Because the br = new BufferedReader(fr); , we close the br.
			}
			catch(IOException e){}
		} // end finally

		return connectQuestion;			
	}// end method giveQuestion

	

	static String[] handleAnswer(String needSeparate){
		String[] firstHandleAnswer = needSeparate.split(","); // First we use , to devide the every blank answer.
		return firstHandleAnswer;
	}// end method handleAnswer

	static String correspondAnswer(String[] correctAnswer, String[] userAnswer){
		String[] methodUseUserAnswer = new String[correctAnswer.length];
		int max = userAnswer.length - 1;
		for(int i = 0; i < correctAnswer.length; i++){
			if(i > max){
				methodUseUserAnswer[i] = "null";
			}else{
				methodUseUserAnswer[i] = userAnswer[i];
			}		
		}
		
		String[] gradeArray = gradeString.split(",");
		int[] gradeIntArray = new int[gradeArray.length];
		for (int i = 0; i < gradeArray.length; i++){
			gradeIntArray[i] = Integer.parseInt(gradeArray[i]);
		}

		int innerGrade = 0;
		int count = 0;
		int blank = 1;
		StringBuilder stringBuilderForResult = new StringBuilder();		
		while(count < correctAnswer.length){
			String[] correctIndividualAnswer = correctAnswer[count].split("/"); // Because there are several answers to written, we need to split again.
			int innerCount = 0;
			boolean isCorrect = false;
			while(innerCount < correctIndividualAnswer.length && isCorrect == false){
				if(methodUseUserAnswer[count].equals(correctIndividualAnswer[innerCount])) {
					isCorrect = true;
					stringBuilderForResult.append("Your answer " + methodUseUserAnswer[count] + " in the " + blank + " is correct." + "\n");
					innerGrade = innerGrade + gradeIntArray[count];
				}
				innerCount = innerCount + 1;
			}

			if(isCorrect == false){
				stringBuilderForResult.append("Your answer " + methodUseUserAnswer[count] + " in the " + blank + " is wrong." + "\n");
			}
			count = count + 1; // Control the answer array.
			blank = blank + 1; // Variable for which one blank.
		}

		setGrade(innerGrade);
		String stringForResult = new String(stringBuilderForResult); // Convert to string.
		return stringForResult;
	}// end method correspondAnswer

	static void setGrade(int grade1){
		int oldGrade = Integer.parseInt(grade);
		int newGrade = oldGrade + grade1;
		grade = String.valueOf(newGrade);
	}
}// end class handleQuestion
