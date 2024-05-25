package lab5_OOP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JTextField;

public class window5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window5 window = new window5();
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
	public window5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setTitle("Рекурсия");
		frame.setBounds(100, 100, 1022, 659);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		MyPanel panel = new MyPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 828, 598);
		frame.getContentPane().add(panel);
		
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				panel.setFigureDepth((int)spinner.getValue());
			}
		});
		spinner.setBounds(848, 199, 148, 34);
		frame.getContentPane().add(spinner);
		
		JButton btnSquare = new JButton("4 in 4");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setfigureType(1);
			}
		});
		btnSquare.setBounds(848, 244, 148, 34);
		frame.getContentPane().add(btnSquare);
		
		JButton btnOval = new JButton("5 in 5");
		btnOval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setfigureType(2);
			}
		});
		btnOval.setBounds(848, 289, 148, 34);
		frame.getContentPane().add(btnOval);
		
		JButton btnIn = new JButton("4 in 5");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setfigureType(3);
			}
		});
		btnIn.setBounds(848, 334, 148, 34);
		frame.getContentPane().add(btnIn);
		
		JButton btnIn_2 = new JButton("5 in 4");
		btnIn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setfigureType(4);
			}
		});
		btnIn_2.setBounds(848, 379, 148, 34);
		frame.getContentPane().add(btnIn_2);
		
		
	}
}
