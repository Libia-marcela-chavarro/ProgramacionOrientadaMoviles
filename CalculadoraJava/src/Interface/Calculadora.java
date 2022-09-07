package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.SystemColor;
import java.awt.Font;

public class Calculadora extends JFrame {

	protected double num1 = 0;
	protected double num2 = 0;

	private String tipoOperacion;
	private String resultado;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 592);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.scrollbar);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(6, 4, 2, 2));

		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble(textField.getText());
				if (num1 != 0 && num2 != 0) {
					Double res = (Double.parseDouble(textField.getText())/100)*(num1);
		            String resultado = String.valueOf(res);
		            textField.setText(resultado);
		        } else {
		        	textField.setText("0");
		            num1 = 0;
		            num2 = 0;
		            tipoOperacion = null;
		            resultado = null;
		        }
			}
		});
		panel_1.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("√");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numActual = Double.parseDouble(textField.getText());
				String rCuadrada = String.valueOf(Math.sqrt(numActual));
				if(rCuadrada.length() > 8) {
					textField.setText(rCuadrada.substring(0, 8));
				} else {
					textField.setText(rCuadrada);
				}
					
				
				
				
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_1);

		JButton btnNewButton_7 = new JButton("x²");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numActual = Double.parseDouble(textField.getText());
				String cuadrado = String.valueOf(numActual*numActual);
				textField.setText(cuadrado);
			}
		});
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_7);

		JButton btnNewButton_4 = new JButton("1/X");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numActual = Double.parseDouble(textField.getText());
				if(numActual != 0) {
					String cuadrado = String.valueOf(1/numActual);
					textField.setText(cuadrado);
				} else {
					textField.setText("ERROR");
				}
			}
		});
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_4);

		JButton btnNewButton_6 = new JButton("CE");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				num1 = 0;
				num2 = 0;
				resultado = null;
				tipoOperacion = null;
			}
		});
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_6);

		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				num1 = 0;
				num2 = 0;
				resultado = null;
				tipoOperacion = null;
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton);

		JButton btnNewButton_3 = new JButton("⌫");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().substring(0, textField.getText().length()-1));
				
			}
		});
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_3);

		JButton btnNewButton_8 = new JButton("÷");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerOperacion("÷");
			}
		});
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_8);

		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("7");
			}
		});
		btnNewButton_5.setBackground(SystemColor.controlHighlight);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_5);

		JButton btnNewButton_12 = new JButton("8");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("8");
			}
		});
		btnNewButton_12.setBackground(SystemColor.controlHighlight);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_12);

		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("9");
			}
		});
		btnNewButton_10.setBackground(SystemColor.controlHighlight);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_10);

		JButton btnNewButton_9 = new JButton("X");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerOperacion("*");
			}
		});
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_9);

		JButton btnNewButton_15 = new JButton("4");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("4");
			}
		});
		btnNewButton_15.setBackground(SystemColor.controlHighlight);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_15);

		JButton btnNewButton_18 = new JButton("5");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("5");
			}
		});
		btnNewButton_18.setBackground(SystemColor.controlHighlight);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_18);

		JButton btnNewButton_11 = new JButton("6");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("6");
			}
		});
		btnNewButton_11.setBackground(SystemColor.controlHighlight);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_11);

		JButton btnNewButton_17 = new JButton("-");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerOperacion("-");
			}
		});
		btnNewButton_17.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_17);

		JButton btnNewButton_16 = new JButton("1");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("1");
			}
		});
		btnNewButton_16.setBackground(SystemColor.controlHighlight);
		panel_1.add(btnNewButton_16);

		JButton btnNewButton_20 = new JButton("2");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("2");
			}
		});
		btnNewButton_20.setBackground(SystemColor.controlHighlight);
		panel_1.add(btnNewButton_20);

		JButton btnNewButton_21 = new JButton("3");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("3");
			}
		});
		btnNewButton_21.setBackground(SystemColor.controlHighlight);
		panel_1.add(btnNewButton_21);

		JButton btnNewButton_23 = new JButton("+");
		btnNewButton_23.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ponerOperacion("+");
			}
		});
		btnNewButton_23.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_23);

		JButton btnNewButton_22 = new JButton("±");
		btnNewButton_22.setBackground(Color.LIGHT_GRAY);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char primerCaracter = textField.getText().charAt(0);
				if (!textField.getText().equals("0")) {
					if (primerCaracter == '-') {
						textField.setText(textField.getText().substring(1, textField.getText().length()));
					} else {
						textField.setText("-"+textField.getText());
					}
				}
			}
		});
		panel_1.add(btnNewButton_22);

		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerNumero("0");
			}
		});
		btnNewButton_13.setBackground(SystemColor.controlHighlight);
		panel_1.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton(",");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String visor = textField.getText();
				if (!visor.contains(".")) {
					textField.setText(textField.getText()+".");
				}
			}
		});
		btnNewButton_14.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_14);

		JButton btnNewButton_19 = new JButton("=");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("resultado al iniciar: "+resultado);

				if (resultado == null) {
					num2 = Double.parseDouble(textField.getText());
					
				} else {
					num1 = num2;
					num2 = Double.parseDouble(textField.getText());
				}
				
				
				System.out.println("num1 "+num1);
				System.out.println("num2 "+num2);
				switch (tipoOperacion) {
					case "+": {
						num2 = Double.parseDouble(textField.getText());
						resultado = String.valueOf(num1 + num2);
						textField.setText(resultado);
						break;
					}
					case "-": {
						num2 = Double.parseDouble(textField.getText());
						resultado = String.valueOf(num1 - num2);
						textField.setText(resultado);
						
						break;
					}
					case "÷": {
						num2 = Double.parseDouble(textField.getText());
						if (num2 != 0) {
							resultado = String.valueOf(num1 / num2);
							textField.setText(resultado);
						} else {
							textField.setText("ERROR");
						}
						
						break;
					}
					case "*": {
						num2 = Double.parseDouble(textField.getText());
						resultado = String.valueOf(num1 * num2);
						textField.setText(resultado);
						break;
					}
				}
				System.out.println("resultado al iniciar: "+resultado);
			}
		});
		btnNewButton_19.setBackground(Color.LIGHT_GRAY);
		panel_1.add(btnNewButton_19);

		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.NORTH);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("0");
		textField.setHorizontalAlignment(textField.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 70));
		panel.add(textField);
		textField.setColumns(7);
	}

	public void ponerNumero(String pNum) {
		String num = textField.getText();
		if (!textField.getText().equals("0")) {
			textField.setText(num);
			num += pNum;
		} else {
			textField.setText("");
			num = pNum;
		}
		textField.setText(num);
	}
	
	public void ponerOperacion(String pOp) {
		if (tipoOperacion == null) {
			num1 = Double.parseDouble(textField.getText());
			tipoOperacion = pOp;
			textField.setText("0");
		} else {
			num1 = Double.parseDouble(resultado);
			resultado = null;
			num2 = 0;
			tipoOperacion = pOp;
			textField.setText("0");
		}
	}
	
}
