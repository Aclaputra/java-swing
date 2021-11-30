import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cobagui {
	/**
	 * Nama: M. Acla Alamsyah Putra
	 * NIM: 1922423380
	 */
	private JFrame frame;
	private JTextField textFieldAlas1;
	private JTextField textFieldTinggi1;
	private JTextField textFieldLuas1;
	private JTextField textFieldAlas2;
	private JTextField textFieldTinggi2;
	private JTextField textFieldLuas2;
	private JTextField textFieldHasilSegitiga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cobagui window = new cobagui();
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
	public cobagui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Judul = DefaultComponentFactory.getInstance().createLabel("Menghitung 2 Buah Luas Segitiga");
		Judul.setBounds(27, 11, 304, 14);
		panel.add(Judul);
		
		JLabel alas1 = new JLabel("Alas 1");
		alas1.setBounds(27, 33, 46, 14);
		panel.add(alas1);
		
		JLabel tinggi1 = new JLabel("Tinggi 1");
		tinggi1.setBounds(27, 60, 46, 14);
		panel.add(tinggi1);
		
		JLabel luas1 = new JLabel("Luas 1");
		luas1.setBounds(27, 85, 46, 14);
		panel.add(luas1);
		
		JLabel alas2 = new JLabel("Alas 2");
		alas2.setBounds(27, 121, 46, 14);
		panel.add(alas2);
		
		JLabel tinggi2 = new JLabel("Tinggi 2");
		tinggi2.setBounds(27, 145, 46, 14);
		panel.add(tinggi2);
		
		JLabel luas2 = new JLabel("Luas 2");
		luas2.setBounds(27, 171, 46, 14);
		panel.add(luas2);
		
		JLabel hasilLuasSegitiga = new JLabel("LUAS SEGITIGA YANG BESAR ADALAH :");
		hasilLuasSegitiga.setBounds(27, 206, 241, 14);
		panel.add(hasilLuasSegitiga);
		
		textFieldAlas1 = new JTextField(0);
		textFieldAlas1.setBounds(108, 30, 86, 20);
		panel.add(textFieldAlas1);
		textFieldAlas1.setColumns(10);
		
		textFieldTinggi1 = new JTextField();
		textFieldTinggi1.setColumns(10);
		textFieldTinggi1.setBounds(109, 57, 86, 20);
		panel.add(textFieldTinggi1);
		
		textFieldLuas1 = new JTextField();
		textFieldLuas1.setEditable(false);
		textFieldLuas1.setColumns(10);
		textFieldLuas1.setBounds(109, 82, 86, 20);
		panel.add(textFieldLuas1);
		
		textFieldAlas2 = new JTextField();
		textFieldAlas2.setColumns(10);
		textFieldAlas2.setBounds(109, 118, 86, 20);
		panel.add(textFieldAlas2);
		
		textFieldTinggi2 = new JTextField();
		textFieldTinggi2.setColumns(10);
		textFieldTinggi2.setBounds(109, 142, 86, 20);
		panel.add(textFieldTinggi2);
		
		textFieldLuas2 = new JTextField();
		textFieldLuas2.setEditable(false);
		textFieldLuas2.setColumns(10);
		textFieldLuas2.setBounds(109, 168, 86, 20);
		panel.add(textFieldLuas2);
		
		textFieldHasilSegitiga = new JTextField();
		textFieldHasilSegitiga.setEditable(false);
		textFieldHasilSegitiga.setColumns(10);
		textFieldHasilSegitiga.setBounds(245, 203, 141, 20);
		panel.add(textFieldHasilSegitiga);
		
		JButton btnProses = new JButton("Proses");
		btnProses.setBounds(267, 81, 119, 23);
		panel.add(btnProses);
		
		JButton btnBersihkan = new JButton("Bersihkan");
		btnBersihkan.setBounds(267, 121, 119, 23);
		panel.add(btnBersihkan);
		
		// Backend hitung 2 luas Segitiga
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Alas1 = Integer.parseInt(textFieldAlas1.getText());
				int Tinggi1 = Integer.parseInt(textFieldTinggi1.getText());
				int Hasil1 = Alas1 * Tinggi1 / 2;
				textFieldLuas1.setText(Integer.toString(Hasil1));
				
				int Alas2 = Integer.parseInt(textFieldAlas2.getText());
				int Tinggi2 = Integer.parseInt(textFieldTinggi2.getText());
				int Hasil2 = Alas2 * Tinggi2 / 2;
				textFieldLuas2.setText(Integer.toString(Hasil2));
				
				if(Hasil1 > Hasil2) {
					textFieldHasilSegitiga.setText("Segitiga 1 = " + Hasil1);
				} else if (Hasil1 < Hasil2) {
					textFieldHasilSegitiga.setText("Segitiga 2 = " + Hasil2);
				} else {
					textFieldHasilSegitiga.setText("Segitiga sama besar");
				}

			}
		});
		// Fungsi membersihkan textFields
		btnBersihkan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAlas1.setText(null);
				textFieldTinggi1.setText(null);
				textFieldLuas1.setText(null);
				textFieldAlas2.setText(null);
				textFieldTinggi2.setText(null);
				textFieldLuas2.setText(null);
				textFieldHasilSegitiga.setText(null);
			}
		});
	}
}
