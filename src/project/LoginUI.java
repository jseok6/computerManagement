package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop.Action;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.*;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.*;
public class LoginUI extends JFrame {

	static int axx = 0;
	static String name;
	private JPanel contentPane;
	private JTextField id;
	private JPasswordField pw;
	static ArrayList<String> login_list = new ArrayList<String>();
	static byte readBuffer[];  
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String file = "login.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file) );
					String line;
		            while ((line = br.readLine()) != null) {
		            	login_list.add(line); 
		            }
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setVisible(true);
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		ImageIcon icon2 = new ImageIcon(
				LoginUI.class.getResource("/image/ma.png") );
				JLabel imgLbl2 = new JLabel();
				imgLbl2.setIcon(icon2);
				imgLbl2.setBounds(110, 50, 200, 200);
				imgLbl2.setHorizontalAlignment(JLabel.CENTER);
				panel.add(imgLbl2); 
		
		id = new JTextField("");
		id.setToolTipText("아이디");
		id.setBounds(110, 270, 199, 29);
		panel.add(id);
		id.setColumns(10);
		
		
		pw = new JPasswordField();
		pw.setBounds(110, 309, 199, 29);
		pw.setEchoChar('*'); // 출력단어 *로 표시
		panel.add(pw);
		
		JButton login = new JButton("\uB85C\uADF8\uC778");
		login.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		login.setForeground(new Color(255, 255, 255));
		login.setBackground(new Color(0, 0, 0));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(readBuffer.length); 
				
				for(int i = 0; i < login_list.size();i++) {
					String a = login_list.get(i).split(" ")[0];
					String b = login_list.get(i).split(" ")[1]; 
					if( id.getText() .equals(a)   && pw.getText().equals(b)  ) {
						JOptionPane.showMessageDialog(null, "반갑습니다  "+ login_list.get(i).split(" ")[2]+"  님"); 
						
						name = login_list.get(i).split(" ")[2];
						if( login_list.get(i).split(" ")[3].equals("buy")) {
							new Customer();  
						}
						if( login_list.get(i).split(" ")[3].equals("sell")) {
							new seller();   
						}
						setVisible(false);
						return;
					} 
				}
				JOptionPane.showMessageDialog(null, "존재하지 않는 아이디랑 비밀번호입니다"); 
			}
		});
		login.setBounds(110, 366, 97, 23);
		panel.add(login);
		
		JButton register = new JButton("\uD68C\uC6D0\uAC00\uC785");
		register.setForeground(new Color(255, 255, 255));
		register.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		register.setBackground(new Color(0, 0, 0));
		register.setBounds(212, 366, 97, 23);
		panel.add(register);
	}

}
