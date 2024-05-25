package lab3_OOP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class window {

	private JFrame frame;
	public JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
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
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(109, 139, 160));
		frame.setTitle("Лабораторная работа№3");
		frame.setBounds(100, 100, 1039, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(909, 11, 92, 26);
		frame.getContentPane().add(spinner);
		
		JButton taskButton1 = new JButton("Задача 1");
		taskButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				int i = 1;
				String s = "";
			    while (i <= n) {
			        int num = i;
			        int j = 1;

			        while (j <= n) {
			            s+=num+" ";
			            num += 2;
			            j++;
			        }
			       s+="\n";
			        i++;
			    }
			    textPane.setText(s);
			}
		});
		taskButton1.setBounds(909, 48, 92, 23);
		frame.getContentPane().add(taskButton1);
		
		JButton taskButton2 = new JButton("Задача 2");
		taskButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s="";
				int i = 1;
				while(i<=n) {
					int j = 1;
					while(j<=i) {
						s+=j+" ";
						j++;
					}
					s+="\n";
					i++;
				}
				textPane.setText(s);
			}
		});
		taskButton2.setBounds(909, 82, 92, 23);
		frame.getContentPane().add(taskButton2);
		
		JButton taskButton3 = new JButton("Задача 3");
		taskButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s = "";
				int i = n;
				do {
					int j = 1;
					do {
						s+=j+" ";
			    		j++;
					}while(j<=i);
					s+="\n";
		    		i--;
				}while(i!=0);
				textPane.setText(s);
			}
		});
		taskButton3.setBounds(909, 116, 92, 23);
		frame.getContentPane().add(taskButton3);
		
		JButton taskButton4 = new JButton("Задача 4");
		taskButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s="";
				int i = 1;
				do {
					int j = n;
					do {
						s+=j+" ";
			    		j--;
					}while(j>=i);
					s+="\n";
		    		i++;
				}while(i<=n);
				textPane.setText(s);
			}
		});
		taskButton4.setBounds(909, 150, 92, 23);
		frame.getContentPane().add(taskButton4);
		
		JButton taskButton5 = new JButton("Задача 5");
		taskButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s="";
				int i = 1;
				while (i <= n) {
					int j = n - i;
					while (j > 0) {
						s+="  ";
						j--;
					}
					j = 1;
					while (j <= i) {
						s+=j+" ";
						j++;
					}
					j = i - 1;
					while (j > 0) {
						s+=j+" ";
						j--;
					}
					s+="\n";
					i++;
				}
				i = n - 1;
				while (i > 0) {
					int j = n - i;
					while (j > 0) {
						s+="  ";
						j--;
					}
					j = 1;
					while (j <= i) {
						s+=j+" ";
						j++;
					}
					j = i - 1;
					while (j > 0) {
						s+=j+" ";
						j--;
					}
					s+="\n";
					i--;
				}
				textPane.setText(s);
			}
		});
		taskButton5.setBounds(909, 184, 92, 23);
		frame.getContentPane().add(taskButton5);
		
		JButton taskButton6 = new JButton("Задача 6");
		taskButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s="";
				int i = 0;
			    while(i<=n) {
			    	int j = 1;
			    	if(i%2==0) {
			    		while(j<=i) {
			    			s+=j+" ";
			    			j++;
			    		}	    		
			    	}
			    	else {
		    			j = i;
		    			while(j!=0) {
		    	    		s+=j+" ";
		    	    		j--;
		    	    		
		    	    	}
		    		}
			    	s+="\n";
		    		i++;
			    }
			    textPane.setText(s);
			}
		});
		taskButton6.setBounds(909, 218, 92, 23);
		frame.getContentPane().add(taskButton6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 889, 459);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		textPane = new JTextPane();
		textPane.setBackground(new Color(192, 192, 192));
		textPane.setFont(new Font("Courier New", Font.PLAIN, 14));
		panel.add(textPane, BorderLayout.CENTER);
		
		JButton taskButton7 = new JButton("Задача 7");
		taskButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s="";
				int i = 1;
				do {
					int j = 1;
					if(i%2==0) {
						do {
							s+=j+" ";
							j++;
						}while(j<=i);
					}
					else {
						j = i;
						do {
							s+=j+" ";
			    			j--;
						}while(j!=0);	
					}
					s+="\n";
		    		i++;
				}while(i<=n);
				 textPane.setText(s);
			}
		});
		taskButton7.setBounds(909, 252, 92, 23);
		frame.getContentPane().add(taskButton7);
		
		JButton taskButton8 = new JButton("Задача 8");
		taskButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s="";
				int i = 1;
				int j = n;
				int k;
				do {
					j = n;
					k = 1;
					do {
						s+="   ";
						k++;
					}while(k<=i);
					do {
						s+=j+"  ";
			    		j--;
					}while(j>=i);
					s+="\n";
		    		i++;
				}while(i<=n);
				i = n;
				do {
					j = n;
					k = 1;;
					do {
						s+="   ";
						k++;
					}while(k<=i);
					do {
						s+=j+"  ";
			    		j--;
					}while(j>=i);
					s+="\n";
		    		i--;
				}while(i!=0);
				textPane.setText(s);
			}
		});
		taskButton8.setBounds(912, 286, 89, 23);
		frame.getContentPane().add(taskButton8);
		
		JButton taskButton9 = new JButton("Задача 9");
		taskButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (int)spinner.getValue();
				String s="";
				int i = 1;
				int k;
				int j;
				while(i<=n) {
					j = n;
					k = 1;
					while(k<=i) {
						s+="   ";
						k++;
					}
					while(j>=i) {
						s+=j+"  ";
			    		j--;
					}
					s+="\n";
		    		i++;
				}
				i = n;
				while(i!=0) {
					j = n;
					k = 1;
					while(k<=i) {
						s+="   ";
						k++;
					}
					while(j>=i) {
						s+=j+"  ";
			    		j--;
					}
					s+="\n";
		    		i--;
				}
				textPane.setText(s);
			}
		});
		taskButton9.setBounds(912, 320, 89, 23);
		frame.getContentPane().add(taskButton9);	
	}
}
