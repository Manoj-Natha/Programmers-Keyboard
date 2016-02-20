import java.awt.AWTException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Robot;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class C_Keyboard {

	private JFrame frmProgrammerKeyboard;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C_Keyboard window = new C_Keyboard();
					window.frmProgrammerKeyboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try{
			        Robot bot = new Robot();
				 } catch (Exception ebot) {
			         JOptionPane.showMessageDialog(null, "error in creating robot object");
			     }
				
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public C_Keyboard() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgrammerKeyboard = new JFrame();
		frmProgrammerKeyboard.setTitle("Programmer Keyboard");
		frmProgrammerKeyboard.setAlwaysOnTop(true);
        frmProgrammerKeyboard.setFocusable(false);
        frmProgrammerKeyboard.setFocusableWindowState(false);

		frmProgrammerKeyboard.setBounds(100, 100, 432, 311);
		frmProgrammerKeyboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProgrammerKeyboard.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 11, 418, 259);
		frmProgrammerKeyboard.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("C Keyboard", null, panel, null);
		panel.setLayout(null);
		
		JButton btnIncludeHeader = new JButton("Include");
		btnIncludeHeader.setBounds(10, 11, 89, 23);
		panel.add(btnIncludeHeader);
		
		JButton btnHelloWorld = new JButton("Hello World Program");
		btnHelloWorld.setBounds(109, 11, 189, 23);
		panel.add(btnHelloWorld);
		
		JButton btnNewButton_2 = new JButton("function");
		btnNewButton_2.setBounds(308, 11, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnUnion = new JButton("union");
		btnUnion.setBounds(308, 132, 89, 23);
		panel.add(btnUnion);
		
		JButton btnStruct = new JButton("struct");
		btnStruct.setBounds(308, 98, 89, 23);
		panel.add(btnStruct);
		
		JButton btnEnum = new JButton("enum");
		btnEnum.setBounds(308, 64, 89, 23);
		panel.add(btnEnum);
		
		JButton btnFor = new JButton("for");
		btnFor.setBounds(208, 64, 89, 23);
		panel.add(btnFor);
		
		JButton btnWhile = new JButton("while");
		btnWhile.setBounds(208, 98, 89, 23);
		panel.add(btnWhile);
		
		JButton btnDowhile = new JButton("do-while");
		btnDowhile.setBounds(208, 132, 89, 23);
		panel.add(btnDowhile);
		
		JButton btnIfelseif = new JButton("if-else");
		btnIfelseif.setBounds(109, 64, 89, 23);
		panel.add(btnIfelseif);
		
		JButton btnNewButton = new JButton("Switch");
		btnNewButton.setBounds(109, 98, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnGoto = new JButton("goto");
		btnGoto.setBounds(109, 132, 89, 23);
		panel.add(btnGoto);
		
		JButton btnNewButton_1 = new JButton("continue");
		btnNewButton_1.setBounds(109, 166, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnBreak = new JButton("break");
		btnBreak.setBounds(109, 205, 89, 23);
		panel.add(btnBreak);
		
		JButton btnPrintf = new JButton("Printf");
		btnPrintf.setBounds(10, 64, 89, 23);
		panel.add(btnPrintf);
		
		JButton btnScanf = new JButton("Scanf");
		btnScanf.setBounds(10, 98, 89, 23);
		panel.add(btnScanf);
		
		JButton btnComment = new JButton("comment");
		btnComment.setBounds(10, 132, 89, 23);
		panel.add(btnComment);
		btnComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			type("/*~~*/~");
			}
		});
		btnScanf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("scanf(\"% \",& );~");			
			}
		});
		btnPrintf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// for typing " we should use \"
	            type("printf(\" \");~");
				//JOptionPane.showMessageDialog(null, "Printf is pressed..!!");
			}
		});
		btnBreak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("break;~");
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("continue;~");
			}
		});
		btnGoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("goto ;~");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				type("switch()~{~case :~~break;~case :~~break;~case :~~break;~case :~~break;~default:~}~");           
					
			}
		});
		btnIfelseif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("if()~{~~}~else{~~}~");
			}
		});
		btnDowhile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("do~{~~}while( );~");
			}
		});
		btnWhile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			type("while()~{~~}~");
			}
		});
		btnFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("for( ; ; )~{~~}~");
			}
		});
		btnEnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("enum [enum-variable-name] { , , };~");
			}
		});
		btnStruct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("struct [struct-type-name]~{~[type variable-names] ;~...~}[structure-variables];~");
			}
		});
		btnUnion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("union [union-type-name]~{~type variable-names;~...~}[union-variables];~");
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			type("[Return-type] [function-name]([argument list])~{~~}~");
			}
		});
		btnHelloWorld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// for typing " we should use \"
				type("#include <stdio.h>~void main()~{~printf(\"Hello World\");~}~");				
			}
		});
		btnIncludeHeader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type("#include < >~");
			}
		});
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("C++ Keyboard", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnInclude = new JButton("Include");
		btnInclude.setBounds(10, 11, 89, 23);
		panel_1.add(btnInclude);
		
		JButton btnCout = new JButton("cout");
		btnCout.setBounds(10, 55, 89, 23);
		panel_1.add(btnCout);
		
		JButton btnCin = new JButton("cin");
		btnCin.setBounds(10, 89, 89, 23);
		panel_1.add(btnCin);
		
		JButton btnComment_1 = new JButton("comment");
		btnComment_1.setBounds(10, 123, 89, 23);
		panel_1.add(btnComment_1);
		
		JButton btnIfelse = new JButton("if-else");
		btnIfelse.setBounds(109, 55, 89, 23);
		panel_1.add(btnIfelse);
		
		JButton btnWhile_1 = new JButton("while");
		btnWhile_1.setBounds(208, 89, 89, 23);
		panel_1.add(btnWhile_1);
		
		JButton btnHelloWorld_1 = new JButton("Hello World");
		btnHelloWorld_1.setBounds(109, 11, 188, 23);
		panel_1.add(btnHelloWorld_1);
		
		JButton btnFunction = new JButton("Function");
		btnFunction.setBounds(307, 11, 89, 23);
		panel_1.add(btnFunction);
		
		JButton btnSwitch = new JButton("switch");
		btnSwitch.setBounds(109, 89, 89, 23);
		panel_1.add(btnSwitch);
		
		JButton btnContinue = new JButton("continue");
		btnContinue.setBounds(109, 123, 89, 23);
		panel_1.add(btnContinue);
		
		JButton btnBreak_1 = new JButton("break");
		btnBreak_1.setBounds(109, 157, 89, 23);
		panel_1.add(btnBreak_1);
		
		JButton btnFor_1 = new JButton("for");
		btnFor_1.setBounds(208, 55, 89, 23);
		panel_1.add(btnFor_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Java Keyboard", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(10, 11, 89, 23);
		panel_2.add(btnImport);
		
		JButton btnPrintln = new JButton("print");
		btnPrintln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.print("print button in java");
			}
		});
		btnPrintln.setBounds(10, 45, 89, 23);
		panel_2.add(btnPrintln);
		
		JButton btnScannerObject = new JButton("scanner obj");
		btnScannerObject.setBounds(10, 79, 89, 23);
		panel_2.add(btnScannerObject);
		
		JButton btnScan = new JButton("scan");
		btnScan.setBounds(10, 113, 89, 23);
		panel_2.add(btnScan);
		
		JButton btnIfelse_1 = new JButton("if-else");
		btnIfelse_1.setBounds(109, 45, 89, 23);
		panel_2.add(btnIfelse_1);
		
		JButton btnWhile_2 = new JButton("while");
		btnWhile_2.setBounds(208, 79, 89, 23);
		panel_2.add(btnWhile_2);
		
		JButton btnHelloWorld_2 = new JButton("Hello World");
		btnHelloWorld_2.setBounds(109, 11, 188, 23);
		panel_2.add(btnHelloWorld_2);
		
		JButton btnFunction_1 = new JButton("Function");
		btnFunction_1.setBounds(307, 11, 89, 23);
		panel_2.add(btnFunction_1);
		
		JButton btnSwitch_1 = new JButton("switch");
		btnSwitch_1.setBounds(109, 79, 89, 23);
		panel_2.add(btnSwitch_1);
		
		JButton btnFor_2 = new JButton("for");
		btnFor_2.setBounds(208, 45, 89, 23);
		panel_2.add(btnFor_2);
		
		JButton btnNewButton_3 = new JButton("int");
		btnNewButton_3.setBounds(307, 45, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JButton btnFloat = new JButton("float");
		btnFloat.setBounds(307, 79, 89, 23);
		panel_2.add(btnFloat);
		
		JButton btnString = new JButton("string");
		btnString.setBounds(307, 113, 89, 23);
		panel_2.add(btnString);
		
		
	}
	
	
	private void type(String s){
        try {
            int i;
            char c;
            Robot bot = new Robot();
            for(i=0;i<s.length();i++)
            {
                
                c=s.charAt(i);
                switch(c)
                {
                    case 'a':
                        bot.keyPress(KeyEvent.VK_A);
                        bot.keyRelease(KeyEvent.VK_A);                        
                        break;
                    case 'b':                        
                        bot.keyPress(KeyEvent.VK_B);
                        bot.keyRelease(KeyEvent.VK_B);
                        break;
                    case 'c':                        
                        bot.keyPress(KeyEvent.VK_C);
                        bot.keyRelease(KeyEvent.VK_C);
                        break;
                    case 'd':
                        bot.keyPress(KeyEvent.VK_D);
                        bot.keyRelease(KeyEvent.VK_D);                        
                        break;
                    case 'e':
                        bot.keyPress(KeyEvent.VK_E);
                        bot.keyRelease(KeyEvent.VK_E);
                        break;
                    case 'f':
                        bot.keyPress(KeyEvent.VK_F);
                        bot.keyRelease(KeyEvent.VK_F);
                        break;
                    case 'g':
                        bot.keyPress(KeyEvent.VK_G);
                        bot.keyRelease(KeyEvent.VK_G);
                        break;
                    case 'h':
                        bot.keyPress(KeyEvent.VK_H);
                        bot.keyRelease(KeyEvent.VK_H);
                        break;
                    case 'i':
                        bot.keyPress(KeyEvent.VK_I);
                        bot.keyRelease(KeyEvent.VK_I);
                        break;
                    case 'j':
                        bot.keyPress(KeyEvent.VK_J);
                        bot.keyRelease(KeyEvent.VK_J);
                        break;
                    case 'k':
                        bot.keyPress(KeyEvent.VK_K);
                        bot.keyRelease(KeyEvent.VK_K);
                        break;
                    case 'l':
                        bot.keyPress(KeyEvent.VK_L);
                        bot.keyRelease(KeyEvent.VK_L);
                        break;
                    case 'm':
                        bot.keyPress(KeyEvent.VK_M);
                        bot.keyRelease(KeyEvent.VK_M);
                        break;
                    case 'n':
                        bot.keyPress(KeyEvent.VK_N);
                        bot.keyRelease(KeyEvent.VK_N);
                        break;
                    case 'o':
                        bot.keyPress(KeyEvent.VK_O);
                        bot.keyRelease(KeyEvent.VK_O);
                        break;
                    case 'p':
                        bot.keyPress(KeyEvent.VK_P);
                        bot.keyRelease(KeyEvent.VK_P);
                        break;
                    case 'q':
                        bot.keyPress(KeyEvent.VK_Q);
                        bot.keyRelease(KeyEvent.VK_Q);
                        break;
                    case 'r':
                        bot.keyPress(KeyEvent.VK_R);
                        bot.keyRelease(KeyEvent.VK_R);
                        break;                    
                    case 's':
                        bot.keyPress(KeyEvent.VK_S);
                        bot.keyRelease(KeyEvent.VK_S);
                        break;    
                    case 't':
                        bot.keyPress(KeyEvent.VK_T);
                        bot.keyRelease(KeyEvent.VK_T);
                        break;
                    case 'u':
                        bot.keyPress(KeyEvent.VK_U);
                        bot.keyRelease(KeyEvent.VK_U);
                        break;
                    case 'v':
                        bot.keyPress(KeyEvent.VK_V);
                        bot.keyRelease(KeyEvent.VK_V);
                        break;
                    case 'w':
                        bot.keyPress(KeyEvent.VK_W);
                        bot.keyRelease(KeyEvent.VK_W);
                        break;
                    case 'x':
                        bot.keyPress(KeyEvent.VK_X);
                        bot.keyRelease(KeyEvent.VK_X);
                        break;
                    case 'y':
                        bot.keyPress(KeyEvent.VK_Y);
                        bot.keyRelease(KeyEvent.VK_Y);
                        break;
                    case 'z':
                        bot.keyPress(KeyEvent.VK_Z);
                        bot.keyRelease(KeyEvent.VK_Z);
                        break;
                    case 'A':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);                        
                    	bot.keyPress(KeyEvent.VK_A);
                        bot.keyRelease(KeyEvent.VK_A);                        
                        bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                        bot.keyRelease(KeyEvent.VK_CAPS_LOCK);                  
                        break;
                    case 'B':  
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_B);
                        bot.keyRelease(KeyEvent.VK_B);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'C':                        
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyPress(KeyEvent.VK_C);
                        bot.keyRelease(KeyEvent.VK_C);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'D':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyPress(KeyEvent.VK_D);
                        bot.keyRelease(KeyEvent.VK_D);                        
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'E':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyPress(KeyEvent.VK_E);
                        bot.keyRelease(KeyEvent.VK_E);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'F':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_F);
                        bot.keyRelease(KeyEvent.VK_F);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'G':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_G);
                        bot.keyRelease(KeyEvent.VK_G);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'H':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_H);
                        bot.keyRelease(KeyEvent.VK_H);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'I':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_I);
                        bot.keyRelease(KeyEvent.VK_I);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'J':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_J);
                        bot.keyRelease(KeyEvent.VK_J);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'K':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_K);
                        bot.keyRelease(KeyEvent.VK_K);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'L':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_L);
                        bot.keyRelease(KeyEvent.VK_L);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'M':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_M);
                        bot.keyRelease(KeyEvent.VK_M);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'N':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_N);
                        bot.keyRelease(KeyEvent.VK_N);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'O':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_O);
                        bot.keyRelease(KeyEvent.VK_O);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'P':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_P);
                        bot.keyRelease(KeyEvent.VK_P);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'Q':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_Q);
                        bot.keyRelease(KeyEvent.VK_Q);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'R':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_R);
                        bot.keyRelease(KeyEvent.VK_R);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;                    
                    case 'S':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_S);
                        bot.keyRelease(KeyEvent.VK_S);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;    
                    case 'T':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_T);
                        bot.keyRelease(KeyEvent.VK_T);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'U':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_U);
                        bot.keyRelease(KeyEvent.VK_U);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'V':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_V);
                        bot.keyRelease(KeyEvent.VK_V);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'W':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_W);
                        bot.keyRelease(KeyEvent.VK_W);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'X':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_X);
                        bot.keyRelease(KeyEvent.VK_X);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'Y':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_Y);
                        bot.keyRelease(KeyEvent.VK_Y);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;
                    case 'Z':
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        bot.keyPress(KeyEvent.VK_Z);
                        bot.keyRelease(KeyEvent.VK_Z);
                    	bot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    	bot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                        break;                       
                    case '{':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                        bot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case '}':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                        bot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case '[':
                        bot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                        bot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                        break;
                    case ']':
                        bot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                        bot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                        break;
                    case '(':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_9);
                        bot.keyRelease(KeyEvent.VK_9);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case ')':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_0);
                        bot.keyRelease(KeyEvent.VK_0);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case ';':                        
                        bot.keyPress(KeyEvent.VK_SEMICOLON);
                        bot.keyRelease(KeyEvent.VK_SEMICOLON);                        
                        break;
                    case '"':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_QUOTE);
                        bot.keyRelease(KeyEvent.VK_QUOTE);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case ',':
                        bot.keyPress(KeyEvent.VK_COMMA);
                        bot.keyRelease(KeyEvent.VK_COMMA);
                        break;
                    case ':':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_SEMICOLON);
                        bot.keyRelease(KeyEvent.VK_SEMICOLON);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;                        
                    case '#':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_3);
                        bot.keyRelease(KeyEvent.VK_3);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case '<':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_COMMA);
                        bot.keyRelease(KeyEvent.VK_COMMA);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;
                    case '>':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_PERIOD);
                        bot.keyRelease(KeyEvent.VK_PERIOD);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;                    
                    case '%':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_5);
                        bot.keyRelease(KeyEvent.VK_5);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;                    
                    case '&':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_7);
                        bot.keyRelease(KeyEvent.VK_7);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;       
                    case '*':
                        bot.keyPress(KeyEvent.VK_SHIFT);                   
                        bot.keyPress(KeyEvent.VK_8);
                        bot.keyRelease(KeyEvent.VK_8);
                        bot.keyRelease(KeyEvent.VK_SHIFT);
                        break;       
                    case '/':
                        bot.keyPress(KeyEvent.VK_SLASH);
                        bot.keyRelease(KeyEvent.VK_SLASH);
                        break;       
                              case '.':
                        bot.keyPress(KeyEvent.VK_PERIOD);
                        bot.keyRelease(KeyEvent.VK_PERIOD);
                        break;                   
                    case ' ':
                        bot.keyPress(KeyEvent.VK_SPACE);
                        bot.keyRelease(KeyEvent.VK_SPACE);
                        break;                        
                    case '~':
                        bot.keyPress(KeyEvent.VK_ENTER);
                        bot.keyRelease(KeyEvent.VK_ENTER);
                        break;
                    case '-':
                        bot.keyPress(KeyEvent.VK_MINUS);
                        bot.keyRelease(KeyEvent.VK_MINUS);
                        break;
                        
                    default:
                        System.out.println("unknown key");
                        break;
                        
                }
                
            }   } catch (AWTException ex) {
           JOptionPane.showMessageDialog(null, "Error while Printing keys");
        }
        
    }
}
