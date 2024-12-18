package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.util.List;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import controller.Book_DAO;
import controller.Employee_DAO;
import controller.Genre_DAO;
import controller.Sale_DAO;
import model.Book;
import model.Employee;
import model.Genre;
import model.SalesInvoice;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagedOut extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagedOut frame = new ManagedOut();
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
	public ManagedOut() {
		setTitle("Managed Sales Invoice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(-12, 0, 242, 570);
		contentPane.add(panel);

		JLabel lblNewLabel_1 = new JLabel(" SunFlower");
		lblNewLabel_1.setIcon(new ImageIcon(ManagedBook.class.getResource("/image/sunflower.png")));
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(20, 10, 177, 68);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 153, 0));
		panel_1.setBounds(20, 78, 209, 52);
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("Màn hình chính");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 5, 189, 37);
		panel_1.add(lblNewLabel);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(51, 153, 0));
		panel_1_1.setBounds(20, 149, 212, 52);
		panel.add(panel_1_1);

		JLabel lblQunLSch = new JLabel("Quản lý sách");
		lblQunLSch.setBackground(new Color(51, 153, 0));
		lblQunLSch.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLSch.setForeground(Color.WHITE);
		lblQunLSch.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLSch.setBounds(10, 10, 192, 37);
		panel_1_1.add(lblQunLSch);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(51, 153, 0));
		panel_1_1_1.setBounds(20, 226, 209, 52);
		panel.add(panel_1_1_1);

		JLabel lblQunLNhn = new JLabel("Quản lý nhân viên");
		lblQunLNhn.setBackground(new Color(102, 102, 255));
		lblQunLNhn.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLNhn.setForeground(Color.WHITE);
		lblQunLNhn.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLNhn.setBounds(10, 10, 189, 37);
		panel_1_1_1.add(lblQunLNhn);

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(new Color(51, 153, 0));
		panel_1_1_2.setBounds(20, 299, 209, 52);
		panel.add(panel_1_1_2);

		JLabel lblQunLNhp = new JLabel("Quản lý nhập hàng");
		lblQunLNhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLNhp.setForeground(Color.WHITE);
		lblQunLNhp.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLNhp.setBounds(10, 10, 185, 37);
		panel_1_1_2.add(lblQunLNhp);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(102, 102, 255));
		panel_1_1_1_1.setBounds(20, 370, 209, 52);
		panel.add(panel_1_1_1_1);

		JLabel lblQunLXut = new JLabel("Quản lý xuất hàng");
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

		JLabel lblThngK = new JLabel("Thống kê");
		lblThngK.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngK.setForeground(Color.WHITE);
		lblThngK.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblThngK.setBounds(10, 10, 189, 37);
		panel_1_1_1_2.add(lblThngK);

		JButton btnNewButton = new JButton("Log out");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setBounds(86, 516, 85, 21);
		panel.add(btnNewButton);

		Sale_DAO s_DAO = new Sale_DAO();
		List<SalesInvoice> listS = (List<SalesInvoice>) s_DAO.selectAll();
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.BOTTOM, null, new Color(0, 0, 255)));
		table.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setRowHeight(26);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Mã đơn", "Ngày xuất", "Tên NV", "Tên sách", "Số lượng", "Giá nhập", "Tổng tiền"
				}
		));
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		for (SalesInvoice s : listS) {
			tableModel.addRow(new Object[] { s.getId(),s.getInvoiceDate(), s.getEmployeeName(), s.getBookName(), s.getQuantity(), s.getPrice(), s.getAmount()});
		}
		TableColumn column0 = table.getColumnModel().getColumn(0); column0.setPreferredWidth(40);
		TableColumn column1 = table.getColumnModel().getColumn(1); column1.setPreferredWidth(100);
		TableColumn column2 = table.getColumnModel().getColumn(2); column2.setPreferredWidth(120);
		TableColumn column3 = table.getColumnModel().getColumn(3); column3.setPreferredWidth(150);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(240, 48, 693, 191);
		contentPane.add(scrollPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(240, 249, 703, 321);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Thông tin hóa đơn");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 10, 243, 36);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("Mã đơn");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(20, 52, 70, 36);
		panel_2.add(lblNewLabel_4);

		textField = new JTextField();
		textField.setBounds(110, 56, 143, 36);
		panel_2.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_4_1 = new JLabel("Ngày xuất");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(20, 122, 92, 36);
		panel_2.add(lblNewLabel_4_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 126, 143, 36);
		panel_2.add(textField_1);

		JLabel lblNewLabel_4_2 = new JLabel("Tên NV");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(20, 188, 109, 36);
		panel_2.add(lblNewLabel_4_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 192, 143, 36);
		panel_2.add(textField_2);

		JLabel lblNewLabel_4_3 = new JLabel("Tên sách");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_3.setBounds(358, 11, 92, 36);
		panel_2.add(lblNewLabel_4_3);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(473, 15, 143, 36);
		panel_2.add(textField_3);

		JLabel lblNewLabel_4_4 = new JLabel("Số lượng");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4.setBounds(358, 68, 137, 36);
		panel_2.add(lblNewLabel_4_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(473, 72, 143, 36);
		panel_2.add(textField_4);

		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(109, 260, 92, 36);
		panel_2.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Sửa");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(301, 260, 92, 36);
		panel_2.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Xóa");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(511, 260, 92, 36);
		panel_2.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("Giá nhập");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4_1.setBounds(358, 126, 137, 36);
		panel_2.add(lblNewLabel_4_4_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(473, 126, 143, 36);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(473, 192, 143, 36);
		panel_2.add(textField_6);
		
		JLabel lblNewLabel_4_4_1_1 = new JLabel("Tổng tiền");
		lblNewLabel_4_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4_1_1.setBounds(358, 188, 137, 36);
		panel_2.add(lblNewLabel_4_4_1_1);

		JLabel lblNewLabel_3 = new JLabel("Danh sách hóa đơn xuất");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(240, 10, 227, 28);
		contentPane.add(lblNewLabel_3);


	}
	public void addBook(Book b) {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.addRow(new Object[] {"c1","c2","c3","c4","c5"});
	}
}