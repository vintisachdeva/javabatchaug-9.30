package com.bmpl.swing;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SingleSelection {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleSelection window = new SingleSelection();
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
	public SingleSelection() {
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
		
		JLabel lblForm = new JLabel("Form");
		lblForm.setBounds(188, 21, 46, 14);
		frame.getContentPane().add(lblForm);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(56, 65, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(188, 62, 167, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Phone");
		lblNewLabel.setBounds(56, 125, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 122, 167, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(56, 187, 46, 14);
		frame.getContentPane().add(lblGender);
		
		JRadioButton maleBtn = new JRadioButton("Male");
		maleBtn.setBounds(184, 183, 109, 23);
		frame.getContentPane().add(maleBtn);
		
		JRadioButton femaleBtn = new JRadioButton("Female");
		femaleBtn.setBounds(304, 183, 109, 23);
		frame.getContentPane().add(femaleBtn);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(maleBtn);
		buttonGroup.add(femaleBtn);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(188, 213, 88, 20);
		frame.getContentPane().add(comboBox);

		comboBox.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				String selected = String.valueOf(comboBox.getSelectedIndex());//0 for beginning item
				System.out.println("Selected =" +selected);
			}
			
		});
		
		JLabel lblGender_1 = new JLabel("Gender");
		lblGender_1.setBounds(56, 216, 46, 14);
		frame.getContentPane().add(lblGender_1);
	}
}
