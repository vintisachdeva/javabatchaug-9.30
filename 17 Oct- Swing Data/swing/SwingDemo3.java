package com.bmpl.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingDemo3 {

	private JFrame frame;
	private JTextField nameTextField;
	private JTextField phnTextField;
	private JLabel resultLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo3 window = new SwingDemo3();
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
	public SwingDemo3() {
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
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(72, 38, 46, 14);
		frame.getContentPane().add(lblName);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(166, 35, 170, 20);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setBounds(72, 88, 84, 14);
		frame.getContentPane().add(lblPhoneNo);
		
		phnTextField = new JTextField();
		phnTextField.setBounds(166, 85, 170, 20);
		frame.getContentPane().add(phnTextField);
		phnTextField.setColumns(10);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameTextField.getText();
				String phn = phnTextField.getText();
				
				resultLabel.setText(name + " " + phn);
			}
		});
		
		
		submitButton.setBounds(152, 138, 89, 23);
		frame.getContentPane().add(submitButton);
		
		resultLabel = new JLabel("");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setBounds(118, 194, 170, 42);
		frame.getContentPane().add(resultLabel);
	}
}
