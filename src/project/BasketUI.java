package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class BasketUI extends JFrame {
	static ArrayList<String> product_list = new ArrayList<String>();
	private JPanel contentPane;
	static JButton next ;
	static JButton pre ;
	static int page =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasketUI frame = new BasketUI();
					System.out.println(12);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void sum(int n) {
		JOptionPane.showMessageDialog(null, product_list.get(page*5+n)+ "¸¦ »èÁ¦Çß½À´Ï´Ù"); 
		product_list.remove(page*5+n);
		
		 String filePath = LoginUI.name+".txt";

	     File file = new File(filePath); // File°´Ã¼ »ý¼º 
	        	try{ 
	    			// true ÁöÁ¤½Ã ÆÄÀÏÀÇ ±âÁ¸ ³»¿ë¿¡ ÀÌ¾î¼­ ÀÛ¼º
	    			FileWriter fw = new FileWriter(file) ;
	    			
	    			 for(String a :product_list) {
	    				 fw.write(a+"\n");
	    			 }
	    			pre.doClick();
	    			// ÆÄÀÏ¾È¿¡ ¹®ÀÚ¿­ ¾²±â
	    			//fw.write("ab");
	    			fw.flush(); 
	    			// °´Ã¼ ´Ý±â
	    			fw.close(); 
	    			
	    			
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		} 
		
		
	}
	/**
	 * Create the frame.
	 */
	public BasketUI() { 
		try {
			String file = LoginUI.name+".txt";						
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
            while ((line = br.readLine()) != null) {
            product_list.add(line);
             
            }
            
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 679);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton ComCheckBotton = new JButton("\uD638\uD658\uC131\uCCB4\uD06C");
		ComCheckBotton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		ComCheckBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ComCheckUI();  
							}
						}); 
		ComCheckBotton.setBounds(350, 560, 97, 23);
		panel.add(ComCheckBotton);
		
		JButton BuyBotton = new JButton("\uAD6C\uB9E4\uD558\uAE30");
		BuyBotton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		BuyBotton.setBounds(583, 560, 97, 23);
		panel.add(BuyBotton);
		
		JButton out = new JButton("µÚ·Î");
		out.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Customer(); 
				setVisible(false);
							}
						}); 
		out.setBounds(20, 350, 60, 60);
		panel.add(out);

String ex = product_list.get(page);
		
		ImageIcon icon = new ImageIcon(
	    Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg")
	    );
		JLabel imgLbl = new JLabel();
		imgLbl.setIcon(icon);
		imgLbl.setBounds(70, 10, 150, 150);
        imgLbl.setHorizontalAlignment(JLabel.CENTER);
        panel.add(imgLbl); 
        
        
        String[] array = ex.split(" ");
        
        JLabel pwLabel = new JLabel(array[1]);
        
        JLabel pwLabela = new JLabel(array[2]+"¿ø");
        pwLabela.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
        pwLabela.setBounds(870, 60, 400, 30);
		panel.add(pwLabela);
		
		pwLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pwLabel.setBounds(280, 50, 400, 30);
		panel.add(pwLabel);
		JButton get1 = new JButton("»©±â");
		get1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		get1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(0);
			}
		});
		get1.setBounds(800, 50, 60, 60);
		panel.add(get1);
		
		ex = product_list.get(page+1);
		ImageIcon icon2 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl2 = new JLabel();
		imgLbl2.setIcon(icon2);
		imgLbl2.setBounds(70, 110, 150, 150);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl2); 
		
		String[] array1 = ex.split(" ");
        JLabel pwLabel2 = new JLabel(array1[1]);
		pwLabel2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pwLabel2.setBounds(280, 150, 400, 30);
		panel.add(pwLabel2);
		JLabel pwLabelb = new JLabel(array1[2]+"¿ø");
	    pwLabelb.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
	    pwLabelb.setBounds(870, 160, 400, 30);
		panel.add(pwLabelb);
		JButton get2 = new JButton("»©±â");
		get2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		get2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(1);
			}
		});
		get2.setBounds(800, 150, 60, 60);
		panel.add(get2);
		
		
		ex = product_list.get(page+2);
		ImageIcon icon3 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl3 = new JLabel();
		imgLbl3.setIcon(icon3);
		imgLbl3.setBounds(70, 210, 150, 150);
		imgLbl3.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl3); 
		String[] array2 = ex.split(" ");
        JLabel pwLabel3 = new JLabel(array2[1]);
		pwLabel3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pwLabel3.setBounds(280, 250, 400, 30);
		panel.add(pwLabel3);
		JLabel pwLabelc = new JLabel(array2[2]+"¿ø");
	    pwLabelc.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
	    pwLabelc.setBounds(870, 260, 400, 30);
		panel.add(pwLabelc);
		JButton get3 = new JButton("»©±â");
		get3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		get3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum(2);
					}
				}); 
		get3.setBounds(800, 250, 60, 60);
		panel.add(get3);
		
		
		
		ex = product_list.get(page+3);
		ImageIcon icon4 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl4 = new JLabel();
		imgLbl4.setIcon(icon4);
		imgLbl4.setBounds(70, 310, 150, 150);
		imgLbl4.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl4); 
		String[] array3 = ex.split(" ");
        JLabel pwLabel4 = new JLabel(array3[1]);
		pwLabel4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pwLabel4.setBounds(280, 360, 400, 30);
		panel.add(pwLabel4);
		JButton get4 = new JButton("»©±â");
		get4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		get4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(3);
							}
						}); 
		get4.setBounds(800, 350, 60, 60);
		panel.add(get4);
		JLabel pwLabeld = new JLabel(array3[2]+"¿ø");
	    pwLabeld.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
	    pwLabeld.setBounds(870, 360, 400, 30);
		panel.add(pwLabeld);
	
		
		
		ex = product_list.get(page+4);
		ImageIcon icon5 = new ImageIcon(
		Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") );
		JLabel imgLbl5 = new JLabel();
		imgLbl5.setIcon(icon5);
		imgLbl5.setBounds(70, 410, 150, 150);
		imgLbl5.setHorizontalAlignment(JLabel.CENTER);
		panel.add(imgLbl5); 
		String[] array4 = ex.split(" ");
        JLabel pwLabel5 = new JLabel(array4[1]);
	    pwLabel5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pwLabel5.setBounds(280, 450, 400, 30);
		panel.add(pwLabel5);
		JButton get5 = new JButton("»©±â");
		get5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		get5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum(4);
									}
								});
		JLabel pwLabelf = new JLabel(array4[2]+"¿ø");
	    pwLabelf.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
	    pwLabelf.setBounds(870, 460, 400, 30);
		panel.add(pwLabelf);
		
		int totaln =0;
		for(String a : product_list) {
			totaln +=Integer.parseInt( (a.split(" ")[2]));
		}
		JLabel total = new JLabel("ÃÑ " + Integer.toString(totaln));
		total.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		total.setBounds(450, 550, 400, 30);
		panel.add(total);
		
		get5.setBounds(800, 450, 60, 60);
		panel.add(get5);
		next = new JButton("´ÙÀ½ ÆäÀÌÁö");
		next.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page+=1; 
			  	 String ex;
			  	 ImageIcon exi;
			  	 
			  	if(product_list.size()>page*5 ) {
				 
				 ex = product_list.get(page*5); 
				
				 String[] array = ex.split(" ");
				 pwLabel.setText(array[1] );
				 pwLabela.setText(array[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl.setIcon(exi); 
			  	}
			  	else {
			  		  
					   
					 pwLabel.setText("  " );
					 pwLabela.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+1 ) {
				 ex = product_list.get(page*5+1); 
				 String[] array1 = ex.split(" ");
				 pwLabel2.setText(array1[1] );
				 pwLabelb.setText(array1[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl2.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel2.setText("  " );
					 pwLabelb.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl2.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+2 ) {
				 ex = product_list.get(page*5+2);  
				 String[] array2 = ex.split(" ");
				 pwLabel3.setText(array2[1] );
				 pwLabelc.setText(array2[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl3.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel3.setText("  " );
					 pwLabelc.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl3.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+3 ) {
				 ex = product_list.get(page*5+3); 
				 String[] array3 = ex.split(" ");
				 pwLabel4.setText(array3[1] );
				 pwLabeld.setText(array3[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl4.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel4.setText("  " );
					 pwLabeld.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl4.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+4 ) {
				 ex = product_list.get(page*5+4); 
				 String[] array4 = ex.split(" ");
				 pwLabel5.setText(array4[1] );
				 pwLabelf.setText(array4[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl5.setIcon(exi);  
				}
				else {
			  		  
					   
					 pwLabel5.setText("  " );
					 pwLabelf.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl5.setIcon(exi); 
			  	}
				 contentPane.revalidate();
				 contentPane.repaint(); 
			}
		});
		next.setBounds(700, 550, 200, 53);
		pre = new JButton("ÀÌÀü ÆäÀÌÁö");
		pre.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(page != 0) {page-=1;}   
			  	 String ex;
			  	 ImageIcon exi; 
			  	if(product_list.size()>page*5 ) {
				 
				 ex = product_list.get(page*5); 
				
				 String[] array = ex.split(" ");
				 pwLabel.setText(array[1] );
				 pwLabela.setText(array[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl.setIcon(exi); 
			  	}
			  	else {
			  		  
					   
					 pwLabel.setText("  " );
					 pwLabela.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+1 ) {
				 ex = product_list.get(page*5+1); 
				 String[] array1 = ex.split(" ");
				 pwLabel2.setText(array1[1] );
				 pwLabelb.setText(array1[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl2.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel2.setText("  " );
					 pwLabelb.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl2.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+2 ) {
				 ex = product_list.get(page*5+2);  
				 String[] array2 = ex.split(" ");
				 pwLabel3.setText(array2[1] );
				 pwLabelc.setText(array2[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl3.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel3.setText("  " );
					 pwLabelc.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl3.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+3 ) {
				 ex = product_list.get(page*5+3); 
				 String[] array3 = ex.split(" ");
				 pwLabel4.setText(array3[1] );
				 pwLabeld.setText(array3[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl4.setIcon(exi); 
				}
				else {
			  		  
					   
					 pwLabel4.setText("  " );
					 pwLabeld.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl4.setIcon(exi); 
			  	}
				if(product_list.size()>page*5+4 ) {
				 ex = product_list.get(page*5+4); 
				 String[] array4 = ex.split(" ");
				 pwLabel5.setText(array4[1] );
				 pwLabelf.setText(array4[2]+"¿ø") ;
				 exi= new ImageIcon(
							Customer.class.getResource("/image/"+ex.substring(ex.length()-2, ex.length())+".jpg") ); 
				 imgLbl5.setIcon(exi);  
				}
				else {
			  		  
					   
					 pwLabel5.setText("  " );
					 pwLabelf.setText("??") ;
					 exi= new ImageIcon(
								Customer.class.getResource("/image/x.png") ); 
					 
					 imgLbl5.setIcon(exi); 
			  	}
				 contentPane.revalidate();
				 contentPane.repaint(); 
			}
		});
		pre.setBounds(100, 550, 200, 53);
		panel.add(pre);
		panel.add(next);
		
	}

}
