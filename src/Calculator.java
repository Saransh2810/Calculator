import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JButton btnC;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	static double a=0,b=0,res=0;
	static int opt=0;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(28,11,238, 57);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(tf.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(tf.getText());
					str.deleteCharAt(tf.getText().length()-1);
					backspace=str.toString();
					tf.setText(backspace);
				}
			}
		});
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		btnNewButton.setBounds(28, 80, 52, 57);
		contentPane.add(btnNewButton);
		
		btnC = new JButton("C");
		btnC.setForeground(new Color(255, 0, 0));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText("");
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnC.setBounds(90, 80, 52, 57);
		contentPane.add(btnC);
		
		btnNewButton_2 = new JButton("%");
		btnNewButton_2.setForeground(new Color(50, 205, 50));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(tf.getText());
				opt=1;
				tf.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		btnNewButton_2.setBounds(152, 80, 52, 57);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("+");
		btnNewButton_3.setForeground(new Color(50, 205, 50));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(tf.getText());
				opt=2;
				tf.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		btnNewButton_3.setBounds(214, 80, 52, 57);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("7"));
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(28, 147, 52, 57);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("8"));
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_5.setBounds(90, 147, 52, 57);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("9"));
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_6.setBounds(152, 147, 52, 57);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("-");
		btnNewButton_7.setForeground(new Color(50, 205, 50));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(tf.getText());
				opt=3;
				tf.setText("");
			}
		});
		btnNewButton_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		btnNewButton_7.setBounds(214, 147, 52, 57);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("4"));
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_8.setBounds(28, 214, 52, 57);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("5");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("5"));
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_9.setBounds(90, 214, 52, 57);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("6"));
			}
		});
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_10.setBounds(152, 214, 52, 57);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("/");
		btnNewButton_11.setForeground(new Color(50, 205, 50));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(tf.getText());
				opt=4;
				tf.setText("");
			}
		});
		btnNewButton_11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		btnNewButton_11.setBounds(214, 214, 52, 57);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("1"));
			}
		});
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_12.setBounds(28, 281, 52, 57);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("2");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("2"));
			}
		});
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_13.setBounds(90, 281, 52, 57);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("3");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("3"));
			}
		});
		btnNewButton_14.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_14.setBounds(152, 281, 52, 57);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("*");
		btnNewButton_15.setForeground(new Color(50, 205, 50));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(tf.getText());
				opt=5;
				tf.setText("");
			}
		});
		btnNewButton_15.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		btnNewButton_15.setBounds(214, 281, 52, 57);
		contentPane.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("0");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("0"));
			}
		});
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_16.setBounds(28, 348, 52, 57);
		contentPane.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton(".");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("."));
			}
		});
		btnNewButton_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_17.setBounds(90, 348, 52, 57);
		contentPane.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("+/-");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double ot=Double.parseDouble(String.valueOf(tf.getText()));
				ot=ot*(-1);
				tf.setText(String.valueOf(ot));
			}
		});
		btnNewButton_18.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_18.setBounds(152, 348, 52, 57);
		contentPane.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("=");
		btnNewButton_19.setForeground(new Color(50, 205, 50));
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Double.parseDouble(tf.getText());
				switch(opt)
				{
					case 1: res=a%b;
					break;
					case 2: res=a+b;
					break;
					case 3: res=a-b;
					break;
					case 4: res=a/b;
					break;
					case 5: res=a*b;
					break;
					default: res=0;
				}
				tf.setText(""+res);
			}
		});
		btnNewButton_19.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		btnNewButton_19.setBounds(214, 348, 52, 57);
		contentPane.add(btnNewButton_19);
	}
}
