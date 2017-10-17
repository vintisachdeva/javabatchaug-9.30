package com.bmpl.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EvenOdd {

	private JFrame frame;
	private JTextField inputField;
	private JButton checkBtn;
	private JLabel resultLabel;
	private JLabel lblCheckYourEntered;
	Temp temp;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvenOdd window = new EvenOdd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EvenOdd() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		temp = new Temp();
		
		JLabel lblNewLabel = new JLabel("Enter your number");
		lblNewLabel.setBounds(38, 65, 155, 14);
		frame.getContentPane().add(lblNewLabel);
		
		inputField = new JTextField();
		inputField.setBounds(252, 62, 112, 20);
		frame.getContentPane().add(inputField);
		inputField.setColumns(10);
		
		checkBtn = new JButton("Check");
		
		checkBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int userValue = Integer.parseInt(inputField.getText());
				
				if(userValue%2==0){
					//even no.
					resultLabel.setText("The number is Even");
					
					temp.frame.setVisible(true);
					frame.setVisible(false);
					
				} else{
					resultLabel.setText("The number is Odd");
				}
			}
		});
		checkBtn.setBounds(153, 122, 89, 23);
		frame.getContentPane().add(checkBtn);
		
		resultLabel = new JLabel("The Number is...");
		resultLabel.setBounds(116, 171, 203, 14);
		frame.getContentPane().add(resultLabel);
		
		lblCheckYourEntered = new JLabel("Check your entered number is even or odd");
		lblCheckYourEntered.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCheckYourEntered.setBounds(55, 11, 357, 25);
		frame.getContentPane().add(lblCheckYourEntered);
	}

}
