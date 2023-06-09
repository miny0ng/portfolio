import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class LogoFrame extends JFrame {
	
	private Image img_logo = new ImageIcon(LoginForm.class.getResource("res/LOGO2.png")).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);
	private Image img_logo1 = new ImageIcon(LoginForm.class.getResource("res/LOGO3.png")).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);
	private Image img_logo2 = new ImageIcon(LoginForm.class.getResource("res/LOGO4.png")).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);
	private Image img_logo3 = new ImageIcon(LoginForm.class.getResource("res/LOGO5.png")).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);
	private Image img_logo4 = new ImageIcon(LoginForm.class.getResource("res/LOGO6.png")).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogoFrame frame = new LogoFrame();
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
	public LogoFrame() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Logo");
		lblNewLabel.setFont(new Font("Objective Medium", Font.PLAIN, 25));
		lblNewLabel.setBounds(28, 11, 337, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblLOGO2 = new JLabel("");
		lblLOGO2.setBounds(72, 102, 150, 150);
		lblLOGO2.setIcon(new ImageIcon(img_logo));
		contentPane.add(lblLOGO2);
		
		JLabel lblLOGO3 = new JLabel("");
		lblLOGO3.setBounds(313, 102, 150, 150);
		lblLOGO3.setIcon(new ImageIcon(img_logo1));
		contentPane.add(lblLOGO3);
		
		JLabel lblLOGO4 = new JLabel("");
		lblLOGO4.setBounds(562, 102, 150, 150);
		lblLOGO4.setIcon(new ImageIcon(img_logo2));
		contentPane.add(lblLOGO4);
		
		JLabel lblLOGO5 = new JLabel("");
		lblLOGO5.setBounds(190, 263, 150, 150);
		lblLOGO5.setIcon(new ImageIcon(img_logo3));
		contentPane.add(lblLOGO5);
		
		JLabel lblLOGO6 = new JLabel("");
		lblLOGO6.setBounds(439, 263, 150, 150);
		lblLOGO6.setIcon(new ImageIcon(img_logo4));
		contentPane.add(lblLOGO6);
		
		JLabel lblPhp = new JLabel("Php 150 - 500");
		lblPhp.setFont(new Font("Objective", Font.PLAIN, 15));
		lblPhp.setBounds(28, 38, 337, 39);
		contentPane.add(lblPhp);
	}
}
