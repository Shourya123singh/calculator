package calcii;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {
	
	String first, oper,ans;
	Double n1,n2,res;

	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnclear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnmod;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btndot;
	private JButton btnplus;
	private JButton btnminus;
	private JButton btnmul;
	private JButton btndiv;
	private JButton btnequal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 289, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 18));
		textField.setBounds(10, 10, 251, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnback = new JButton("\uF0E7");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					back=str.toString();
					textField.setText(back);
				}
			}
		});
		btnback.setBounds(10, 93, 55, 45);
		btnback.setFont(new Font("Windings", Font.BOLD, 18));
		btnback.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnback);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(10, 149, 55, 45);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(10, 202, 55, 45);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(10, 258, 55, 45);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(10, 314, 55, 45);
		frame.getContentPane().add(btn0);
		
		btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnclear.setBackground(Color.LIGHT_GRAY);
		btnclear.setBounds(75, 93, 55, 45);
		frame.getContentPane().add(btnclear);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(75, 149, 55, 45);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(75, 202, 55, 45);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(75, 258, 55, 45);
		frame.getContentPane().add(btn2);
		
		btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"%");
				oper="%";
			}
		});
		btnmod.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnmod.setBackground(Color.LIGHT_GRAY);
		btnmod.setBounds(140, 93, 55, 45);
		frame.getContentPane().add(btnmod);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(140, 149, 55, 45);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(140, 202, 55, 45);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(140, 258, 55, 45);
		frame.getContentPane().add(btn3);
		
		btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btndot.setBackground(Color.LIGHT_GRAY);
		btndot.setBounds(75, 314, 55, 45);
		frame.getContentPane().add(btndot);
		
		btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"+");
				oper="+";
			}
		});
		btnplus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnplus.setBackground(Color.LIGHT_GRAY);
		btnplus.setBounds(207, 93, 55, 45);
		frame.getContentPane().add(btnplus);
		
		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"-");
				oper="-";
			}
		});
		btnminus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnminus.setBackground(Color.LIGHT_GRAY);
		btnminus.setBounds(205, 149, 55, 45);
		frame.getContentPane().add(btnminus);
		
		btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"*");
				oper="*";
			}
		});
		btnmul.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnmul.setBackground(Color.LIGHT_GRAY);
		btnmul.setBounds(205, 202, 55, 45);
		frame.getContentPane().add(btnmul);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+"/");
				oper="/";
			}
		});
		btndiv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btndiv.setBackground(Color.LIGHT_GRAY);
		btndiv.setBounds(205, 258, 55, 45);
		frame.getContentPane().add(btndiv);
		
		btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(oper=="+")
				{
					n2=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf("+")+1));

					res=n1+n2;
					ans=String.format("%.4f",res);
					textField.setText(textField.getText()+" ="+ans);
				}
				else if(oper=="-")
				{
					n2=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf("-")+1));

					res=n1-n2;
					ans=String.format("%.4f",res);
					textField.setText(textField.getText()+" ="+ans);
				}
				else if(oper=="*")
				{
					n2=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf("*")+1));

					res=n1*n2;
					ans=String.format("%.4f",res);
					textField.setText(textField.getText()+" ="+ans);
				}
				else if(oper=="/")
				{
					n2=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf("/")+1));

					res=n1/n2;
					ans=String.format("%.4f",res);
					textField.setText(textField.getText()+" ="+ans);
				}
				else if(oper=="%")
				{
					n2=Double.parseDouble(textField.getText().substring(textField.getText().lastIndexOf("%")+1));

					res=n1%n2;
					ans=String.format("%.4f",res);
					textField.setText(textField.getText()+" ="+ans);
				}
				
			}
		});
		btnequal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnequal.setBackground(Color.LIGHT_GRAY);
		btnequal.setBounds(140, 314, 121, 45);
		frame.getContentPane().add(btnequal);
	}
}
