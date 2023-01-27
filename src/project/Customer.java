package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLayeredPane;
import java.io.*;
import java.util.*;
public class Customer extends JFrame {

	static JButton pre;
	static BasketUI bsk;
	static JLabel now;
	static JPanel  panel;
	static int page = 0; 
	private JPanel contentPane;
	private JTextField searchField;
	static ArrayList<String> product_list = new ArrayList<String>();
	/**
	 * Launch the application.
	 */
	static  File file;
	public static void sum(int n) {
		  String filePath = LoginUI.name+".txt";

	        file = new File(filePath); // File��ü ���� 
	        	try{ 
	    			// true ������ ������ ���� ���뿡 �̾ �ۼ�
	    			FileWriter fw = new FileWriter(file, true) ;
	    			
	    			fw.write(product_list.get(page*5+n)+"\n");
	    			JOptionPane.showMessageDialog(null, product_list.get(page*5+n).split(" ")[1] + "�� ��ҽ��ϴ�"); 
	    			// ���Ͼȿ� ���ڿ� ����
	    			//fw.write("ab");
	    			fw.flush(); 
	    			// ��ü �ݱ�
	    			fw.close(); 
	    			
	    			
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		} 
	        
 
	        
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					Customer frame = new Customer();
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
	public Customer() { 
		product_list.clear();
		try {
			String file = "product.txt";						
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
            while ((line = br.readLine()) != null) {
            product_list.add(line); 
            }
            
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(77, 133, 713, 34);
		panel.add(searchField);
		searchField.setColumns(10);
		
		
		
		
		
		
		
		
		
		String ex = product_list.get(page);
		
		ImageIcon icon = new ImageIcon(
	    Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg")
	    );
		JLabel imgLbl = new JLabel();
		imgLbl.setIcon(icon);
		imgLbl.setBounds(70, 150, 150, 150);
        imgLbl.setHorizontalAlignment(JLabel.CENTER);
        panel.add(imgLbl); 
        
        
        String[] array = ex.split(" ");
        
        JLabel pwLabel = new JLabel(array[1]);
        
        JLabel pwLabela = new JLabel(array[2]+"��");
        pwLabela.setFont(new Font("���� ���", Font.PLAIN, 20));
        pwLabela.setBounds(870, 210, 400, 30);
		panel.add(pwLabela);
		
		pwLabel.setFont(new Font("���� ���", Font.PLAIN, 20));
		pwLabel.setBounds(280, 200, 400, 30);
		panel.add(pwLabel);
		JButton get1 = new JButton("���");
		get1.setFont(new Font("���� ���", Font.PLAIN, 13));
		get1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(0);
			}
		});
		get1.setBounds(800, 200, 60, 60);
		panel.add(get1);
		
		ex = product_list.get(page+1);
		ImageIcon icon2 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl2 = new JLabel();
		imgLbl2.setIcon(icon2);
		imgLbl2.setBounds(70, 250, 150, 150);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl2); 
		
		String[] array1 = ex.split(" ");
        JLabel pwLabel2 = new JLabel(array1[1]);
		pwLabel2.setFont(new Font("���� ���", Font.PLAIN, 20));
		pwLabel2.setBounds(280, 300, 400, 30);
		panel.add(pwLabel2);
		JLabel pwLabelb = new JLabel(array1[2]+"��");
	    pwLabelb.setFont(new Font("���� ���", Font.PLAIN, 20));
	    pwLabelb.setBounds(870, 310, 400, 30);
		panel.add(pwLabelb);
		JButton get2 = new JButton("���");
		get2.setFont(new Font("���� ���", Font.PLAIN, 13));
		get2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(1);
			}
		});
		get2.setBounds(800, 300, 60, 60);
		panel.add(get2);
		
		
		ex = product_list.get(page+2);
		ImageIcon icon3 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl3 = new JLabel();
		imgLbl3.setIcon(icon3);
		imgLbl3.setBounds(70, 350, 150, 150);
		imgLbl3.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl3); 
		String[] array2 = ex.split(" ");
        JLabel pwLabel3 = new JLabel(array2[1]);
		pwLabel3.setFont(new Font("���� ���", Font.PLAIN, 20));
		pwLabel3.setBounds(280, 400, 400, 30);
		panel.add(pwLabel3);
		JLabel pwLabelc = new JLabel(array2[2]+"��");
	    pwLabelc.setFont(new Font("���� ���", Font.PLAIN, 20));
	    pwLabelc.setBounds(870, 410, 400, 30);
		panel.add(pwLabelc);
		JButton get3 = new JButton("���");
		get3.setFont(new Font("���� ���", Font.PLAIN, 13));
		get3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum(2);
					}
				}); 
		get3.setBounds(800, 400, 60, 60);
		panel.add(get3);
		
		
		
		ex = product_list.get(page+3);
		ImageIcon icon4 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl4 = new JLabel();
		imgLbl4.setIcon(icon4);
		imgLbl4.setBounds(70, 450, 150, 150);
		imgLbl4.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl4); 
		String[] array3 = ex.split(" ");
        JLabel pwLabel4 = new JLabel(array3[1]);
		pwLabel4.setFont(new Font("���� ���", Font.PLAIN, 20));
		pwLabel4.setBounds(280, 500, 400, 30);
		panel.add(pwLabel4);
		JButton get4 = new JButton("���");
		get4.setFont(new Font("���� ���", Font.PLAIN, 13));
		get4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(3);
							}
						}); 	
		JLabel pwLabeld = new JLabel(array3[2]+"��");
	    pwLabeld.setFont(new Font("���� ���", Font.PLAIN, 20));
	    pwLabeld.setBounds(870, 510, 400, 30);
		panel.add(pwLabeld);
		get4.setBounds(800, 500, 60, 60);
		panel.add(get4);
		
		if(product_list.get(page+4) == null) {System.out.print("null");}
		ex = product_list.get(page+4);
		ImageIcon icon5 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl5 = new JLabel();
		imgLbl5.setIcon(icon5);
		imgLbl5.setBounds(70, 550, 150, 150);
		imgLbl5.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl5); 
		String[] array4 = ex.split(" ");
        JLabel pwLabel5 = new JLabel(array4[1]);
	    pwLabel5.setFont(new Font("���� ���", Font.PLAIN, 20));
		pwLabel5.setBounds(280, 600, 400, 30);
		panel.add(pwLabel5);
		JButton get5 = new JButton("���");
		get5.setFont(new Font("���� ���", Font.PLAIN, 13));
		get5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(4);
									}
								});
		JLabel pwLabelf = new JLabel(array4[2]+"��");
	    pwLabelf.setFont(new Font("���� ���", Font.PLAIN, 20));
	    pwLabelf.setBounds(870, 610, 400, 30);
		panel.add(pwLabelf);
		
		get5.setBounds(800, 600, 60, 60);
		panel.add(get5);
		 
		
		JButton BuyListBotton = new JButton("\uAD6C\uB9E4\uB0B4\uC5ED\uC870\uD68C");
		BuyListBotton.setFont(new Font("���� ���", Font.PLAIN, 12));
		BuyListBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		BuyListBotton.setBounds(363, 13, 105, 23);
		panel.add(BuyListBotton);
		
		JButton UserMoBotton = new JButton("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		UserMoBotton.setFont(new Font("���� ���", Font.PLAIN, 12));
		
		UserMoBotton.setBounds(498, 13, 105, 23);
		panel.add(UserMoBotton);
		
		JButton BasketBotton = new JButton("\uC7A5\uBC14\uAD6C\uB2C8");
		BasketBotton.setFont(new Font("���� ���", Font.PLAIN, 12));
		BasketBotton.setBounds(626, 13, 105, 23);
		
		BasketBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( LoginUI.axx == 1) {
					try {
						String file = LoginUI.name+".txt";						
						BufferedReader br = new BufferedReader(new FileReader(file));
						String line;
						 BasketUI.product_list.clear();
			            while ((line = br.readLine()) != null) {
			            BasketUI.product_list.add(line);
			             
			            }
			            
						 
						 
					} catch (Exception aa) {
						aa.printStackTrace();
					} 
					 bsk.setVisible(true);
				}
				if(LoginUI.axx == 0) {
				  bsk = new BasketUI();
				  LoginUI.axx=1;
				}
				
				
				setVisible(false);
			}
		});
		panel.add(BasketBotton);
		
		JButton logoutBotton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			}
		});
		logoutBotton.setFont(new Font("���� ���", Font.PLAIN, 12));
		logoutBotton.setBounds(759, 13, 105, 23);
		panel.add(logoutBotton);
		
		JList list = new JList();
		list.setBounds(77, 399, 774, 572);
		//list.add(new JScrollPane(list));
		//panel.add(list);
		
		//22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
		JButton searchBotton = new JButton("�˻�");
		searchBotton.setBounds(800, 133, 65, 33);
		searchBotton.setFont(new Font("���� ���", Font.PLAIN, 12));
		searchBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.contains(searchField.getText())) {
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(searchBotton);
		
		JLabel mainLabel = new JLabel("\uCEF4\uD4E8\uD130 \uBA54\uC774\uCEE4");
		mainLabel.setFont(new Font("���� ���", Font.BOLD, 40));
		mainLabel.setBounds(31, 13, 280, 58);
		panel.add(mainLabel);
		pre = new JButton("���� ������");
		pre.setFont(new Font("���� ���", Font.PLAIN, 12));
		pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(page != 0) {page-=1;}   
			  	 String ex;
			  	 ImageIcon exi;
			  	now.setText("���� " +page+ "������"); 
			  	if(product_list.size()>page*5 ) {
				 
				 ex = product_list.get(page*5); 
				
				 String[] array = ex.split(" ");
				 pwLabel.setText(array[1] );
				 pwLabela.setText(array[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl.setIcon(exi); 
			  	}
			  	else {
			  		  
					   
					 pwLabel.setText("�غ���" );
					 pwLabela.setText("NA") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+1 ) {
				 ex = product_list.get(page*5+1); 
				 String[] array1 = ex.split(" ");
				 pwLabel2.setText(array1[1] );
				 pwLabelb.setText(array1[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl2.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel2.setText("�غ���" );
					 pwLabelb.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl2.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+2 ) {
				 ex = product_list.get(page*5+2);  
				 String[] array2 = ex.split(" ");
				 pwLabel3.setText(array2[1] );
				 pwLabelc.setText(array2[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl3.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel3.setText("�غ���" );
					 pwLabelc.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl3.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+3 ) {
				 ex = product_list.get(page*5+3); 
				 String[] array3 = ex.split(" ");
				 pwLabel4.setText(array3[1] );
				 pwLabeld.setText(array3[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl4.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel4.setText("�غ���" );
					 pwLabeld.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl4.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+4 ) {
				 ex = product_list.get(page*5+4); 
				 String[] array4 = ex.split(" ");
				 pwLabel5.setText(array4[1] );
				 pwLabelf.setText(array4[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl5.setIcon(exi);  
				}
				else {
			  		  
					   
					 pwLabel5.setText("�غ���" );
					 pwLabelf.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl5.setIcon(exi); 
			  	}
				 contentPane.revalidate();
				 contentPane.repaint(); 
			}
		});
		pre.setBounds(300, 680, 200, 53);
		panel.add(pre);
		//1111111111111111111111111111111111111111111111111111111111111111111111111
		JButton cpubotton = new JButton("CPU");
		cpubotton.setFont(new Font("���� ���", Font.PLAIN, 12));
		cpubotton.setBounds(981, 138, 97, 23);
		cpubotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("cpu")) {
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(cpubotton);
		 
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uC0AC\uBB34\uC6A9");
		chckbxNewCheckBox.setBounds(77, 104, 71, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\uAC8C\uC784\uC6A9");
		chckbxNewCheckBox_1.setBounds(152, 104, 71, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\uBC29\uC1A1\uC6A9");
		chckbxNewCheckBox_2.setBounds(227, 104, 71, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JButton btnNewButton_1 = new JButton("\uBA54\uC778\uBCF4\uB4DC");
		btnNewButton_1.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton_1.setBounds(981, 227, 97, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("main")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uBA54\uBAA8\uB9AC");
		btnNewButton_2.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton_2.setBounds(981, 273, 97, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				if(!chckbxNewCheckBox_1.isSelected()) {
					for(String a : product_list) {
						if (a.contains("���̹�")) {
							product_list.remove(a);
						}
					}
				}
				if(!chckbxNewCheckBox_2.isSelected()) {
					for(String a : product_list) {
						if (a.contains("��ۿ�")) {
							product_list.remove(a);
						}
					}
				}
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("ram")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            	
		            }
		            if(product_list.size()==0) {
		            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
	            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnNewButton_2);
		
		JButton btnGpu = new JButton("GPU");
		btnGpu.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnGpu.setBounds(981, 319, 97, 23);
		btnGpu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("gpu")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnGpu);
		
		JButton btnNewButton_3 = new JButton("\uCFE8\uB7EC");
		btnNewButton_3.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton_3.setBounds(981, 184, 97, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("cooler")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnNewButton_3);
		
		JButton btnSsd = new JButton("SSD");
		btnSsd.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnSsd.setBounds(981, 366, 97, 23);
		btnSsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("ssd")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnSsd);
		
		JButton btnHdd = new JButton("HDD");
		btnHdd.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnHdd.setBounds(981, 418, 97, 23);
		btnHdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("hdd")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnHdd);
		
		
		JButton apply = new JButton("����");
		apply.setFont(new Font("���� ���", Font.PLAIN, 12));
		apply.setBounds(351, 100, 97, 23);
		apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(apply);
		
		
		JButton btnNewButton_4 = new JButton("\uD30C\uC6CC");
		btnNewButton_4.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton_4.setBounds(981, 466, 97, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("power")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uCF00\uC774\uC2A4");
		btnNewButton_5.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton_5.setBounds(981, 520, 97, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				product_list.clear();
				try {
					String file = "product.txt";						
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
		            while ((line = br.readLine()) != null) {
		            	if(line.split(" ")[0].equals("case")) {
		            		if(chckbxNewCheckBox.isSelected() && !line.contains("�繫��") ) {continue;}
		            		if(chckbxNewCheckBox_1.isSelected() && !line.contains("���̹�") ) {continue;}
		            		if(chckbxNewCheckBox_2.isSelected() && !line.contains("��ۿ�") ) {continue;}
		            		
		            		product_list.add(line);
		            		pre.doClick();
		            		
		            	}
		            }
		            if(product_list.size()==0) {
				            	JOptionPane.showMessageDialog(null,  "�˻��� �ش��ϴ� ��ǰ�� �����ϴ�"); 
			            	}
		            page =0;
				} catch (Exception aa) {
					aa.printStackTrace();
				} 
							}
						}); 
		panel.add(btnNewButton_5);
		
		// ���� ������
		now = new JLabel("���� " +page+ "������");
		now.setFont(new Font("���� ���", Font.PLAIN, 12));
		now.setBounds(100, 680, 200, 53);
		panel.add(now);
		
		// ���� ������ ���
		JButton next = new JButton("���� ������");
		next.setFont(new Font("���� ���", Font.PLAIN, 12));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				page+=1; 
			  	 String ex;
			  	 ImageIcon exi;
			  	now.setText("���� " +page+ "������"); 
			  	if(product_list.size()>page*5 ) {
				 
				 ex = product_list.get(page*5); 
				
				 String[] array = ex.split(" ");
				 pwLabel.setText(array[1] );
				 pwLabela.setText(array[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl.setIcon(exi); 
			  	}
			  	else {
			  		  
					   
					 pwLabel.setText("�غ���" );
					 pwLabela.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+1 ) {
				 ex = product_list.get(page*5+1); 
				 String[] array1 = ex.split(" ");
				 pwLabel2.setText(array1[1] );
				 pwLabelb.setText(array1[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl2.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel2.setText("�غ���" );
					 pwLabelb.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl2.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+2 ) {
				 ex = product_list.get(page*5+2);  
				 String[] array2 = ex.split(" ");
				 pwLabel3.setText(array2[1] );
				 pwLabelc.setText(array2[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl3.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel3.setText("�غ���" );
					 pwLabelc.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl3.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+3 ) {
				 ex = product_list.get(page*5+3); 
				 String[] array3 = ex.split(" ");
				 pwLabel4.setText(array3[1] );
				 pwLabeld.setText(array3[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl4.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel4.setText("�غ���" );
					 pwLabeld.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl4.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+4 ) {
				 ex = product_list.get(page*5+4); 
				 String[] array4 = ex.split(" ");
				 pwLabel5.setText(array4[1] );
				 pwLabelf.setText(array4[2]+"��") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl5.setIcon(exi);  
				}
				else {
			  		  
					   
					 pwLabel5.setText("�غ���" );
					 pwLabelf.setText("") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/wait.jpg") ); 
					 
					 imgLbl5.setIcon(exi); 
			  	}
				 contentPane.revalidate();
				 contentPane.repaint(); 
			}
		});
		next.setBounds(700, 680, 200, 53);
		panel.add(next);
		
		
		
		
		setVisible(true);
	}
	
	class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			/*if (e.getSource() == cpubotton) {
				if (button.get)
			}*/
			
		}
		
	}
}