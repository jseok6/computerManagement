package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ComCheckUI extends JFrame {

	static String ex;
	private JPanel contentPane;
	static ArrayList<String> product_list = new ArrayList<String>();
	static String cpu="none";
	static String ram="none";
	static String main="none";
	static String power="none";
	static String gpu="none";
	static String cas="none";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComCheckUI() {
		setVisible(true);
		try {
			String file = LoginUI.name+".txt";						
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
            while ((line = br.readLine()) != null) {
            product_list.add(line);
            if(line.split(" ")[0].equals("cpu")) {
            	cpu =line.split(" ")[4]+" "+line.split(" ")[5];
            }
            if(line.split(" ")[0].equals("main")) {
            	main =line.split(" ")[3]+" "+line.split(" ")[4]+" "+line.split(" ")[5];
            }
            if(line.split(" ")[0].equals("ram")) {
            	ram =line.split(" ")[3];
            }
            if(line.split(" ")[0].equals("gpu")) {
            	gpu =line.split(" ")[4];
            }
            if(line.split(" ")[0].equals("case")) {
            	cas =line.split(" ")[3]+" "+line.split(" ")[4]+" "+line.split(" ")[5];
            }
            if(line.split(" ")[0].equals("power")) {
            	power =line.split(" ")[3];
            }
            
             
            }
             
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//호환종류라벨
		JLabel cpuramLabel = new JLabel("<html>CPU<br>RAM</html>");
		cpuramLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		cpuramLabel.setBounds(137, 83, 27, 46);
		cpuramLabel.setToolTipText("");
		panel.add(cpuramLabel);
		
		JLabel cpubodLabel = new JLabel("<html>CPU<br>\uBA54\uC778\uBCF4\uB4DC</html>");
		cpubodLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		cpubodLabel.setBounds(137, 168, 55, 46);
		cpubodLabel.setToolTipText("");
		panel.add(cpubodLabel);
		
		JLabel rambodLabel = new JLabel("<html>RAM<br>\uBA54\uC778\uBCF4\uB4DC</html>");
		rambodLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rambodLabel.setBounds(137, 251, 55, 46);
		rambodLabel.setToolTipText("");
		panel.add(rambodLabel);
		
		JLabel casbodLabel = new JLabel("<html>\uCF00\uC774\uC2A4<br>\uBA54\uC778\uBCF4\uB4DC</html>");
		casbodLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		casbodLabel.setBounds(137, 331, 55, 46);
		casbodLabel.setToolTipText("");
		panel.add(casbodLabel);
		
		JLabel powcasLabel = new JLabel("<html>\uD30C\uC6CC<br>\uCF00\uC774\uC2A4</html>");
		powcasLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		powcasLabel.setBounds(137, 420, 55, 46);
		powcasLabel.setToolTipText("");
		panel.add(powcasLabel);
		
		
		
		//호환성 체크 후 호환되면 호환가능, 안되면 호환불가능 출력라벨		   
		try {
		ex ="DDR"+ram +" 와 " +"DDR"+cpu.split(" ")[1];
		if((cpu.split(" ")[1].equals( "45"  )&&ram.equals("4"))   || (cpu.split(" ")[1].equals( "45"  )&&ram.equals("5")||(cpu.split(" ")[1].equals( "4"  )&&ram.equals("4"))||(cpu.split(" ")[1].equals( "5"  )&&ram.equals("5"))) )
		{ ex+=" 호환 가능";}
		else{ex+=" 호환 불가능";}
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    ex="해당 부품 없음";
		}
		
		JLabel crcheckLabel = new JLabel(ex);
		crcheckLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		crcheckLabel.setBounds(264, 102, 200, 15);
		panel.add(crcheckLabel);
		
		try {
		ex =cpu.split(" ")[0] +" 와 " +main.split(" ")[0];
		if(cpu.split(" ")[0].equals(main.split(" ")[0])  )
				{ ex+=" 호환 가능";}
				else{ex+=" 호환 불가능";} 
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    ex="해당 부품 없음";
		}
		JLabel cbcheckLabel = new JLabel(ex);
		cbcheckLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		cbcheckLabel.setBounds(264, 187, 200, 15);
		panel.add(cbcheckLabel);
		
		try {
		ex ="DDR"+ram +" 와 " +"DDR"+main.split(" ")[2];
		if((main.split(" ")[2].equals( "45"  )&&ram.equals("4"))   || (main.split(" ")[2].equals( "45"  )&&ram.equals("5")||(main.split(" ")[2].equals( "4"  )&&ram.equals("4"))||(main.split(" ")[2].equals( "5"  )&&ram.equals("5"))) )
		{ ex+=" 호환 가능";}
		else{ex+=" 호환 불가능";}
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    ex="해당 부품 없음";
		}
		JLabel rbcheckLabel = new JLabel(ex);
		rbcheckLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		rbcheckLabel.setBounds(264, 270, 200, 15);
		panel.add(rbcheckLabel);
		
		try {
		ex =main.split(" ")[1] +" 와 " +cas.split(" ")[0];
		if(main.split(" ")[1].equals(cas.split(" ")[0])  )
				{ ex+=" 호환 가능";}
				else{ex+=" 호환 불가능";} 
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    ex="해당 부품 없음";
		}
		JLabel bccheckLabel = new JLabel(ex);
		bccheckLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		bccheckLabel.setBounds(264, 350, 200, 15);
		panel.add(bccheckLabel);
		
		try {
		ex =power +" 와 " +cas.split(" ")[0];
		if(power.equals(cas.split(" ")[0])  )
				{ ex+=" 호환 가능";}
				else{ex+=" 호환 불가능";} 
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    ex="해당 부품 없음";
		}
		JLabel cpcheckLabel = new JLabel(ex);
		cpcheckLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		cpcheckLabel.setBounds(264, 439, 200, 15);
		panel.add(cpcheckLabel);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(185, 531, 97, 23);
		panel.add(btnNewButton);
	}
}
