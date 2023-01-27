package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class RegisterUI extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JTextField pwField;
	private JTextField nameField;
	private JTextField phoneField;
	private JTextField addField;
	private JLabel idLabel;
	private JLabel pwLabel;
	private JLabel nameLabel;
	private JLabel phoneLabel;
	private JLabel addLabel;
	private JLabel mainLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUI frame = new RegisterUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterUI() {
		setTitle("\uD68C\uC6D0\uAC00\uC785");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		idField = new JTextField();
		idField.setBounds(137, 153, 180, 21);
		panel.add(idField);
		idField.setColumns(10);
		
		pwField = new JTextField();
		pwField.setBounds(137, 197, 180, 21);
		panel.add(pwField);
		pwField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setBounds(137, 245, 180, 21);
		panel.add(nameField);
		nameField.setColumns(10);
		
		phoneField = new JTextField();
		phoneField.setBounds(137, 296, 180, 21);
		panel.add(phoneField);
		phoneField.setColumns(10);
		
		addField = new JTextField();
		addField.setBounds(137, 348, 180, 21);
		panel.add(addField);
		addField.setColumns(10);
		
		JButton account = new JButton("\uAC00\uC785\uD558\uAE30");
		account.setForeground(new Color(255, 255, 255));
		account.setBackground(new Color(0, 0, 0));
		account.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		account.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		account.setBounds(106, 417, 97, 23);
		panel.add(account); 
		JButton cancle = new JButton("\uCDE8\uC18C");
		cancle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		cancle.setForeground(new Color(255, 255, 255));
		cancle.setBackground(new Color(0, 0, 0));
		cancle.setBounds(264, 417, 97, 23);
		panel.add(cancle);
		
		idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		idLabel.setBounds(137, 137, 57, 15);
		panel.add(idLabel);
		
		pwLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		pwLabel.setBounds(137, 182, 57, 15);
		panel.add(pwLabel);
		
		nameLabel = new JLabel("\uC774\uB984");
		nameLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		nameLabel.setBounds(137, 228, 57, 15);
		panel.add(nameLabel);
		
		phoneLabel = new JLabel("\uC804\uD654\uBC88\uD638");
		phoneLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		phoneLabel.setBounds(137, 281, 57, 15);
		panel.add(phoneLabel);
		
		addLabel = new JLabel("\uC8FC\uC18C");
		addLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		addLabel.setBounds(137, 332, 57, 15);
		panel.add(addLabel);
		
		mainLabel = new JLabel("\uCEF4\uD4E8\uD130 \uBA54\uC774\uCEE4");
		mainLabel.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 40));
		mainLabel.setBounds(117, 42, 280, 58);
		panel.add(mainLabel);
	}

}
