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
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
public class seller extends JFrame {

	static int axx = 0; 
	private JPanel contentPane;
	private JTextField id; 
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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	static JTextField pro;
	static JTextField name;
	static JTextField cash;
	static JTextField im;
	public seller() {  
		setVisible(true);
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel mainlogo = new JLabel("");
		mainlogo.setIcon(new ImageIcon("C:\\Users\\\uB3D9\uD3EC\\Desktop\\images.png"));
		mainlogo.setBounds(94, 10, 225, 235);
		panel.add(mainlogo);
		
		/*id = new JTextField("");
		id.setToolTipText("���̵�");
		id.setBounds(110, 270, 199, 29);
		panel.add(id);
		id.setColumns(10);*/
		
		
	 
		
		JButton get = new JButton("��ǰ��ȸ");
		get.setFont(new Font("���� ���", Font.BOLD, 14));
		get.setForeground(new Color(255, 255, 255));
		get.setBackground(new Color(0, 0, 0));
		get.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
			}
		});
		get.setBounds(110, 50, 200, 23);
		panel.add(get);
		
		JButton regist = new JButton("��ǰ���");
		regist.setForeground(new Color(255, 255, 255));
		regist.setFont(new Font("���� ���", Font.BOLD, 14));
		regist.setBackground(new Color(0, 0, 0));
		regist.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { 
			
			    JLabel a = new JLabel("����");
		        a.setFont(new Font("���� ���", Font.PLAIN, 20));
		        a.setBounds(450, 50, 100, 30);
				panel.add(a);
				pro = new JTextField();
				pro = new JTextField("cpu");
				pro.setToolTipText("���̵�");
				pro.setBounds(510, 50, 199, 29);
				panel.add(pro);
				
				JLabel b = new JLabel("�̸�");
		        b.setFont(new Font("���� ���", Font.PLAIN, 20));
		        b.setBounds(450, 100, 100, 30);
				panel.add(b);
				name = new JTextField();
				name = new JTextField("����_�ھ�i5-10����_10400)");
				name.setColumns(10);
				name.setBounds(510, 100, 199, 29);
				panel.add(name);
				
				JLabel c = new JLabel("����");
		        c.setFont(new Font("���� ���", Font.PLAIN, 20));
		        c.setBounds(450, 150, 100, 30);
				panel.add(c);
				cash = new JTextField();
				cash.setColumns(10);
				cash = new JTextField("198180");
				cash.setBounds(510, 150, 199, 29);
				panel.add(cash); 
				
				JLabel d = new JLabel("�̹������");
		        d.setFont(new Font("���� ���", Font.PLAIN, 20));
		        d.setBounds(400, 200, 100, 30);
				panel.add(d);
				im = new JTextField();
				im.setColumns(10);
				im = new JTextField("ex");
				im.setBounds(510, 200, 199, 29);
				panel.add(im); 
				
				JButton res = new JButton("���");
				res.setForeground(new Color(255, 255, 255));
				res.setFont(new Font("���� ���", Font.BOLD, 14));
				res.setBackground(new Color(0, 0, 0));
				res.setBounds(550, 250, 80, 80);
				res.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String filePath = "product.txt";

				        File file = new File(filePath); // File��ü ���� 
				        	try{ 
				    			// true ������ ������ ���� ���뿡 �̾ �ۼ�
				    			FileWriter fw = new FileWriter(file, true) ;
				    			 
				    			fw.write("\n"+pro.getText()+" "+name.getText()+" "+cash.getText()+" "+im.getText() );
				    			JOptionPane.showMessageDialog(null, name.getText()+ " �� ����߽��ϴ�"); 
				    			// ���Ͼȿ� ���ڿ� ����
				    			//fw.write("ab");
				    			fw.flush(); 
				    			// ��ü �ݱ�
				    			fw.close(); 
				    			
				    			
				    		}catch(Exception x){
				    			x.printStackTrace();
				    		} 
						
					}
				        
			  
				});
				panel.add(res);
				
				contentPane.revalidate();
				contentPane.repaint(); 
			}
		});
		regist.setBounds(110, 100, 200, 23);
		panel.add(regist);
		
		JButton cash = new JButton("������ȸ");
		cash.setForeground(new Color(255, 255, 255));
		cash.setFont(new Font("���� ���", Font.BOLD, 14));
		cash.setBackground(new Color(0, 0, 0));
		cash.setBounds(110, 150, 200, 23);
		panel.add(cash);
		
		JButton modi = new JButton("��ǰ����");
		modi.setForeground(new Color(255, 255, 255));
		modi.setFont(new Font("���� ���", Font.BOLD, 14));
		modi.setBackground(new Color(0, 0, 0));
		modi.setBounds(110,200 , 200, 23);
		panel.add(modi);
		
		JButton del = new JButton("��ǰ����");
		del.setForeground(new Color(255, 255, 255));
		del.setFont(new Font("���� ���", Font.BOLD, 14));
		del.setBackground(new Color(0, 0, 0));
		del.setBounds(110,250 , 200, 23);
		panel.add(del);
		
		JButton log = new JButton("�α���ȭ��");
		log.setForeground(new Color(255, 255, 255));
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginUI(); 
				setVisible(false);
			}
		});
		log.setFont(new Font("���� ���", Font.BOLD, 14));
		log.setBackground(new Color(0, 0, 0));
		log.setBounds(110,300 , 200, 23);
		panel.add(log);
	}

}
