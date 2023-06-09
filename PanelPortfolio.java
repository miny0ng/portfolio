import java.awt.Color;


import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPortfolio extends JPanel {
	
	private Image img_folder = new ImageIcon(LoginForm.class.getResource("res/FLDR.png")).getImage().getScaledInstance(145,145, Image.SCALE_SMOOTH);
	private Image img_folder1 = new ImageIcon(LoginForm.class.getResource("res/FLDR1.png")).getImage().getScaledInstance(145,145, Image.SCALE_SMOOTH);
	private Image img_folder2 = new ImageIcon(LoginForm.class.getResource("res/FLDR2.png")).getImage().getScaledInstance(145,145, Image.SCALE_SMOOTH);
	private Image img_folder3 = new ImageIcon(LoginForm.class.getResource("res/FLDR3.png")).getImage().getScaledInstance(145,145, Image.SCALE_SMOOTH);
	private Image img_folder4 = new ImageIcon(LoginForm.class.getResource("res/FLDR4.png")).getImage().getScaledInstance(145,145, Image.SCALE_SMOOTH);
	private Image img_folder5 = new ImageIcon(LoginForm.class.getResource("res/FLDR5.png")).getImage().getScaledInstance(145,145, Image.SCALE_SMOOTH);
	private Image img_folder6 = new ImageIcon(LoginForm.class.getResource("res/FLDR6.png")).getImage().getScaledInstance(145,145, Image.SCALE_SMOOTH);

	/**
	 * Create the panel.
	 */
	public PanelPortfolio() {
		setBackground(new Color(255, 228, 225));
		setBounds(10, 77, 760, 439);
		setLayout(null);
		
		JLabel lblPortfolio = new JLabel("Portfolio");
		lblPortfolio.setForeground(new Color(205, 92, 92));
		lblPortfolio.setFont(new Font("Catline", Font.PLAIN, 25));
		lblPortfolio.setBounds(43, 23, 337, 39);
		add(lblPortfolio);
		
		JLabel lblF = new JLabel("");
		lblF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 // When clicked, create a new frame
                LogoFrame logoFrame = new LogoFrame();
                logoFrame.setDefaultCloseOperation(LogoFrame.DISPOSE_ON_CLOSE); // Close only the new frame
                logoFrame.setSize(400, 400);
                logoFrame.setLocationRelativeTo(null);
                logoFrame.setVisible(true);
			}
		});
		lblF.setIcon(new ImageIcon(img_folder));
		lblF.setBounds(43, 76, 145, 145);
		add(lblF);
		
		
		JLabel lblF1 = new JLabel("");
		lblF1.setIcon(new ImageIcon(img_folder1));
		lblF1.setBounds(211, 76, 145, 145);
		add(lblF1);
		
		JLabel lblF2 = new JLabel("");
		lblF2.setBounds(386, 76, 145, 145);
		lblF2.setIcon(new ImageIcon(img_folder2));
		add(lblF2);
		
		JLabel lblF3 = new JLabel("");
		lblF3.setBounds(565, 76, 145, 145);
		lblF3.setIcon(new ImageIcon(img_folder3));
		add(lblF3);
		
		JLabel lblF4 = new JLabel("");
		lblF4.setBounds(136, 259, 145, 145);
		lblF4.setIcon(new ImageIcon(img_folder4));
		add(lblF4);
		
		JLabel lblF5 = new JLabel("");
		lblF5.setBounds(304, 259, 145, 145);
		lblF5.setIcon(new ImageIcon(img_folder5));
		add(lblF5);
		
		JLabel lblF6 = new JLabel("");
		lblF6.setBounds(479, 259, 145, 145);
		lblF6.setIcon(new ImageIcon(img_folder6));
		add(lblF6);
		
		
		
	
	}
}
