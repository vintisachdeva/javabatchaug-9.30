package com.bmpl.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {

	private JFrame frame;
	private boolean markX = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
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
		
		JButton firstBtn = new JButton("");
		firstBtn.setBounds(48, 59, 76, 23);
		frame.getContentPane().add(firstBtn);
		
		firstBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				markXorO(firstBtn);
				
			}
			
		});
		
		JButton secondBtn = new JButton("");
		secondBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				markXorO(secondBtn);
			}
		});
		secondBtn.setBounds(156, 59, 81, 23);
		frame.getContentPane().add(secondBtn);
		
		JButton thirdBtn = new JButton("");
		thirdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				markXorO(thirdBtn);
			
			}
		});
		thirdBtn.setBounds(260, 59, 76, 23);
		frame.getContentPane().add(thirdBtn);
		
		JButton fourBtn = new JButton("");
		fourBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				markXorO(fourBtn);
			
			}
		});
		fourBtn.setBounds(48, 118, 81, 23);
		frame.getContentPane().add(fourBtn);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(156, 11, 115, 14);
		frame.getContentPane().add(lblNewLabel);
	}
	
	void markXorO(JButton button){
		
		if(button.getText().trim().length()==0){
		
			if(markX){
				button.setText("X");	
			}else{
				button.setText("O");
			}
			markX = !markX; // markX = !markX
							//false = !true --> true
			
			JOptionPane.showMessageDialog(null, "Player X wins");
		}
		
	}
	
}
