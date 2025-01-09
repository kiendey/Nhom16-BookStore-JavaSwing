package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
    JLabel lblNewLabel = new JLabel("Màn hình chính");
	JLabel lblQunLSch = new JLabel("Quản lý sách");
	JLabel lblQunLNhn = new JLabel("Quản lý nhân viên");
	JLabel lblQunLNhp = new JLabel("Quản lý nhập hàng");
	JLabel lblQunLXut = new JLabel("Quản lý xuất hàng");
	JLabel lblThngK = new JLabel("Thống kê");
	JButton btnNewButton = new JButton("Log out");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/image/Itzikgur-My-Seven-Books-2.512.png")));
		setTitle("Trang chủ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 590);
        JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(-16, 0, 242, 570);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" SunFlower");
		lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/image/Iconshow-Agriculture-Sunflower.48.png")));
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(20, 10, 177, 68);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 102, 255));
		panel_1.setBounds(20, 78, 209, 52);
		panel.add(panel_1);
		panel_1.setLayout(null);
		

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 5, 189, 37);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(51, 153, 0));
		panel_1_1.setBounds(20, 149, 212, 52);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		

		lblQunLSch.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLSch.setForeground(Color.WHITE);
		lblQunLSch.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLSch.setBounds(10, 10, 192, 37);
		panel_1_1.add(lblQunLSch);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(51, 153, 0));
		panel_1_1_1.setBounds(20, 226, 209, 52);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		

		lblQunLNhn.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLNhn.setForeground(Color.WHITE);
		lblQunLNhn.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLNhn.setBounds(10, 10, 189, 37);
		panel_1_1_1.add(lblQunLNhn);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(new Color(51, 153, 0));
		panel_1_1_2.setBounds(20, 299, 209, 52);
		panel.add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		

		lblQunLNhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLNhp.setForeground(Color.WHITE);
		lblQunLNhp.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLNhp.setBounds(10, 10, 185, 37);
		panel_1_1_2.add(lblQunLNhp);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(51, 153, 0));
		panel_1_1_1_1.setBounds(20, 370, 209, 52);
		panel.add(panel_1_1_1_1);
		

		lblQunLXut.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLXut.setForeground(Color.WHITE);
		lblQunLXut.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLXut.setBounds(10, 10, 177, 37);
		panel_1_1_1_1.add(lblQunLXut);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBackground(new Color(51, 153, 0));
		panel_1_1_1_2.setBounds(20, 443, 209, 52);
		panel.add(panel_1_1_1_2);
		

		lblThngK.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngK.setForeground(Color.WHITE);
		lblThngK.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblThngK.setBounds(10, 10, 189, 37);
		panel_1_1_1_2.add(lblThngK);
		

		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setBounds(86, 516, 85, 21);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 51, 51));
		panel_2.setBounds(246, 20, 212, 139);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Cuốn sách");
		lblNewLabel_2.setBounds(91, 86, 111, 30);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 19));
		
		JLabel lblNewLabel_4 = new JLabel("|");
		lblNewLabel_4.setBounds(70, -15, 22, 144);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 89));
		
		JLabel lblNewLabel_3 = new JLabel("845");
		lblNewLabel_3.setBounds(127, 30, 53, 30);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 26));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_5.setIcon(new ImageIcon(Menu.class.getResource("/image/book.png")));
		lblNewLabel_5.setBounds(-6, 30, 66, 86);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(51, 102, 255));
		panel_2_1.setBounds(480, 20, 212, 139);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("|");
		lblNewLabel_4_1.setBounds(72, -15, 22, 144);
		panel_2_1.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.PLAIN, 89));
		
		JLabel lblNewLabel_2_1 = new JLabel("Nhân viên");
		lblNewLabel_2_1.setBounds(97, 84, 107, 30);
		panel_2_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		
		JLabel lblNewLabel_3_2 = new JLabel("15");
		lblNewLabel_3_2.setBounds(123, 27, 38, 30);
		panel_2_1.add(lblNewLabel_3_2);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.BOLD, 26));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Menu.class.getResource("/image/employee.png")));
		lblNewLabel_6.setBounds(-15, 27, 102, 87);
		panel_2_1.add(lblNewLabel_6);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(51, 204, 102));
		panel_2_1_1.setBounds(716, 20, 212, 139);
		contentPane.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblNewLabel_4_2 = new JLabel("|");
		lblNewLabel_4_2.setBounds(82, -15, 22, 144);
		panel_2_1_1.add(lblNewLabel_4_2);
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 89));
		
		JLabel lblNewLabel_3_1 = new JLabel("46");
		lblNewLabel_3_1.setBounds(139, 26, 38, 30);
		panel_2_1_1.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 26));
		
		JLabel lblNewLabel_2_2 = new JLabel("Hóa đơn");
		lblNewLabel_2_2.setBounds(106, 84, 96, 30);
		panel_2_1_1.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Menu.class.getResource("/image/mail.png")));
		lblNewLabel_7.setBounds(-12, 26, 96, 92);
		panel_2_1_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(10, 59, 45, 13);
		panel_2_1_1.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(246, 169, 685, 374);
		contentPane.add(panel_3);
	}
	public  JLabel manHinhChinh() {
		return lblNewLabel;
	}
	public JLabel quanLySach() {
		return lblQunLSch;
	}
	public JLabel quanLyNhanVien() {
		return lblQunLNhn;
	}
	public JLabel quanLyNhapHang() {
		return lblQunLNhp;
	}
	public JLabel quanLyXuatHang() {
		return lblQunLXut;
	}
	public JLabel thongKe() {
		return lblThngK;
	}
	public JButton logOut() {
		return btnNewButton;
	}
}
