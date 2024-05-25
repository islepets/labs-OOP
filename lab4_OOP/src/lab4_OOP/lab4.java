package lab4_OOP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class lab4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab4 window = new lab4();
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
	public lab4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 1073, 738);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Тип фигуры");
		lblNewLabel.setBounds(939, 11, 105, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Смещение по x:");
		lblNewLabel_1.setBounds(939, 67, 105, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner spinner_x = new JSpinner();
		spinner_x.setBounds(939, 92, 105, 20);
		frame.getContentPane().add(spinner_x);
		
		JLabel lblNewLabel_2 = new JLabel("Смещение по y:");
		lblNewLabel_2.setBounds(939, 124, 91, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSpinner spinner_y = new JSpinner();
		spinner_y.setBounds(939, 149, 105, 20);
		frame.getContentPane().add(spinner_y);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(939, 36, 105, 20);
		frame.getContentPane().add(spinner);
		
		MyPanel panel = new MyPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 919, 677);
		frame.getContentPane().add(panel);
		
		
		
		JButton btnNewButton = new JButton("Выполнить");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setFigureType((int)spinner.getValue());
				panel.setCoor((int)spinner_x.getValue(), (int)spinner_y.getValue());
			}
		});
		
		btnNewButton.setBounds(939, 194, 105, 47);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
