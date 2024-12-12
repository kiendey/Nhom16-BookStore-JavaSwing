package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(194, 22, 124, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tài khoản:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(47, 84, 76, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mật khẩu:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(47, 155, 76, 13);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 155, 151, 19);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(164, 84, 154, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setBounds(67, 205, 85, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Hủy bỏ");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(246, 205, 85, 33);
		contentPane.add(btnNewButton_1);
	}
}
