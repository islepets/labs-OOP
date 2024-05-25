package lab8_OOP;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.awt.Font;

public class lab8 {

	private JFrame frame;

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
					lab8 window = new lab8();
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
	public lab8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 844, 664);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
        frame.getContentPane().add(textArea, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("Файл");
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Открыть");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                if (jfc.showOpenDialog(frame) != JFileChooser.APPROVE_OPTION) {
                    return;
                }

                try {
                    Scanner sc;
                    sc = new Scanner(new File(jfc.getSelectedFile().getAbsolutePath()));
                    String res = "";
                    while (sc.hasNext()) {
                        res += sc.nextLine() + "\n";
                    }
                    sc.close();
                    textArea.setText(res);
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }

            }
        });
        mnNewMenu.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Сохранить как");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JFileChooser jfc = new JFileChooser();
                if (jfc.showSaveDialog(frame) != JFileChooser.APPROVE_OPTION) {
                    return;
                }
                try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(jfc.getSelectedFile().getAbsolutePath()));
					bw.write(textArea.getText());
					
					
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        mnNewMenu.add(mntmNewMenuItem_1);

        JMenu mnNewMenu_1 = new JMenu("Правка");
        menuBar.add(mnNewMenu_1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Задание А");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String text = textArea.getText().replace("AA", "*"); 
        		
        		textArea.setText(text);
        	}
        });
        mnNewMenu_1.add(mntmNewMenuItem_2);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Задание B");
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String text = textArea.getText();
        		StringBuilder newText = new StringBuilder();
        		for(int i = 0;i < text.length()-1;i++) {
        			if(text.charAt(i) != text.charAt(i+1)) {
        				newText.append(text.charAt(i));
        			}
        			else {
        				i++;
        			}
        		}
        		textArea.setText(newText.toString());
        	}
        });
        mnNewMenu_1.add(mntmNewMenuItem_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Задание С");
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
	        		String text = textArea.getText();
	        		String[]array = text.split(" ");
	        		for(int i = 0; i < array.length;i++) {
	        			if (array[i].contains("A")){
	        				text = text.replaceFirst(array[i], "*");
	        			}
	        		}
	        		textArea.setText(text);
        	}
        });
        mnNewMenu_1.add(mntmNewMenuItem_4);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Задание D");
        mntmNewMenuItem_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String text = textArea.getText();
        		String[]array = text.split(" ");
        		for(int i = 0; i < array.length;i++) {
        			if (array[i].contains("A")){
        				text = text.replaceFirst(array[i], "<" + array[i] + ">");
        			}
        		}
        		textArea.setText(text);
        	}
        	
        });
        mnNewMenu_1.add(mntmNewMenuItem_5);
        
        JMenuItem mntmNewMenuItem_6 = new JMenuItem("Д/З");
        mntmNewMenuItem_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String text = textArea.getText();
        		String[]array = text.split(" ");
        		StringBuilder newText = new StringBuilder();
        		for (int i = 0; i < array.length; i++) {
        		    if (array[i].length() > 1 && array[i].charAt(0) != array[i].charAt(array[i].length()-1) ) {
        		    	newText.append(array[i] + " ");
        		    }
        		}
        		textArea.setText(newText.toString());
        	}
        	
        });
        mnNewMenu_1.add(mntmNewMenuItem_6);
        
        JMenuItem mntmNewMenuItem_7 = new JMenuItem("Доп. задание");
        mntmNewMenuItem_7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String text = textArea.getText();
        		String[]array = text.split("\s+");
        		StringBuilder newText = new StringBuilder();
        		for (int i = 0; i < array.length; i++) {
        				newText.append(array[i] + " ");	
        		}
        		textArea.setText(newText.toString());
        	}
        	
        });
        mnNewMenu_1.add(mntmNewMenuItem_7);
    }

}
