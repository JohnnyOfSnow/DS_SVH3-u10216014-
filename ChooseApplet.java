import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.Scanner; 
import javax.swing.JFileChooser;
import java.awt.event.*;
import java.io.FileNotFoundException;


public class ChooseApplet extends JApplet {
	private JTextField textField;
	private JTextField textField_1;
	JButton btnNewButton = new JButton("\u4E0A\u6B21\u4F5C\u7B54\u89E3\u8AAA");
	JButton btnNewButton_1 = new JButton("\u958B\u59CB\u4F5C\u7B54");
	
	// In order to run standalone as a standalone application, we add the main method.
	public static void main(String[] args) {
		// Create a frame.
		JFrame frame = new JFrame("A choice window.");
		// Create an instance of the applet.
		ChooseApplet applet = new ChooseApplet();
		// Add the applet to the frame.
		frame.add(applet);
		// Display the frame.
		frame.setSize(419,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	// Owing to Applet life-cycle, the method will automatically be invoked.
	public void init(){
		resize(419,400); // Set the applet size, or the window is too small initially.
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
		lblNewLabel_1.setBounds(20, 59, 372, 30);
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
		textField.setBounds(79, 225, 313, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 262, 313, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u5B78\u865F");
		lblNewLabel_6.setBounds(30, 228, 46, 15);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u540D\u5B57");
		lblNewLabel_7.setBounds(30, 265, 46, 15);
		panel.add(lblNewLabel_7);
		
		
		btnNewButton_1.setBounds(40, 313, 121, 43);
		panel.add(btnNewButton_1);

		btnNewButton.addActionListener(new ButtonListener()); // Register listener.
		btnNewButton_1.addActionListener(new ButtonListener()); // Register listener.

	}

	// A class is responsible for action presentation.
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btnNewButton){
				JFileChooser fileChooser = new JFileChooser();
    			if (fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION) {
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
    			}
    			else {
      				System.out.println("No file selected");
    			}// end inner if
			}else if(e.getSource() == btnNewButton_1){
				
			}else{
				System.out.println("A error occur for the class ButtonListener inside a method actionPerformed");
			}// end if
		}// end method actionPerformed
	}// end inner class ButtonListener
}// end the public class ChooseApplet
