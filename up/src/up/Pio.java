package up;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DropMode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pio {

	private JFrame frame;
	private JTextField textField;
	
	private String numeroHex1;
	private int numeroHex1_to_dec;
	private String numeroHex2;
	private int numeroHex2_to_dec;
	
	
	private int tipo = 0;
	
	private StringBuilder zz = new StringBuilder("");
	//aca

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pio window = new Pio();
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
	public Pio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel layoutRisulta = new JPanel();
		frame.getContentPane().add(layoutRisulta, BorderLayout.NORTH);
		layoutRisulta.setLayout(new GridLayout(2, 0, 0, 10));
		
		textField = new JTextField();
		textField.setEditable(false);
		layoutRisulta.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		layoutRisulta.add(panel);
		panel.setLayout(new GridLayout(2, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Dec: ");
		panel.add(lblNewLabel);
		
		JLabel risultatodec = new JLabel("");
		panel.add(risultatodec);
		
		JLabel lblNewLabel_1 = new JLabel("Bin: ");
		panel.add(lblNewLabel_1);
		
		JLabel risultatoBin = new JLabel("");
		panel.add(risultatoBin);
		
		JPanel tasti = new JPanel();
		frame.getContentPane().add(tasti, BorderLayout.CENTER);
		tasti.setLayout(new GridLayout(6, 4, 0, 0));
		
		JButton btn_AC = new JButton("AC");
		
		tasti.add(btn_AC);
		
		JButton btn_DEL = new JButton("DEL");
		tasti.add(btn_DEL);
		
		JButton btn_MOD = new JButton("%");
		tasti.add(btn_MOD);
		
		JButton btn_diviso = new JButton("/");
		tasti.add(btn_diviso);
		
		JButton btn_F = new JButton("F");
		
		tasti.add(btn_F);
		
		JButton btn_E = new JButton("E");
		tasti.add(btn_E);
		
		JButton btn_D = new JButton("D");
		tasti.add(btn_D);
		
		JButton btn_mol = new JButton("x");
		btn_mol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tasti.add(btn_mol);
		
		JButton btn_C = new JButton("C");
		tasti.add(btn_C);
		
		JButton btn_B = new JButton("B");
		tasti.add(btn_B);
		
		JButton btn_A = new JButton("A");
		tasti.add(btn_A);
		
		JButton btn_meno = new JButton("-");
		
		tasti.add(btn_meno);
		
		JButton btn_9 = new JButton("9");
		tasti.add(btn_9);
		
		JButton btn_8 = new JButton("8");
		tasti.add(btn_8);
		
		JButton btn_7 = new JButton("7");
		tasti.add(btn_7);
		
		JButton btn_piu = new JButton("+");
		
		tasti.add(btn_piu);
		
		JButton btn_6 = new JButton("6");
		tasti.add(btn_6);
		
		JButton btn_5 = new JButton("5");
		tasti.add(btn_5);
		
		JButton btn_4 = new JButton("4");
		tasti.add(btn_4);
		
		JButton btn_risultato = new JButton("=");
		
		tasti.add(btn_risultato);
		
		JButton btn_3 = new JButton("3");
		tasti.add(btn_3);
		
		JButton btn_2 = new JButton("2");
		tasti.add(btn_2);
		
		JButton btn_1 = new JButton("1");
		tasti.add(btn_1);
		
		JButton btn_0 = new JButton("0");
		tasti.add(btn_0);
		
		
		btn_F.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_F.getText());
				zz.append("F");
				

			
				
				
			}
		});
		
		btn_E.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_E.getText());
				zz.append("E");
				
				
			
			
				
			}
		});
		
		btn_D.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_D.getText());
				zz.append("D");
				
				
				
			}
		});
		
		btn_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_C.getText());
				zz.append("C");
				
				
				
				
			}
		});
		
		btn_B.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_B.getText());
				zz.append("B");
				
				
			
			}
		});
		
		btn_A.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_A.getText());
				zz.append("A");
				
				

			}
		});
		
		btn_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_9.getText());
				zz.append("9");
				
				
	
			}
		});
		
		btn_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_8.getText());
				zz.append("8");
				

			}
		});
		
		btn_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_7.getText());
				zz.append("7");
				
				
			}
		});
		
		btn_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_6.getText());
				zz.append("6");
				
				
				

			}
		});
		
		btn_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_5.getText());
				zz.append("5");
				
				

			}
		});
		
		btn_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_4.getText());
				zz.append("4");
				
				

			}
		});
		
		btn_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_3.getText());
				zz.append("3");
				
				

			}
		});
		
		btn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_2.getText());
				zz.append("2");
				
				
			
			}
		});
		
		btn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_1.getText());
				zz.append("1");
				
				
				

			}
		});
		
		btn_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText(textField.getText() +  btn_0.getText());
				zz.append("0");
				
				
				
			}
		});
		
		
		btn_AC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textField.setText("");
				zz.delete(0, zz.length()); //elimina tutta la stringa
				risultatodec.setText("");
				numeroHex1 = "";
				numeroHex2 = "";
				numeroHex1_to_dec = 0;
				numeroHex2_to_dec = 0;
			}
		});
		
		//somma
		btn_piu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				numeroHex1 = zz.toString();
				
				textField.setText(textField.getText()+ " + ");
				
				
				numeroHex1_to_dec = Integer.parseInt(numeroHex1,16);
				
				
				zz.delete(0, zz.length()); //elimina tutta la stringa
				
				System.out.println(zz.toString());
				
				tipo = 1;
			}
		});
		
		
		//differenza
		btn_meno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				numeroHex1 = zz.toString();
				
				textField.setText(textField.getText()+ " - ");
				
				
				numeroHex1_to_dec = Integer.parseInt(numeroHex1,16);
				
				
				zz.delete(0, zz.length()); //elimina tutta la stringa
				
				System.out.println(zz.toString());
				
				tipo = 2;
				
			}
		});
		
		//Moltiplicazione
			btn_mol.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						
						numeroHex1 = zz.toString();
						
						textField.setText(textField.getText()+ " * ");
						
						
						numeroHex1_to_dec = Integer.parseInt(numeroHex1,16);
						
						
						zz.delete(0, zz.length()); //elimina tutta la stringa
						
						System.out.println(zz.toString());
						
						tipo = 3;
						
					}
				});

			
			//Divisione
			btn_diviso.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						
						numeroHex1 = zz.toString();
						
						textField.setText(textField.getText()+ " / ");
						
						
						numeroHex1_to_dec = Integer.parseInt(numeroHex1,16);
						
						
						zz.delete(0, zz.length()); //elimina tutta la stringa
						
						System.out.println(zz.toString());
						
						tipo = 4;
						
					}
				});			
		
		//risultato
		
		btn_risultato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				numeroHex2 = zz.toString();
				
				System.out.println(numeroHex2);
				
				numeroHex2_to_dec = Integer.parseInt(numeroHex2,16);
				
				if(tipo == 1) {
					
					textField.setText(textField.getText() +" = " + Integer.toHexString(numeroHex2_to_dec+numeroHex1_to_dec) );
					
					risultatodec.setText(risultatodec.getText()+ ""+ (numeroHex2_to_dec+numeroHex1_to_dec));
					
					risultatoBin.setText(""+ Integer.toBinaryString(numeroHex2_to_dec+numeroHex1_to_dec));
				}
				else if(tipo ==2) {
					
					textField.setText(textField.getText() +" = " + Integer.toHexString(numeroHex1_to_dec-numeroHex2_to_dec) );
					
					risultatodec.setText(risultatodec.getText()+ ""+ (numeroHex1_to_dec-numeroHex2_to_dec));
					risultatoBin.setText(""+ Integer.toBinaryString(numeroHex1_to_dec-numeroHex2_to_dec));
				}
				
				else if(tipo ==3) {
					
					textField.setText(textField.getText() +" = " + Integer.toHexString(numeroHex1_to_dec*numeroHex2_to_dec) );
					
					risultatodec.setText(risultatodec.getText()+ ""+ (numeroHex1_to_dec*numeroHex2_to_dec));
					risultatoBin.setText(""+ Integer.toBinaryString(numeroHex2_to_dec*numeroHex1_to_dec));
					
				}else if(tipo==4) {
					textField.setText(textField.getText() +" = " + Integer.toHexString(numeroHex1_to_dec/numeroHex2_to_dec) );
					
					risultatodec.setText(risultatodec.getText()+ ""+ (numeroHex1_to_dec/numeroHex2_to_dec));
					risultatoBin.setText(""+ Integer.toBinaryString(numeroHex1_to_dec/numeroHex2_to_dec));
				}
				
				
				
				zz.delete(0, zz.length());
			}
		});
		
		
		
		
	}

}
