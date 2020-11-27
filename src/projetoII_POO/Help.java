package projetoII_POO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setTitle("Ajuda ICONVERT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 237);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Help.class.getResource("/img/unicamp (2).png")));
		lblNewLabel.setBounds(41, 26, 131, 112);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrEsseProgramaFoi = new JTextArea();
		txtrEsseProgramaFoi.setWrapStyleWord(true);
		txtrEsseProgramaFoi.setLineWrap(true);
		txtrEsseProgramaFoi.setEditable(false);
		txtrEsseProgramaFoi.setColumns(5);
		txtrEsseProgramaFoi.setText("Esse programa foi feito com o objetivo de colocar em pr\u00E1tica os conhecimentos adquiridos em Programa\u00E7\u00E3o Orientada a Objetos II.");
		txtrEsseProgramaFoi.setBounds(210, 26, 255, 112);
		contentPane.add(txtrEsseProgramaFoi);
	}
}
