package com.bmpl.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class Calc implements ActionListener  {

	private JFrame frame;
	private JLabel resultLabel;
	private int firstValue = 0;
	private int secondValue = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton sevenBtn = new JButton("7");
		sevenBtn.setBounds(22, 106, 89, 23);
		frame.getContentPane().add(sevenBtn);
		
		JButton eightBtn = new JButton("8");
		eightBtn.setBounds(121, 106, 89, 23);
		frame.getContentPane().add(eightBtn);
		
		JButton nineBtn = new JButton("9");	
		nineBtn.setBounds(224, 106, 89, 23);
		frame.getContentPane().add(nineBtn);
		
		JButton addBtn = new JButton("+");
		addBtn.setBounds(323, 106, 89, 23);
		frame.getContentPane().add(addBtn);
		
		JButton eqlBtn = new JButton("=");
		eqlBtn.setBounds(329, 228, 89, 23);
		frame.getContentPane().add(eqlBtn);
		
		resultLabel = new JLabel("0");
		resultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		resultLabel.setBounds(195, 39, 217, 40);
		frame.getContentPane().add(resultLabel);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.setBounds(22, 144, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.setBounds(121, 144, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("6");
		
		btnNewButton_2.setBounds(224, 144, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button = new JButton("-");
		button.setBounds(323, 144, 89, 23);
		frame.getContentPane().add(button);
		
		JButton clrBtn = new JButton("Clear");
		clrBtn.setBounds(22, 228, 89, 23);
		frame.getContentPane().add(clrBtn);
		
		//event listeners and event handlers
		
		sevenBtn.addActionListener(this);//always points to class
		eightBtn.addActionListener(this);
		nineBtn.addActionListener(this);
		
		addBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstValue = Integer.parseInt(resultLabel.getText());
				System.out.println(firstValue);
				//resultLabel.setText("");
			}
			
		});
		
		eqlBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				secondValue = Integer.parseInt(resultLabel.getText());
				int result = firstValue + secondValue;
				
				resultLabel.setText(String.valueOf(result));
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!resultLabel.getText().equals("0")){
			resultLabel.setText(resultLabel.getText().concat(e.getActionCommand()));
		}
		else{
			resultLabel.setText(e.getActionCommand());
		}
	}
}
