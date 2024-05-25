package lab10_OOP;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.Font;

public class lab10 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab10 window = new lab10();
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
	public lab10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Лабораторная работа №10");
		frame.setBounds(100, 100, 761, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial Black", Font.PLAIN, 16));
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Открыть");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Задание А");
		mntmNewMenuItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String[] text = textArea.getText().split(" ");
		        for (int i = 0; i < text.length; i++) {
		            for (int j = 0; j < text.length - i - 1; j++) {
		                if (Integer.parseInt(text[j]) > Integer.parseInt(text[j + 1])) {
		                    String temp = text[j];
		                    text[j] = text[j + 1];
		                    text[j + 1] = temp;
		                }
		            }
		            String sortedText = String.join(" ", text);
		            textArea.append("\n" + sortedText);
		        }
		    }
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Задание B");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String[] text = textArea.getText().split(" ");
		        int n = text.length;
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (text[j].compareTo(text[j+1]) > 0) {
		                    String temp = text[j];
		                    text[j] = text[j+1];
		                    text[j+1] = temp;
		                }
		            }
		            String sortedText = String.join(" ", text);
		            textArea.append("\n" + sortedText);
		        }
		    }
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		
	}

}
