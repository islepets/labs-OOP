package lab9_OOP;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.JTextArea;

public class lab9 {

	private JFrame frame;
	private String fileName = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab9 window = new lab9();
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
	public lab9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Arial Black", Font.PLAIN, 12));
		frame.setBackground(new Color(255, 255, 255));
		frame.setTitle("Лабораторная работа №9");
		frame.setBounds(100, 100, 667, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
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
            		fileName = jfc.getSelectedFile().getName();
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
        		int counter = 0;
        		String[] text = textArea.getText().split(" "); 
        		for(String index: text) {
        			if (index != "\0")
        				counter++;
        		}
        		String content = "<p align=\"center\"><b>Лабораторная работа №9</b></p><br>"
						+ "<p align=\"center\">Вариант А</p><br>"
						+ "<p align=\"left\">Выполнил студент группы <i>ИВТИИбд-12</i> <b>Слепец И.М.</b></p><br>"
						+ "<p align=\"left\">Файл: <b>" + fileName + "</b></p><br>"
								+ "<p align=\"left\">Количество найденных слов: <b>" + counter + "</b></p>";
				textArea.setText(content);
        		
        		
        	}
        });
        mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Задание В");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int counter = 0;
        		String[] enterText = textArea.getText().split("\n");
        		String[] spaceText = textArea.getText().split(" ");
        		for(String index: spaceText) {
        			if (index != enterText[0])
        				counter++;
        		}
        		String content = "<p align=\"center\"><b>Лабораторная работа №9</b></p><br>"
						+ "<p align=\"center\">Вариант А</p><br>"
						+ "<p align=\"left\">Выполнил студент группы <i>ИВТИИбд-12</i> <b>Слепец И.М.</b></p><br>"
						+ "<p align=\"left\">Файл: <b>" + fileName + "</b></p><br>"
						+ "Начало слова:<b>" +enterText[0] + "</b><br>"
						+ "<p align=\"left\">Количество найденных слов: <b>" + counter + "</b></p>";
				textArea.setText(content);

        	}
        });
		mnNewMenu_1.add(mntmNewMenuItem_3);
	}

}
