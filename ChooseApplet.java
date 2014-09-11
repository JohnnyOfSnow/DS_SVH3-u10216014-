import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import javax.swing.ScrollPaneConstants;
import java.util.Scanner; 
import javax.swing.JFileChooser;
import java.awt.event.*;
import java.io.FileNotFoundException;
import javax.swing.JRadioButton;
import java.io.*;
import java.util.Scanner;
import java.util.Date;


public class ChooseApplet extends JApplet {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JButton btnNewButton = new JButton("\u4E0A\u6B21\u4F5C\u7B54\u89E3\u8AAA");
	JButton btnNewButton_1 = new JButton("\u958B\u59CB\u4F5C\u7B54");
	JRadioButton rdbtnNewRadioButton = new JRadioButton("\u96A8\u6A5F\u51FA\u984C",true);
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u9806\u5E8F\u51FA\u984C",false);
	JTextArea textArea;
	static JFrame frame;
	static int mode = 1;
	
	// In order to run standalone as a standalone application, we add the main method.
	public static void main(String[] args) {
		// Create a frame.
		frame = new JFrame("A choice window.");
		// Create an instance of the applet.
		ChooseApplet applet = new ChooseApplet();
		// Add the applet to the frame.
		frame.add(applet);
		// Display the frame.
		frame.setSize(727,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	// Owing to Applet life-cycle, the method will automatically be invoked.
	public void init(){
		resize(727,400); // Set the applet size, or the window is too small initially.
	}


	/**
	 * Create the applet.
	 */
	public ChooseApplet() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6B61\u8FCE\u4F86\u5230\u4E00\u500B\u6703\u51FA\u591A\u91CD\u7A7A\u683C\u7684\u554F\u984C\u7A0B\u5F0F");
		lblNewLabel.setBounds(10, 30, 215, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.\u82E5\u60A8\u662F\u7B2C1\u6B21\u4F7F\u7528\u7A0B\u5F0F\u8ACB\u5728\u4E0B\u65B9\u7684\u7A7A\u683C\u4E2D\uFF0C\u5206\u5225\u9375\u5165\u60A8\u7684\u540D\u5B57\u53CA\u5B78\u865F\r\n   ");
		lblNewLabel_1.setBounds(20, 59, 425, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2.\u82E5\u60A8\u5DF2\u7D93\u958B\u555F\u904E\u672C\u7A0B\u5F0F\u800C\u4E14\u7B54\u904E\u984C\uFF0C\u8ACB\u6309\u4E0B\u4E0A\u6B21\u4F5C\u7B54\u89E3\u8AAA");
		lblNewLabel_2.setBounds(20, 112, 372, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u6309\u4E0B\u5F8C\u6703\u51FA\u73FE\u9078\u64C7\u6A94\u6848\u7684\u8996\u7A97\uFF0C\u8ACB\u9EDE\u9078\u60A8\u4E0A\u6B21\u4F5C\u7B54\u4FDD\u5B58\u7684\u6A94\u6848");
		lblNewLabel_3.setBounds(30, 137, 362, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u6309\u4E0B\u958B\u59CB\u4F5C\u7B54\u5373\u53EF");
		lblNewLabel_4.setBounds(30, 87, 362, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u4E0A\u6B21\u4F5C\u7B54\u7684\u6A94\u6848\uFF0C\u5C07\u4EE5  \u540D\u5B57.txt  \u7684\u6A94\u6848\u4FDD\u5B58\u4E0B\u4F86");
		lblNewLabel_5.setBounds(28, 162, 364, 15);
		panel.add(lblNewLabel_5);
		
		
		btnNewButton.setBounds(238, 313, 132, 43);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setText("school id");
		textField.setBounds(79, 225, 313, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("name");
		textField_1.setBounds(79, 262, 313, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u5B78\u865F");
		lblNewLabel_6.setBounds(30, 228, 46, 15);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u540D\u5B57");
		lblNewLabel_7.setBounds(30, 265, 46, 15);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u51FA\u984C\u65B9\u5F0F\u53EF\u9078\u64C7\u96A8\u6A5F\u6216\u662F\u9806\u5E8F");
		lblNewLabel_8.setBounds(186, 87, 233, 15);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u8A2D\u5B9A\u5340\uFF1A");
		lblNewLabel_9.setBounds(420, 207, 76, 15);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u984C\u76EE\u4F86\u6E90\uFF1A");
		lblNewLabel_10.setBounds(443, 243, 76, 15);
		panel.add(lblNewLabel_10);
		
		textArea = new JTextArea();
		textArea.setBounds(529, 238, 188, 25);
		panel.add(textArea);
		
		JLabel lblNewLabel_11 = new JLabel("\u51FA\u5E7E\u984C\uFF1A");
		lblNewLabel_11.setBounds(443, 282, 63, 15);
		panel.add(lblNewLabel_11);
		
		textField_2 = new JTextField();
		textField_2.setBounds(528, 279, 188, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\u6CE8\u610F\uFF1A\u984C\u76EE\u61C9\u653E\u65BC\u8207\u7A0B\u5F0F\u76F8\u540C\u7684\u76EE\u9304\u4E0B");
		lblNewLabel_12.setBounds(449, 327, 267, 15);
		panel.add(lblNewLabel_12);

		
		
		btnNewButton_1.setBounds(40, 313, 121, 43);
		panel.add(btnNewButton_1);

		
		rdbtnNewRadioButton.setBounds(79, 183, 107, 23);
		panel.add(rdbtnNewRadioButton);
		
		
		rdbtnNewRadioButton_1.setBounds(195, 183, 107, 23);
		panel.add(rdbtnNewRadioButton_1);

		ButtonGroup group = new ButtonGroup(); // A button group we use in order to tight two radioButton.
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		/*
		JLabel lblNewLabel_8 = new JLabel("\u51FA\u984C\u65B9\u5F0F\u53EF\u9078\u64C7\u96A8\u6A5F\u6216\u662F\u9806\u5E8F");
		lblNewLabel_8.setBounds(159, 87, 233, 15);
		panel.add(lblNewLabel_8);*/

		btnNewButton.addActionListener(new ButtonListener()); // Register listener.
		btnNewButton_1.addActionListener(new ButtonListener()); // Register listener.
		rdbtnNewRadioButton.addActionListener(new ButtonListener()); // Register listener.
		rdbtnNewRadioButton_1.addActionListener(new ButtonListener()); // Register listener.
	}// end constructer ChooseApplet()

	// A class is responsible for action presentation.
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btnNewButton){
				JFileChooser fileChooser = new JFileChooser();
				if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					// Get the selected file
					java.io.File file = fileChooser.getSelectedFile();
					try {
						Scanner input = new Scanner(file); // Create a Scanner for the file
						// Read text from the file
						while (input.hasNext()) {
							System.out.println(input.nextLine());
						}
						input.close(); // Close the file
					} catch (FileNotFoundException e1) {
						e1.printStackTrace(); // To do Auto-generated catch block
					}		    				
				} else {
					System.out.println("No file selected");
				}// end inner if
			
			}else if(e.getSource() == btnNewButton_1){
				canOpenQuestionWindow();
				
			}else if(e.getSource() == rdbtnNewRadioButton){
				mode = 1; // Random mode

			}else if(e.getSource() == rdbtnNewRadioButton_1){
				mode = 2; // Sequence mode
			}else{
				System.out.println("A error occur for the class ButtonListener inside a method actionPerformed");
			}// end if
		}// end method actionPerformed

		public void canOpenQuestionWindow(){
			String check = null;
			String schoolNumber = String.valueOf(textField.getText());
			String name = String.valueOf(textField_1.getText()); 
			String fileQuestion = textArea.getText();
			String amount = textField_2.getText();
			if(schoolNumber.equals(check)){
				System.out.println("Checked.");
			}else if(name.equals(check)){
				System.out.println("Checked.");
			}else{
				System.out.println("Not Checked.");
				
				File file = new File(fileQuestion);
				if(file.exists()){
					try {
						frame.dispose();
						QuestionApplet a = new QuestionApplet(schoolNumber, name, mode, fileQuestion, amount);
						a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					} catch (Exception e) {
						frame.dispose();
						
					}
				}else{

				}
				
			}		
		}
	}// end inner class ButtonListener
}// end the public class ChooseApplet

class QuestionApplet extends JFrame { 
	static int capacityForInt = 0;
	static JLabel lblNewLabel_1; // A label for display school number.
	static JLabel lblNewLabel_3;  // A label for display name.
	static JLabel lblNewLabel_5; // A label for display the mode. Random or Sequence
	static JLabel lblNewLabel_10; // A label for display how many question for you answer.
	static JLabel lblNewLabel_13; // A label for display how many question that you have answered.
	static JLabel lblNewLabel_22; // A label for display the grade immediately.
	static JTextArea textArea; // A textfield will display a question from a file.
	static JTextArea textArea_1; // A textfield for user can input answer.
	static JTextArea textArea_2; // A textfield for display the condition of answering question.
	JButton btnNewButton = new JButton("\u4F5C\u7B54\u78BA\u8A8D\u9375"); // A check button.
	JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u984C"); // A next button.
	JButton btnNewButton_2 = new JButton("\u9032\u5165\u4F5C\u7B54\u89E3\u8AAA\u756B\u9762"); // A enter a review button.
	static int isNext = 0; // Judge the user whether click the next question button.
	static int isCheck = 1; // Judge the user whether click the check question button.
	static int chooseQuestion = 1;
	static int realCapacity = 0;
	static int setMode = 1; // 1 is random mode, 2 is sequence mode.
	static boolean end = false;
	static String fileName = "name.txt";
	static String realAmount;
	static String fileQuestionInUse = "exam1.txt";

	/**
	 * Create the applet.
	 */
	public QuestionApplet(String schoolNumber, String name, int mode, String fileQuestion, String amount){
		super("A Question window.");

		setFileQuestionInUse(fileQuestion);
		setAmount(amount);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5B78\u865F\uFF1A");
		lblNewLabel.setBounds(10, 6, 71, 22);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(schoolNumber);
		lblNewLabel_1.setBounds(77, 10, 170, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u540D\u5B57\uFF1A");
		lblNewLabel_2.setBounds(10, 38, 71, 15);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel(name);
		lblNewLabel_3.setBounds(77, 38, 185, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u51FA\u984C\u65B9\u5F0F\u5C07\u63A1\u7528");
		lblNewLabel_4.setBounds(10, 63, 147, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u9019\u88E1\u986F\u793A\u51FA\u984C\u6A21\u5F0F");
		lblNewLabel_5.setBounds(91, 88, 147, 15);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u984C\u76EE\u5340\uFF1A");
		lblNewLabel_6.setBounds(272, 10, 147, 15);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u7B54\u984C\u5340\uFF1A");
		lblNewLabel_7.setBounds(10, 274, 69, 15);
		panel.add(lblNewLabel_7);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 299, 787, 68);
		panel.add(textArea_1);
		
		
		btnNewButton.setBounds(640, 377, 157, 33);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("\u672C\u984C\u7D50\u679C\uFF1A");
		lblNewLabel_8.setBounds(10, 386, 134, 15);
		panel.add(lblNewLabel_8);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 414, 787, 129);
		panel.add(scrollPane);
		
		textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		scrollPane.setViewportView(textArea_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(272, 25, 525, 197);
		panel.add(scrollPane_1);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane_1.setViewportView(textArea);
		
		
		btnNewButton_1.setBounds(640, 553, 157, 33);
		panel.add(btnNewButton_1);
		
		
		btnNewButton_2.setBounds(10, 549, 147, 41);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("\u672C\u6B21\u6E2C\u9A57\u6709");
		lblNewLabel_9.setBounds(10, 113, 85, 15);
		panel.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel(getAmount());
		lblNewLabel_10.setBounds(91, 113, 115, 15);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u984C\u8981\u7B54");
		lblNewLabel_11.setBounds(201, 113, 46, 15);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u60A8\u5DF2\u7D93\u7B54\u4E86");
		lblNewLabel_12.setBounds(10, 138, 85, 15);
		panel.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("0");
		lblNewLabel_13.setBounds(91, 138, 123, 15);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u6CE8\u610F\uFF1A");
		lblNewLabel_14.setBounds(167, 553, 62, 15);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("\u7576\u60A8\u6309\u4E0B\u6B64\u9375\u6642\uFF0C\u4EE3\u8868\u60A8\u5DF2\u7D93\u505A\u7B54\u5B8C\u7562");
		lblNewLabel_15.setBounds(167, 571, 275, 15);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("\u5C07\u8DF3\u96E2\u6B64\u8996\u7A97\uFF0C\u8ACB\u78BA\u5B9A\u597D\u5DF2\u7D93\u7B54\u5B8C\u5F8C\u624D\u6309\u4E0B");
		lblNewLabel_16.setBounds(167, 587, 252, 15);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("\u4F5C\u7B54\u8AAA\u660E\uFF1A");
		lblNewLabel_17.setBounds(10, 224, 69, 15);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("\u65BC\u984C\u76EE\u5340\u770B\u5230\u984C\u76EE\u5F8C\uFF0C\u8ACB\u5C07\u60A8\u8A8D\u70BA\u7684\u7B54\u6848\u4F7F\u7528\u9375\u76E4\u8F38\u5165\u5728\u7B54\u984C\u5340\u5167\uFF0C\u82E5\u984C\u76EE\u70BA\u8907\u6578\u7A7A\u683C\u6642\uFF0C\u8ACB\u4EE5 , \u5206\u958B\u7B54\u6848\uFF0C\u4F8B\u5982\uFF1A\u897F\u74DC,\u767E\u9801\u8C46\u8150,\u82EF\u7532\u9178");
		lblNewLabel_18.setBounds(10, 249, 799, 15);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_21 = new JLabel("\u60A8\u73FE\u5728\u7684\u5206\u6578\u70BA\uFF1A");
		lblNewLabel_21.setBounds(10, 163, 123, 15);
		panel.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("\u9019\u88E1\u986F\u793A\u5206\u6578");
		lblNewLabel_22.setBounds(64, 188, 123, 15);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("\u984C");
		lblNewLabel_23.setBounds(224, 138, 34, 15);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("\u5206");
		lblNewLabel_24.setBounds(167, 188, 46, 15);
		panel.add(lblNewLabel_24);

		setSize(807,700);
		setVisible(true);

		setFileName(name); // set the file name.
		establishFile(getFileName()); // create a file which is written the qusetion and condition of answering question.
		

		Date day = new Date(); // A Date object is created, and the object name is day. 
		String day1 = day.toString(); // "day" can invoke a method toString() will get a current time string.
		StringBuilder stringBuilderForConnectFileName = new StringBuilder();
		stringBuilderForConnectFileName.append("school id: " + schoolNumber + " name is: " + name + "\r\n");
		stringBuilderForConnectFileName.append("The time starts quiz is: " + day1);
		String initialization = new String(stringBuilderForConnectFileName);
		requireFileWriteData(getFileName(), initialization);

		if(mode == 1){
			lblNewLabel_5.setText("Random mode");
			setMode = 1;
			try {
				setCapacity();
				chooseQuestion = (int)(Math.random() * capacityForInt) + 1; // choose a question for random.
				while(chooseQuestion == 0) {
					chooseQuestion = (int)(Math.random() * capacityForInt);
				}
				handleQuestion test1 = new handleQuestion();
				textArea.setText(test1.giveQuestion(chooseQuestion, getFileQuestionInUse()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(mode == 2){
			lblNewLabel_5.setText("Sequence mode");
			setMode = 2;
			try {
				setCapacity();

				handleQuestion test1 = new handleQuestion();
				textArea.setText(test1.giveQuestion(chooseQuestion, getFileQuestionInUse()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			lblNewLabel_5.setText("No mode");
			setMode = 1;
		}

		btnNewButton.addActionListener(new ButtonListener()); // Register listener.
		btnNewButton_1.addActionListener(new ButtonListener()); // Register listener.
		btnNewButton_2.addActionListener(new ButtonListener()); // Register listener.
	}// end constructer (String schoolNumber, String name, int mode)

	public void setCapacity() throws Exception{
		java.io.File file = new java.io.File("capacity.txt"); // A file use to tell the program how many question do we have.
		if (file.exists()) {
			Scanner input = new Scanner(file);
			
			String capacityForString = " ";
			while (input.hasNext()) {
				capacityForString = input.next(); // Read items
			}
			capacityForInt = Integer.parseInt(capacityForString); // String to integer.
			realCapacity = capacityForInt;
			input.close(); // Close the file.		
		} else {
			dispose();
		}	
	}// end method setCapacity()

	public int getCapacity(){
		return realCapacity;
	} // store the number how many question.

	public static boolean checkCapacity(int compare){
		return compare <= realCapacity;
	} // No matter the random or sequence mode maybe out of range(the total number of question), so we check.

	public int getRandom(){
		int useCapacity = getCapacity();
		int whichQuestion = (int)(Math.random() * useCapacity) + 1; // choose a question for random.
		while(chooseQuestion == 0) {
			chooseQuestion = (int)(Math.random() * useCapacity);
		}
		setChooseQuestion(whichQuestion);
		return chooseQuestion;
	}// work for random a number.

	public void setChooseQuestion(int newChoose){
		chooseQuestion = newChoose;
	}// set the question number.

	public static void setFileName(String newFileName){
		StringBuilder stringBuilderForConnectFileName = new StringBuilder();
		stringBuilderForConnectFileName.append(newFileName + ".txt");
		fileName = new String(stringBuilderForConnectFileName);
	}// set the file name.

	public static String getFileName(){
		return fileName;
	}// get the file name.

	static void establishFile(String fileName){
		File file = new File(fileName);
		if(!file.exists()){
			try {
				file.createNewFile(); // create a file and the file name is required by the method's parameter.

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			
		}
	}// end method establishFile.

	static void requireFileWriteData(String fileName, String data1){

			FileWriter fw = null;

			try{
				fw = new FileWriter(fileName, true); // true: does not overwrite the previous contents.
				fw.write(data1 + "\r\n");
			}// end try
			catch(IOException e) {}
			finally {
				try {
					fw.close();
				}// end try

				catch(IOException e) {}
			}// end finally
	}// end method requireFileWriteData.

	static String connectStringForInputFile(String question, String condition){
		StringBuilder stringBuilderForConnectStringForInput = new StringBuilder();
		stringBuilderForConnectStringForInput.append(question + "\r\n" + condition);
		String readyInputTofile = new String(stringBuilderForConnectStringForInput);
		return readyInputTofile;
	}// end method connectStringForInputFile.

	static void setAmount(String newAmount){
		realAmount = newAmount;
	}

	static String getAmount(){
		return realAmount;
	}

	static void setFileQuestionInUse(String newQuestionFile){
		fileQuestionInUse = newQuestionFile;
	}

	static String getFileQuestionInUse(){
		return fileQuestionInUse;
	}

	static void recordNumberOfQuestionAnswered(){
		String oldRemainQuestion = lblNewLabel_13.getText();
		int oldRemainQuestionForInt = Integer.parseInt(oldRemainQuestion);
		oldRemainQuestionForInt = oldRemainQuestionForInt + 1;
		String newRemainQuestion = String.valueOf(oldRemainQuestionForInt);
		
		lblNewLabel_13.setText(newRemainQuestion);
	}

	// A class is responsible for action presentation.
	private class ButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btnNewButton){
				if(isCheck == 1){
					System.out.println("you check the answer.");
					System.out.println("Now you click the next button");
					isNext = 1;
					isCheck = 0;

					handleQuestion test1 = new handleQuestion();
					String userAnswer = textArea_1.getText();
					String[] alreadyUserAnswer = test1.handleAnswer(userAnswer);
					
					String answer = test1.getAnswerString();
					String[] alreadyAnswer = test1.handleAnswer(answer);
					
					String result = test1.correspondAnswer(alreadyAnswer, alreadyUserAnswer);
					textArea_2.setText(result);
					lblNewLabel_22.setText(test1.getGrade());


				}else{
					System.out.println("You cannot click the check answer button, because you have checked.");					
				}
			}else if(e.getSource() == btnNewButton_1){
				if(end){

				}else{
					if(isNext == 1){
						handleQuestion test1 = new handleQuestion();
						String combinatedString = connectStringForInputFile(test1.getFileInputQuestion(), textArea_2.getText());
						requireFileWriteData(getFileName(), combinatedString);
						System.out.println("you check the next button");
						System.out.println("Now you answer the next question.");
						recordNumberOfQuestionAnswered();
						String checkAmount = getAmount();
						String checkRemain = lblNewLabel_13.getText();

						if(setMode == 1){
							if(checkAmount.equals(checkRemain)){
								String gradeForInputInFile = connectStringForInputFile("Finally, you get ",test1.getGrade());
								requireFileWriteData(getFileName(), gradeForInputInFile);
								textArea.setText("All question have answered");
								textArea_1.setText("Please click the analysis button.");
								textArea_2.setText("Please click the analysis button.");
								end = true;
							}else{
								textArea.setText(test1.giveQuestion(getRandom(), getFileQuestionInUse()));
								textArea_1.setText("");
								textArea_2.setText("");
								isNext = 0;
								isCheck = 1;
							}							
						}else if(setMode == 2){						
							chooseQuestion = chooseQuestion + 1;
							if(checkAmount.equals(checkRemain)){
								String gradeForInputInFile = connectStringForInputFile("Finally, you get ",test1.getGrade());
								requireFileWriteData(getFileName(), gradeForInputInFile);
								textArea.setText("All question have answered");
								textArea_1.setText("Please click the analysis button.");
								textArea_2.setText("Please click the analysis button.");
								end = true;							
							}else{					
								textArea.setText(test1.giveQuestion(chooseQuestion, getFileQuestionInUse()));
								textArea_1.setText("");
								textArea_2.setText("");
								isNext = 0;
								isCheck = 1;
							}
						
						}else{
							System.out.println("A error occur for setMode choose.");
						} // end if for mode(sequence or random)		
					}else{
						System.out.println("You cannot click the next button, because you havenot answer the question.");		
					}// end if for whether the next button can click or not.
				} // end if for whether all questions have answered.	
			}else if(e.getSource() == btnNewButton_2){

			}else{
				System.out.println("A error occur for the class ButtonListener inside a method actionPerformed");
			}
		}
	}
}

/**
 *  The class handleQuestion will take responsible for Question and answer.
 *		Have the following method.
 *			1.	giveQuestion	Read the file, and return a question which program requires.
 *			2.	handleAnswer    For the answer split, and return a string array.
 *			3.	setFileInputQuestion	Set a question string for input to a file.
 *			4.	getFileInputQuestion	Get a question string for input to a file.
 *			5.	setGradeString	Set a grade string.
 *			6.	getGradeString	Get a grade string when the correspondAnswer method called.
 *			7.	setAnswerString	Set a answer string.
 *			8.	getAnswerString	Get a answer string when the correspondAnswer method called.
 *			9.	setGrade  Set the user currently grade.
 *			10.	getGrade  Get the user currently grade.
 *			11.	correspondAnswer	The method will gain two array(One is answer, another is user answer),
 *									and return a string for the condition of answering question.
 *		Have the following variable.
 *			1.	gradeString		Read the file, spilt by the @, hold the question every blank's grade.
 *			2.	stringForAnswer Read the file, spilt by the #, hold the question every blank's answer.
 *			3.	wholeQuestion	Read the file, it will store to a file when the question that user answer.
 *			4.	grade           When the user qnswer, the variable will record the grade, it will display on a JLabel.
 *
 *
 */
class handleQuestion{
	private static String gradeString = "";
	private static String stringForAnswer = "";
	private static String wholeQuestion = "";
	private static String grade = "0";
	handleQuestion(){

	}

	public static String giveQuestion(int number, String fileQuestion){

		String question = "";
		String connectQuestion = ""; 
		
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileQuestion); // A file holds the question.
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
					stringBuilderForQuestion.append(data + "\r\n"); // connect the long question.
				}
			}
			String[] splitForGrade = question.split("@");

			setGradeString(splitForGrade[1]); 

			setFileInputQuestion(splitForGrade[0]);

			String[] splitForAnswer = splitForGrade[0].split("#");
			/*
			for(int i = 0; i < splitForAnswer.length; i++){
				System.out.println("splitForAnswer[" + i + "] is " + splitForAnswer[i]);
			}*/

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
			setAnswerString(new String(stringBuilderForAnswer)); // connect the answer.

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

	public static void setFileInputQuestion(String input){
		wholeQuestion = input;
	}

	public static String getFileInputQuestion(){
		return wholeQuestion;
	}

	public static void setGradeString(String newGradeString){
		gradeString = newGradeString;
	}

	public static String getGradeString(){
		return gradeString;
	}

	public static void setAnswerString(String newAnswerString){
		stringForAnswer = newAnswerString;
	}

	public String getAnswerString(){
		return stringForAnswer;
	}

	static String[] handleAnswer(String needSeparate){
		String[] firstHandleAnswer = needSeparate.split(","); // First we use , to devide the every blank answer.
		return firstHandleAnswer;
	}// end method handleAnswer

	static String correspondAnswer(String[] correctAnswer, String[] userAnswer){
		/**
		 *	A case: when user answer is not enougth. 
		 *			We should fill the lack of blank.(fill by "null")
		 *
		 */
		String[] methodUseUserAnswer = new String[correctAnswer.length];
		int max = userAnswer.length - 1;
		for(int i = 0; i < correctAnswer.length; i++){
			if(i > max){
				methodUseUserAnswer[i] = "null"; // the lack of blank filled by null
			}else{
				methodUseUserAnswer[i] = userAnswer[i];
			}		
		}
		
		String[] gradeArray = getGradeString().split(","); // Use the grade string, and ready to give point.
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
					stringBuilderForResult.append("Your answer " + methodUseUserAnswer[count] + " in the " + blank + " is correct." + "\r\n");
					innerGrade = innerGrade + gradeIntArray[count];
				}
				innerCount = innerCount + 1;
			}

			if(isCorrect == false){
				stringBuilderForResult.append("Your answer " + methodUseUserAnswer[count] + " in the " + blank + " is wrong." + "\r\n");
			}
			count = count + 1; // Control the answer array.
			blank = blank + 1; // Variable for which one blank.
		}

		setGrade(innerGrade);
		String stringForResult = new String(stringBuilderForResult); // Convert to string.
		return stringForResult;
	}// end method correspondAnswer

	public static void setGrade(int grade1){
		int oldGrade = Integer.parseInt(grade);
		int newGrade = oldGrade + grade1;
		grade = String.valueOf(newGrade);
	}// end method setGrade

	public String getGrade(){
		return grade;
	}// end method getGrade
}// end class handleQuestion
