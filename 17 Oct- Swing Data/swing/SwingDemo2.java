package com.bmpl.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SwingDemo2 {

	private JFrame frame; //instance variable
	/**
	 * @wbp.nonvisual location=467,-1
	 */
	private final JButton button = new JButton("New button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//SwingDemo2 obj = new SwingDemo2();
		//compiler 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo2 window = new SwingDemo2();
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
	public SwingDemo2() {//default cons
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(); //Null Pointer Exception
					//	left, top, width, height
		frame.setBounds(250, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton secondButton = new JButton("New button");
		frame.getContentPane().add(secondButton, BorderLayout.CENTER);
		
		JButton firstButton = new JButton("Click Here");
					//listener attached
		
		
		firstButton.addActionListener(new ActionListener() {
			//event handler
			public void actionPerformed(ActionEvent e) {
			
					firstButton.setText("You clicked on this Button");
			}
		});
		
		frame.getContentPane().add(firstButton, BorderLayout.NORTH);
	}
}
