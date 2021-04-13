package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class inicio extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfUser;
	private JLabel lblNewLabel_1;
	private JButton btnValidar;
	protected ppal sv;
	private JPasswordField tfContras;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
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
	public inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 324);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Video Club");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 0, 218, 55);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(51, 66, 60, 14);
		contentPane.add(lblNewLabel);
		
		tfUser = new JTextField();
		tfUser.setBounds(51, 91, 141, 30);
		contentPane.add(tfUser);
		tfUser.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(51, 129, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		btnValidar = new JButton("Entrar\r\n");
		btnValidar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnValidar.setBackground(Color.WHITE);
		btnValidar.addActionListener(this);
		btnValidar.setBounds(135, 216, 93, 25);
		contentPane.add(btnValidar);
		
		tfContras = new JPasswordField();
		tfContras.setBounds(51, 153, 141, 30);
		contentPane.add(tfContras);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(10, 216, 93, 25);
		contentPane.add(btnSalir);
	}
	protected JButton getBtnNewButton() {
		return btnValidar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object evento = e.getSource();
		/*if(evento.equals(btnLimpiar)) {
			tfUser.setText("");
			tfContras.setText("");
		}*/
		if(evento.equals(btnValidar)) {
			sv=new ppal();
			sv.setVisible(true);
			dispose();
		}
		if(evento.equals(btnSalir)) {
			System.exit(WIDTH);
		}
		
	}
	
}
