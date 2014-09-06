import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import javax.swing.ScrollPaneConstants;


public class QuestionApplet extends JApplet {

	/**
	 * Create the applet.
	 */
	public QuestionApplet() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5B78\u865F\uFF1A");
		lblNewLabel.setBounds(10, 6, 71, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5C07\u6703\u88AB\u50B3\u5165\u5B78\u865F");
		lblNewLabel_1.setBounds(77, 10, 170, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u540D\u5B57\uFF1A");
		lblNewLabel_2.setBounds(10, 38, 71, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5C07\u6703\u88AB\u50B3\u5165\u540D\u5B57");
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
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 299, 787, 68);
		panel.add(textArea_1);
		
		JButton btnNewButton = new JButton("\u4F5C\u7B54\u78BA\u8A8D\u9375");
		btnNewButton.setBounds(640, 377, 157, 33);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("\u672C\u984C\u7D50\u679C\uFF1A");
		lblNewLabel_8.setBounds(10, 386, 134, 15);
		panel.add(lblNewLabel_8);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 414, 787, 129);
		panel.add(scrollPane);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		scrollPane.setViewportView(textArea_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(272, 25, 525, 197);
		panel.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane_1.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton("\u4E0B\u4E00\u984C");
		btnNewButton_1.setBounds(640, 553, 157, 33);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u9032\u5165\u4F5C\u7B54\u89E3\u8AAA\u756B\u9762");
		btnNewButton_2.setBounds(10, 549, 147, 41);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("\u672C\u6B21\u6E2C\u9A57\u6709");
		lblNewLabel_9.setBounds(10, 113, 85, 15);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u9019\u88E1\u986F\u793A\u984C\u6578");
		lblNewLabel_10.setBounds(91, 113, 115, 15);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u984C\u8981\u7B54");
		lblNewLabel_11.setBounds(201, 113, 46, 15);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u60A8\u5DF2\u7D93\u7B54\u4E86");
		lblNewLabel_12.setBounds(10, 138, 85, 15);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\u9019\u88E1\u986F\u793A\u7B54\u7684\u6578\u91CF");
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
		
		JLabel lblNewLabel_22 = new JLabel("\u9019\u88E1\u986F\u793A\u5206\u6578");
		lblNewLabel_22.setBounds(64, 188, 123, 15);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("\u984C");
		lblNewLabel_23.setBounds(224, 138, 34, 15);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("\u5206");
		lblNewLabel_24.setBounds(167, 188, 46, 15);
		panel.add(lblNewLabel_24);

	}
}
