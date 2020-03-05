package Jolley.Dominic.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField NumeratorField;
	private JTextField DenominatorField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setBounds(44, 13, 71, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setBounds(258, 13, 84, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel resultLabel = new JLabel("Result");
		resultLabel.setBounds(152, 134, 154, 16);
		frame.getContentPane().add(resultLabel);
		
		JButton btnNewButton = new JButton("Calculate");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(128, 81, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		NumeratorField = new JTextField();
		NumeratorField.setBounds(12, 33, 116, 22);
		frame.getContentPane().add(NumeratorField);
		NumeratorField.setColumns(10);
		
		DenominatorField = new JTextField();
		DenominatorField.setBounds(226, 33, 116, 22);
		frame.getContentPane().add(DenominatorField);
		DenominatorField.setColumns(10);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			double Numerator = Double.parseDouble(NumeratorField.getText());
			double Denominator = Double.parseDouble(DenominatorField.getText());
			
		try {
			SimpleMath math = new SimpleMath();
			Double result = math.divide(Numerator, Denominator);
			resultLabel.setText(result.toString());
		}catch(Exception e) {
			resultLabel.setText("Cannot divide by 0");
		}
			}
		});
	}
}
