import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;


public class MutiQuestion extends JApplet {

	/**
	 * Create the applet.
	 */
	public MutiQuestion() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u9019\u662F\u4E00\u500B\u6703\u63D0\u554F\u984C\u7684\u7A0B\u5F0F");
		lblNewLabel.setBounds(10, 10, 189, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u984C\u76EE\u5340\u5C07\u6703\u51FA\u73FE\u984C\u76EE\uFF0C\u6839\u64DA\u984C\u76EE\u8F38\u5165\u4F60\u7684\u7B54\u6848");
		lblNewLabel_1.setBounds(10, 25, 332, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u9019\u88E1\u8981\u986F\u793A\u540D\u5B57");
		lblNewLabel_2.setBounds(10, 61, 152, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u51FA\u984C\u65B9\u5F0F\uFF1A");
		lblNewLabel_3.setBounds(10, 86, 67, 15);
		panel.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u5FAA\u5E8F\u51FA\u984C");
		rdbtnNewRadioButton.setBounds(83, 82, 107, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u96A8\u6A5F\u51FA\u984C");
		rdbtnNewRadioButton_1.setBounds(83, 107, 107, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("\u9019\u88E1\u8981\u986F\u793A\u7B2C\u5E7E\u984C");
		lblNewLabel_4.setBounds(10, 163, 118, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u9019\u88E1\u8981\u986F\u793A\u9084\u6709\u5E7E\u984C\u8981\u7B54");
		lblNewLabel_5.setBounds(10, 188, 180, 15);
		panel.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("\u9019\u88E1\u8981\u986F\u793A\u984C\u76EE");
		textArea.setBounds(10, 213, 332, 192);
		panel.add(textArea);
		
		JLabel lblNewLabel_6 = new JLabel("\u4F60\u7684\u7B54\u6848\uFF0C\u61C9\u4F5C\u7B54\u65BC\u4E0B\u65B9\u7A7A\u683C");
		lblNewLabel_6.setBounds(378, 10, 189, 15);
		panel.add(lblNewLabel_6);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(378, 56, 332, 133);
		panel.add(textArea_1);
		
		JLabel lblNewLabel_7 = new JLabel("\u7576\u984C\u4F5C\u7B54\u7D50\u679C");
		lblNewLabel_7.setBounds(378, 230, 152, 15);
		panel.add(lblNewLabel_7);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText("\u9019\u88E1\u8981\u80FD\u986F\u793A\u4F5C\u7B54\u7D50\u679C");
		textArea_2.setEditable(false);
		textArea_2.setBounds(378, 255, 332, 162);
		panel.add(textArea_2);
		
		JButton btnNewButton = new JButton("\u63D0\u4EA4\u7B54\u6848");
		btnNewButton.setBounds(564, 195, 146, 31);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u984C");
		btnNewButton_1.setBounds(564, 427, 146, 31);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u9032\u5165\u4F5C\u7B54\u5206\u6790");
		btnNewButton_2.setBounds(10, 419, 144, 47);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("\u6CE8\u610F\uFF1A\u7576\u4F60\u6309\u4E0B\u6B64\u6309\u9215\u6642\uFF0C\u8868\u793A\u4F60\u5DF2\u7D93\u4F5C\u7B54\u5B8C\u7562");
		lblNewLabel_8.setBounds(10, 476, 317, 15);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u6B64\u9801\u9762\u5C07\u95DC\u9589\uFF0C\u4E0D\u53EF\u8FD4\u56DE\u3002");
		lblNewLabel_9.setBounds(275, 476, 180, 15);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u73FE\u5728\u5F97\u5206\uFF1A");
		lblNewLabel_10.setBounds(196, 86, 96, 15);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u9019\u88E1\u8981\u986F\u793A\u5206\u6578");
		lblNewLabel_11.setBounds(196, 111, 96, 31);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u5206");
		lblNewLabel_12.setBounds(306, 119, 46, 15);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u82E5\u984C\u76EE\u67092\u683C\uFF0C\u4F60\u7684\u7B54\u6848\u70BA\u9999\u8178\u4EE5\u53CA\u71B1\u72D7\uFF0C\u8ACB\u8F38\u5165 \u9999\u8178-\u71B1\u72D7  \u65BC\u4E0B\u65B9\u7A7A\u683C");
		lblNewLabel_13.setBounds(378, 31, 389, 15);
		panel.add(lblNewLabel_13);

	}
}
