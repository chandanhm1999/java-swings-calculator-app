import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPro extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPro frame = new FirstPro();
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
	public FirstPro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CALCULATOR");
		heading.setBackground(new Color(0, 0, 160));
		heading.setFont(new Font("Constantia", Font.BOLD, 18));
		heading.setBounds(142, 10, 122, 23);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("A");
		labela.setForeground(new Color(255, 0, 0));
		labela.setBackground(new Color(255, 0, 0));
		labela.setFont(new Font("Constantia", Font.BOLD, 16));
		labela.setBounds(115, 59, 15, 20);
		contentPane.add(labela);
		
		tfa = new JTextField();
		tfa.setBounds(168, 58, 96, 19);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelb = new JLabel("B");
		labelb.setForeground(Color.RED);
		labelb.setFont(new Font("Constantia", Font.BOLD, 16));
		labelb.setBackground(Color.RED);
		labelb.setBounds(115, 103, 20, 20);
		contentPane.add(labelb);
		
		JLabel labelresult = new JLabel("Result");
		labelresult.setForeground(Color.RED);
		labelresult.setFont(new Font("Constantia", Font.BOLD, 16));
		labelresult.setBackground(Color.RED);
		labelresult.setBounds(94, 146, 50, 20);
		contentPane.add(labelresult);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(168, 102, 96, 19);
		contentPane.add(tfb);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(168, 145, 96, 19);
		contentPane.add(tfr);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//logic to add
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				int res = var1 + var2;
				String result = String.valueOf(res);
				tfr.setText(result);
				
			}
		});
		add.setFont(new Font("Tahoma", Font.BOLD, 12));
		add.setForeground(new Color(255, 0, 128));
		add.setBounds(32, 190, 67, 23);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to sub
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);
				int res = var1 - var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		sub.setForeground(new Color(255, 0, 128));
		sub.setFont(new Font("Tahoma", Font.BOLD, 12));
		sub.setBounds(109, 190, 67, 23);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to mul
			String data1 = tfa.getText();
			String data2 = tfb.getText();
			int var1 = Integer.valueOf(data1);
			int var2 = Integer.valueOf(data2);
			int res = var1 * var2;
			String result = String.valueOf(res);
			tfr.setText(result);
			}
		});
		mul.setForeground(new Color(255, 0, 128));
		mul.setFont(new Font("Tahoma", Font.BOLD, 12));
		mul.setBounds(186, 190, 69, 23);
		contentPane.add(mul);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to div
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				Float var1 = Float.valueOf(data1);
				Float var2 = Float.valueOf(data2);
				Float res = var1 / var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		btnDiv.setForeground(new Color(255, 0, 128));
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDiv.setBounds(265, 190, 59, 23);
		contentPane.add(btnDiv);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//logic to rem
				int var1 = Integer.valueOf(tfa.getText());
				int var2 = Integer.valueOf(tfa.getText());
				int res = var1 % var2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		rem.setForeground(new Color(255, 0, 128));
		rem.setFont(new Font("Tahoma", Font.BOLD, 12));
		rem.setBounds(340, 190, 67, 23);
		contentPane.add(rem);
	}
}
