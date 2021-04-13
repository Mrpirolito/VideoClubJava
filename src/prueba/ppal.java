package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;

public class ppal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfSearch;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ppal frame = new ppal();
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
	public ppal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSearch = new JButton("");
		btnSearch.setBackground(Color.GRAY);
		btnSearch.setToolTipText("Abrir la barra de busqueda");
		btnSearch.setIcon(new ImageIcon("C:\\Users\\josem\\Pictures\\iconos\\Webp.net-resizeimage.png"));
		btnSearch.addActionListener(this);
		btnSearch.setBounds(748, 11, 50, 38);
		contentPane.add(btnSearch);
		
		tfSearch = new JTextField();
		tfSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
		tfSearch.setBackground(Color.WHITE);
		tfSearch.setBounds(583, 11, 215, 38);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		tfSearch.setVisible(false);
	}

	protected JTextField getTfSearch() {
		return tfSearch;
	}
	protected JButton getBtnSearch() {
		return btnSearch;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object evento = e.getSource();
		if(evento.equals(btnSearch)) {
			btnSearch.setVisible(false);
			tfSearch.setVisible(true);
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
